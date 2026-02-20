public class GenerateNullPointerException {

    public static void main(String[] args) {

        String s = getString();
        System.out.println(s.length());
    }

    static String getString() {
        return null;
    }
}