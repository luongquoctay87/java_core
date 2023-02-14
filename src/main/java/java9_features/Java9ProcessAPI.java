package java9_features;

/**
 * Java 9 Process API Improvement
 * Java has improved its process API in Java 9 version that helps to manage and control operating system processes.
 * ProcessHandle helps to handle and control processes. We can monitor processes, list its children, get information etc.
 * This interface contains static factory methods that return instances that are value-based, immutable and thread-safe.
 */
public class Java9ProcessAPI {

    public static void main(String[] args) {
        ProcessHandle processHandle = ProcessHandle.current();
        System.out.println("PID: " + processHandle.pid());
        System.out.println("Direct Children: " + processHandle.children());
        System.out.println("Class Name: " + processHandle.getClass());
        System.out.println("Info: " + processHandle.info());
        System.out.println("Info: " + processHandle.isAlive());

    }
}
