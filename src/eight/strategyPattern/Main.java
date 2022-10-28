package eight.strategyPattern;

import eight.strategyPattern.util.Remover;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        String text = "This is a text from 20 April 2050";
        String noNr = Remover.remove(text, new NumberRemover());
        String noWs = Remover.remove(text, new WhitespacesRemover());

        // 굳이 NumberRemover, WhitespacesRemover 클래스가 필요가 없음
        String noNr2 = Remover.remove(text, s -> s.replaceAll("\\d", ""));
        String noWs2 = Remover.remove(text, s -> s.replaceAll("\\s", ""));
    }
}
