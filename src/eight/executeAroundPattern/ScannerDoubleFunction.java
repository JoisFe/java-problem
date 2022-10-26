package eight.executeAroundPattern;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author : 조재철
 * @since 1.0
 */
@FunctionalInterface
public interface ScannerDoubleFunction {
    double readDouble(Scanner scanner) throws IOException;
}
