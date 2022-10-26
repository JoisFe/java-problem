package eight.factoryPattern;

/**
 * @author : 조재철
 * @since 1.0
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);
}
