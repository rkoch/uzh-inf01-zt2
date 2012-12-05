package io.rko.uzh.zt2.version;


/**
 * Contains version information for the package Zwischentest 2.
 *
 * @author auto-generated
 * @version 0.1.0
 */
public final class PackageVersion {

    /** The name of the package (Zwischentest 2). */
    private static final String mPackageName = "Zwischentest 2";

    /** The version of the package (0.1.0). */
    private static final String mVersion     = "0.1.0";

    /** The build date of the package (05.12.2012 22:42:26). */
    private static final String mBuildDate   = "05.12.2012 22:42:26";


    /**
     * Gets the package name.
     *
     * @return String The package name.
     */
    public static String getPackageName() {
        return mPackageName;
    }

    /**
     * Gets the package version.
     *
     * @return String The package version.
     */
    public static String getPackageVersion() {
        return mPackageName + " V" + mVersion + " [" + mBuildDate + "]";
    }

    /**
     * Gets the version.
     *
     * @return String The version.
     */
    public static String getVersion() {
        return mVersion;
    }

    /**
     * Gets the build date.
     *
     * @return String The build date.
     */
    public static String getBuildDate() {
        return mBuildDate;
    }

}
