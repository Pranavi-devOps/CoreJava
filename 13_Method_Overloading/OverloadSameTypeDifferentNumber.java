public class OverloadSameTypeDifferentNumber {

    void print(int a, int b) {
        System.out.println("Integers: " + (a + b));
    }

    void print(double a, double b) {
        System.out.println("Doubles: " + (a + b));
    }

    public static void main(String[] args) {

        OverloadSameTypeDifferentNumber obj = new OverloadSameTypeDifferentNumber();
        obj.print(10, 20);
        obj.print(5.5, 2.5);
    }
}
