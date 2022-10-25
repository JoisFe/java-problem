package one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : 조재철
 * @since 1.0
 */
public class CountingChar {

    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch : str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        CountingChar countingChar = new CountingChar();

        System.out.println(countingChar.countDuplicateCharacters(str));
    }

}
