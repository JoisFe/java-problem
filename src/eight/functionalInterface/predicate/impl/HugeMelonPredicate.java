package eight.functionalInterface.predicate.impl;

import eight.functionalInterface.Melon;
import eight.functionalInterface.predicate.MelonPredicate;

/**
 * @author : 조재철
 * @since 1.0
 */
public class HugeMelonPredicate implements MelonPredicate {

    @Override
    public boolean test(Melon melon) {
        return melon.getWeight() > 500;
    }
}
