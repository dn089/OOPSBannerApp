class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class UC7_OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });

        String[] o = O.getPattern();
        String[] p = P.getPattern();
        String[] s = S.getPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + p[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}