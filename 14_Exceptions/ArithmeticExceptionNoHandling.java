public class ArithmeticExceptionNoHandling {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int result = a / b; // ArithmeticException
        System.out.println(result);
    }
}
