package java9_features;

/**
 *
 * @param <T> Diamond operation
 */
public abstract class Sayable<T> {
    abstract T say(String message);
}
