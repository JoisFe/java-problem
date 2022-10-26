package eight.functionalInterface;

import eight.functionalInterface.predicate.MelonPredicate;
import eight.functionalInterface.predicate.impl.GacMelonPredicate;
import eight.functionalInterface.predicate.impl.HugeMelonPredicate;
import eight.functionalInterface.predicate.util.FiltersFinal;
import eight.functionalInterface.predicate.util.FiltersPost;
import eight.functionalInterface.predicate.util.FiltersPrev;
import java.util.List;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        List<Melon> melons = List.of(new Melon("bailans", 100, "korean"), new Melon("haha", 200, "hoho"),
            new Melon("watermelon", 1000, "europe"),
            new Melon("bailans", 600, "korean"), new Melon("gac", 100, "korean"), new Melon("haha", 1000, "europe"));

        List<Melon> bailans = FiltersPrev.filterByType(melons, "bailans");

        for (Melon bailan : bailans) {
            System.out.println(bailan.toString());
        }

        System.out.println();

        List<Melon> gacs = FiltersPost.filterMelons(melons, new GacMelonPredicate());
        List<Melon> huges = FiltersPost.filterMelons(melons, new HugeMelonPredicate());

        for (Melon gac : gacs) {
            System.out.println(gac.toString());
        }

        System.out.println();

        for (Melon huge : huges) {
            System.out.println(huge.toString());
        }

        System.out.println();

        List<Melon> europeans = FiltersPost.filterMelons(melons, new MelonPredicate() {

            @Override
            public boolean test(Melon melon) {
                return "europe".equalsIgnoreCase(melon.getOrigin());
            }
        });

        for (Melon european : europeans) {
            System.out.println(european.toString());
        }

        System.out.println();

        List<Melon> europeansLambda = FiltersPost
            .filterMelons(melons, m -> "europe".equalsIgnoreCase(m.getOrigin()));

        List<Melon> watermelons = FiltersFinal.filter(melons, (Melon m) -> "watermelon".equalsIgnoreCase(m.getType()));

        for (Melon watermelon : watermelons) {
            System.out.println(watermelon.toString());
        }
    }

}
