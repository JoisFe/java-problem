package eight.strategyPattern.util;

import eight.strategyPattern.RemoveStrategy;

/**
 * @author : 조재철
 * @since 1.0
 */
public final class Remover {
    private Remover() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static String remove(String s, RemoveStrategy strategy) {
        return strategy.execute(s);
    }

}
