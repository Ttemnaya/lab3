

public class BeginStringFilter implements IFilter {
    private String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }
}
