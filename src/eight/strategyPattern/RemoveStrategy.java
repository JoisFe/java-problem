    package eight.strategyPattern;

/**
 * @author : 조재철
 * @since 1.0
 */
@FunctionalInterface
public interface RemoveStrategy {
    String execute(String s);
}
