package eight.factoryPattern;

import eight.factoryPattern.util.fruit.Gac;
import eight.factoryPattern.util.fruit.Melon;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        Gac gac = (Gac) MelonFactory.newInstance(Gac.class);
        Melon melon = (Melon) MelonFactory.newInstance("Gac", 2000, "red");

        System.out.println("Gac " + gac);
        System.out.println("Melon " + melon);
    }
}
