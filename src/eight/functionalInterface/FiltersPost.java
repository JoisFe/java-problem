package eight.functionalInterface;

import eight.functionalInterface.predicate.MelonPredicate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : 조재철
 * @since 1.0
 */
public class FiltersPost {

    public static List<Melon> filterMelons(List<Melon> melons, MelonPredicate predicate) {
        List<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (melon != null && predicate.test(melon)) {
                result.add(melon);
            }
        }

        return result;
    }

}
