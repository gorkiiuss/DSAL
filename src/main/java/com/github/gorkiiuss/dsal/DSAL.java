package com.github.gorkiiuss.dsal;

/**
 * The DSAL (Data Structures and Algorithms Library) provides a collection
 * of utility elements, commonly used algorithms, and ready-to-use design patterns
 * for Java developers.
 * <p>
 * The library is designed to be easily understandable and accessible to developers
 * of all skill levels.
 * </p>
 *
 * @version 0.0.0
 * @since 27/09/2023
 */
public class DSAL {
    /**
     * The major version number.
     */
    public static final int MAJOR_VERSION = 0;

    /**
     * The minor version number.
     */
    public static final int MINOR_VERSION = 0;

    /**
     * The patch version number.
     */
    public static final int PATCH_VERSION = 0;

    /**
     * Returns the full version string.
     *
     * @return The version string in the format "MAJOR.MINOR.PATCH".
     */
    public static String getVersion() {
        return String.format("%d.%d.%d", MAJOR_VERSION, MINOR_VERSION, PATCH_VERSION);
    }
}


