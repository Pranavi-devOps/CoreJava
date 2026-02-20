public class ThrowsMethodWithoutTry {

    static void divide() {
        int b = 0;
        System.out.println(10 / b);
    }

    public static void main(String[] args) {
        divide();
    }
}