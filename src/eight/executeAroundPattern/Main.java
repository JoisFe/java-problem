package eight.executeAroundPattern;

import static eight.executeAroundPattern.util.Doubles.getFirst;
import static eight.executeAroundPattern.util.Doubles.sumAll;

import eight.executeAroundPattern.util.Doubles;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(
            Path.of("doubles.txt"), StandardCharsets.UTF_8)) {
            while (scanner.hasNextDouble()) {
                System.out.println(scanner.nextDouble());
            }
        }

        double singleDouble = Doubles.read((Scanner sc) -> getFirst(sc));

        double sumAllDoubles = Doubles.read((Scanner sc) -> sumAll(sc));
    }
}
