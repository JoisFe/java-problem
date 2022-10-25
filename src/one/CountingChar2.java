package one;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author : 조재철
 * @since 1.0
 */
public class CountingChar2 {

    public Map<Character, Long> countDuplicateCharacters(String str) {
        Map<Character, Long> result = str.chars()
                                         .mapToObj(c -> (char) c)
                                         .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        CountingChar2 countingChar2 = new CountingChar2();

        System.out.println(countingChar2.countDuplicateCharacters(str));
    }

}
