class ArithmeticDemo {

    void calculate(int a, int b) {

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {

        ArithmeticDemo obj = new ArithmeticDemo();
        obj.calculate(10, 5);
    }
}
