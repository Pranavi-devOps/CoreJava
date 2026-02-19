public class ThrowsMethodWithoutTry {

    static void divide() throws ArithmeticException {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        divide(); // No try block
    }
}
