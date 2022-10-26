package eight.functionalInterface.predicate.util;

import eight.functionalInterface.predicate.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : 조재철
 * @since 1.0
 */
public class FiltersFinal {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            if (t != null && predicate.test(t)) {
                result.add(t);
            }
        }

        return result;
    }

}
