package java8_features;

@FunctionalInterface
public interface Calculator {
    void reckon(int a, int b); //abstract method

    // It can contain any number of Object class methods.
//    int hashCode();
//    String toString();
//    boolean equals(Object obj);
}
