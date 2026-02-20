public class FinallyBlockDemo {

    public static void main(String[] args) {

        try {
            int b = 0;
            System.out.println(10 / b);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
