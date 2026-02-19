public class RegexMatch {

    public static void main(String[] args) {

        String s = "12345";
        boolean result = s.matches("\\d+");

        System.out.println("Matches digits: " + result);
    }
}
