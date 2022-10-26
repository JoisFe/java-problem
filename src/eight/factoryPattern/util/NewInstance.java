package eight.factoryPattern.util;

import eight.factoryPattern.util.fruit.Cantaloupe;
import eight.factoryPattern.util.fruit.Fruit;
import eight.factoryPattern.util.fruit.Gac;
import eight.factoryPattern.util.fruit.Hemi;

/**
 * @author : 조재철
 * @since 1.0
 */
public class NewInstance {
    public static Fruit newInstance(Class<?> clazz) {
        switch (clazz.getSimpleName()) {
            case "Gac":
                return new Gac(); // break;
            case "Hemi":
                return new Hemi(); // break;
            case "Cantaloupe":
                return new Cantaloupe();
            default:
                throw new IllegalArgumentException("Invalid clazz argument: " + clazz);
        }
    }

}
