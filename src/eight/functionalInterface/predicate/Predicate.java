package eight.functionalInterface.predicate;

/**
 * @author : 조재철
 * @since 1.0
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
