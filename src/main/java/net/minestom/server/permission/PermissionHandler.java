package net.minestom.server.permission;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * Represents an object which can have permissions.
 */
public interface PermissionHandler {

    /**
     * Returns all permissions associated to this handler.
     * The returned collection should be modified only by subclasses.
     *
     * @return the permissions of this handler.
     */
    @NotNull
    Set<Permission> getAllPermissions();

    /**
     * Adds a {@link Permission} to this handler.
     *
     * @param permission the permission to add
     */
    default void addPermission(@NotNull Permission permission) {
        getAllPermissions().add(permission);
    }

    /**
     * Removes a {@link Permission} from this handler.
     *
     * @param permission the permission to remove
     */
    default void removePermission(@NotNull Permission permission) {
        getAllPermissions().remove(permission);
    }

    /**
     * Gets if this handler has the permission {@code permission}.
     * <p>
     * Uses {@link Permission#equals(Object)} internally.
     *
     * @param permission the permission to check
     * @return true if the handler has the permission, false otherwise
     */
    default boolean hasPermission(@NotNull Permission permission) {
        for (Permission permissionLoop : getAllPermissions()) {
            if (permissionLoop.equals(permission)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the {@link Permission} with the name {@code permissionName}.
     * <p>
     * Useful if you want to retrieve the permission data.
     *
     * @param permissionName the permission name
     * @return the permission from its name, null if not found
     */
    @Nullable
    default Permission getPermission(@NotNull String permissionName) {
        for (Permission permission : getAllPermissions()) {
            // Verify permission name equality
            if (permission.getPermissionName().equals(permissionName)) {
                return permission;
            }
        }
        return null;
    }

    /**
     * Gets if this handler has the permission with the name {@code permissionName} and which verify the optional
     * {@link PermissionVerifier}.
     *
     * @param permissionName     the permission name
     * @param permissionVerifier the optional verifier,
     *                           null means that only the permission name will be used
     * @return true if the handler has the permission, false otherwise
     */
    default boolean hasPermission(@NotNull String permissionName, @Nullable PermissionVerifier permissionVerifier) {
        final Permission permission = getPermission(permissionName);

        if (permission != null) {
            // Verify using the permission verifier
            return permissionVerifier != null ?
                    permissionVerifier.isValid(permission.getNBTData()) :
                    true;
        }
        return false;
    }

    /**
     * Gets if this handler has the permission with the name {@code permissionName}.
     *
     * @param permissionName the permission name
     * @return true if the handler has the permission, false otherwise
     */
    default boolean hasPermission(@NotNull String permissionName) {
        return hasPermission(permissionName, null);
    }

}