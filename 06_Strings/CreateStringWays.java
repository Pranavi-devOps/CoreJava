public class CreateStringWays {

    public static void main(String[] args) {

        // Using String literal
        String s1 = "Hello";

        // Using new keyword
        String s2 = new String("World");

        // Using char array
        char[] ch = { 'J', 'a', 'v', 'a' };
        String s3 = new String(ch);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
