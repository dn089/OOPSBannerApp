import java.util.Map;

public class Banner {

    private Map<Character, String[]> patterns;

    // Constructor
    public Banner(Map<Character, String[]> patterns) {
        this.patterns = patterns;
    }

    // Display Banner
    public void display(String text) {

        for (int row = 0; row < 7; row++) {

            for (char ch : text.toCharArray()) {

                if (patterns.containsKey(ch)) {
                    System.out.print(patterns.get(ch)[row] + " ");
                }
            }
            System.out.println();
        }
    }
}