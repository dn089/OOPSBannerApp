public class UC5_BannerEngine {

    public static void main(String[] args) {

        String[] O = {
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };

        String[] P = {
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        };

        String[] S = {
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        };

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + P[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}