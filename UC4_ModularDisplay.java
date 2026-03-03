public class UC4_ModularDisplay {

    public static void display(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String[] banner = {
                "OOPS",
                "OOPS",
                "OOPS",
                "OOPS"
        };

        display(banner);
    }
}