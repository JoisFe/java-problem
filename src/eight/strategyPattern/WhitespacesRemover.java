package eight.strategyPattern;

/**
 * @author : 조재철
 * @since 1.0
 */
public class WhitespacesRemover implements RemoveStrategy {

    @Override
    public String execute(String s) {
        return s.replaceAll("\\s", "");
    }
}
