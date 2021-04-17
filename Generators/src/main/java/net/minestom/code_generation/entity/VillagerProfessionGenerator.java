package net.minestom.code_generation.entity;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.squareup.javapoet.*;
import net.minestom.code_generation.MinestomCodeGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class VillagerProfessionGenerator extends MinestomCodeGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(VillagerProfessionGenerator.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final File DEFAULT_INPUT_FILE = new File(DEFAULT_SOURCE_FOLDER_ROOT + "/json", "villager_professions.json");
    private final File villagerProfessionsFile;
    private final File outputFolder;

    public VillagerProfessionGenerator() {
        this(null, null);
    }

    public VillagerProfessionGenerator(@Nullable File villagerProfessionsFile) {
        this(villagerProfessionsFile, null);
    }

    public VillagerProfessionGenerator(@Nullable File villagerProfessionsFile, @Nullable File outputFolder) {
        this.villagerProfessionsFile = Objects.requireNonNullElse(villagerProfessionsFile, DEFAULT_INPUT_FILE);
        this.outputFolder = Objects.requireNonNullElse(outputFolder, DEFAULT_OUTPUT_FOLDER);
    }

    @Override
    public void generate() {
        if (!villagerProfessionsFile.exists()) {
            LOGGER.error("Failed to find villager_professions.json.");
            LOGGER.error("Stopped code generation for villager professions.");
            return;
        }
        if (!outputFolder.exists() && !outputFolder.mkdirs()) {
            LOGGER.error("Output folder for code generation does not exist and could not be created.");
            return;
        }
        // Important classes we use alot
        ClassName namespaceIDClassName = ClassName.get("net.minestom.server.utils", "NamespaceID");
        ClassName rawVillagerProfessionDataClassName = ClassName.get("net.minestom.server.raw_data", "RawVillagerProfessionData");

        JsonArray villagerProfessions;
        try {
            villagerProfessions = GSON.fromJson(new JsonReader(new FileReader(villagerProfessionsFile)), JsonArray.class);
        } catch (FileNotFoundException e) {
            LOGGER.error("Failed to find villager_professions.json.");
            LOGGER.error("Stopped code generation for villager professions.");
            return;
        }
        ClassName villagerProfessionClassName = ClassName.get("net.minestom.server.entity.metadata.villager", "VillagerProfession");

        // Particle
        TypeSpec.Builder villagerProfessionClass = TypeSpec.classBuilder(villagerProfessionClassName)
                .addSuperinterface(ClassName.get("net.kyori.adventure.key", "Keyed"))
                .addModifiers(Modifier.PUBLIC).addJavadoc("AUTOGENERATED");
        villagerProfessionClass.addField(
                FieldSpec.builder(namespaceIDClassName, "id")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).addAnnotation(NotNull.class).build()
        );
        villagerProfessionClass.addField(
                FieldSpec.builder(rawVillagerProfessionDataClassName, "villagerProfessionData")
                        .initializer("new $T()", rawVillagerProfessionDataClassName)
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .addAnnotation(NotNull.class)
                        .build()
        );
        villagerProfessionClass.addMethod(
                MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(namespaceIDClassName, "id").addAnnotation(NotNull.class).build())
                        .addStatement("this.id = id")
                        .addModifiers(Modifier.PROTECTED)
                        .build()
        );
        // Override key method (adventure)
        villagerProfessionClass.addMethod(
                MethodSpec.methodBuilder("key")
                        .returns(ClassName.get("net.kyori.adventure.key", "Key"))
                        .addAnnotation(Override.class)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getId method
        villagerProfessionClass.addMethod(
                MethodSpec.methodBuilder("getId")
                        .returns(namespaceIDClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getVillagerProfessionData method
        villagerProfessionClass.addMethod(
                MethodSpec.methodBuilder("getVillagerProfessionData")
                        .returns(rawVillagerProfessionDataClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.villagerProfessionData")
                        .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                        .build()
        );
        // toString method
        villagerProfessionClass.addMethod(
                MethodSpec.methodBuilder("toString")
                        .addAnnotation(NotNull.class)
                        .addAnnotation(Override.class)
                        .returns(String.class)
                        // this resolves to [Namespace]
                        .addStatement("return \"[\" + this.id + \"]\"")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // values method
        villagerProfessionClass.addMethod(
                MethodSpec.methodBuilder("values")
                        .addAnnotation(NotNull.class)
                        .returns(ParameterizedTypeName.get(ClassName.get(List.class), villagerProfessionClassName))
                        .addStatement("return $T.getVillagerProfessions()", ClassName.get("net.minestom.server.registry", "Registries"))
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        CodeBlock.Builder staticBlock = CodeBlock.builder();
        // Use data
        for (JsonElement vp : villagerProfessions) {
            JsonObject villagerProfession = vp.getAsJsonObject();

            String villagerProfessionName = villagerProfession.get("name").getAsString();

            villagerProfessionClass.addField(
                    FieldSpec.builder(
                            villagerProfessionClassName,
                            villagerProfessionName
                    ).initializer(
                            "new $T($T.from($S))",
                            villagerProfessionClassName,
                            namespaceIDClassName,
                            villagerProfession.get("id").getAsString()
                    ).addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).build()
            );
            ClassName registryClassName = ClassName.get("net.minestom.server.registry", "Registries");
            // Add to static init.
            staticBlock.addStatement("$T.registerVillagerProfession($N)", registryClassName, villagerProfessionName);
        }

        villagerProfessionClass.addStaticBlock(staticBlock.build());

        // Write files to outputFolder
        writeFiles(
                Collections.singletonList(
                        JavaFile.builder("net.minestom.server.entity.metadata.villager", villagerProfessionClass.build()).build()
                ),
                outputFolder
        );
    }
}
