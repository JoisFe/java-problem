package eight.functionalInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 조재철
 * @since 1.0
 */
public class FiltersPrev {

    public static List<Melon> filterByType(List<Melon> melons, String type) {
        List<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (melon != null && type.equalsIgnoreCase(melon.getType())) {
                result.add(melon);
            }
        }

        return result;
    }

    public static List<Melon> filterByWeight(List<Melon> melons, int weight) {
        List<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (melon != null && melon.getWeight() == weight) {
                result.add(melon);
            }
        }

        return result;
    }

    public static List<Melon> filterByTypeAndWeight(List<Melon> melons, String type, int weight) {
        List<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (melon != null && type.equalsIgnoreCase(melon.getType()) && melon.getWeight() == weight) {
                result.add(melon);
            }
        }

        return result;
    }

}
