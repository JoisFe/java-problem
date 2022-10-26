package eight.factoryPattern;

import eight.factoryPattern.util.fruit.Cantaloupe;
import eight.factoryPattern.util.fruit.Fruit;
import eight.factoryPattern.util.fruit.Gac;
import eight.factoryPattern.util.fruit.Hemi;
import eight.factoryPattern.util.fruit.Melon;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author : 조재철
 * @since 1.0
 */
public class MelonFactory {

    private MelonFactory() {
        throw new AssertionError("Cannot be instantiated");
    }

    private static final TriFunction<String, Integer, String, Melon> MELON = Melon::new;

    private static final Map<String, Supplier<Fruit>> MELONS = Map.of("Gac", Gac::new, "Hemi", Hemi::new, "Cantaloupe",
        Cantaloupe::new);

    public static Fruit newInstance(String name, int weight, String color) {
        return MELON.apply(name, weight, name);
    }

    public static Fruit newInstance(Class<?> clazz) {
        Supplier<Fruit> supplier = MELONS.get(clazz.getSimpleName());

        if (supplier == null) {
            throw new IllegalArgumentException("Invalid clazz argument: " + clazz);
        }

        return supplier.get();
    }

}
