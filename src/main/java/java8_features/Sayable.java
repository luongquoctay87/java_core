package java8_features;

@FunctionalInterface
public interface Sayable {
    void say ();
}

/*
- Lambda expression is new feature of Java 8 SE, It provides a clear and concise way to present one method interface using an expression, it save a lot of code.
in lambda expression we don't need to define method one again, we've just write the implementation code
Lambda expression provides implementation of functional interface. An interface which has only one abstract method call functional interface

- Java Functional Interfaces
An Interface that contains exactly one abstract method is known as functional interface.
It can have any number of default, static methods but can contain only one abstract method. It can also declare methods of object class.
 */
