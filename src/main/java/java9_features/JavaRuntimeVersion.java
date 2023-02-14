package java9_features;

/**
 * Show Java runtime version
 */
public class JavaRuntimeVersion {

    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("version() =" + version.version());
        System.out.println("build() =" + version.build());
        System.out.println("major() =" + version.major());
        System.out.println("minor() =" + version.minor());
        System.out.println("hashCode() =" + version.hashCode());
        System.out.println("pre() =" + version.pre());
        System.out.println("security() =" + version.security());

    }
}
