import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner Application
 * Final Version (UC1 → UC7)
 * Demonstrates OOP Design + Git Workflow
 *
 * @author Danya
 * @version 1.0
 */

public class OOPSBannerApp {

    // ===============================
    // Character Pattern Class
    // ===============================
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // ===============================
    // Pattern Storage Class
    // ===============================
    static class CharacterPatternMap {

        private static Map<Character, CharacterPattern> patternMap =
                new HashMap<>();

        static {

            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "***** ",
                    "*    *",
                    "*    *",
                    "***** ",
                    "*     ",
                    "*     ",
                    "*     "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            }));
        }

        public static CharacterPattern getPattern(char ch) {
            return patternMap.get(ch);
        }
    }

    // ===============================
    // Banner Display Logic
    // ===============================
    public static void displayBanner(String text) {

        for (int row = 0; row < 7; row++) {

            for (char ch : text.toCharArray()) {

                CharacterPattern cp =
                        CharacterPatternMap.getPattern(ch);

                if (cp != null) {
                    System.out.print(cp.getPattern()[row] + " ");
                }
            }
            System.out.println();
        }
    }

    // ===============================
    // MAIN METHOD
    // ===============================
    public static void main(String[] args) {

        // UC1 → Simple Output
        System.out.println("Printing OOPS normally:\n");
        System.out.println("OOPS\n");

        // UC7 → OOPS Banner
        System.out.println("OOPS Banner:\n");

        displayBanner("OOPS");
    }
}