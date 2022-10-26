package eight.executeAroundPattern.util;

import eight.executeAroundPattern.ScannerDoubleFunction;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Doubles {

    public static double read(ScannerDoubleFunction snf) throws IOException {
        try (Scanner scanner = new Scanner(
            Path.of("doubles.txt"), StandardCharsets.UTF_8
        )) {
            return snf.readDouble(scanner);
        }
    }

    public static double getFirst(Scanner scanner) {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }

        return Double.NaN;
    }

    public static double sumAll(Scanner scanner) {
        double sum = 0.0d;

        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
        }

        return sum;
    }
}
