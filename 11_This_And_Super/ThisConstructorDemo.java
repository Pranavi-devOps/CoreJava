public class ThisConstructorDemo {

    ThisConstructorDemo() {
        this(10); // Calling parameterized constructor
        System.out.println("Default Constructor");
    }

    ThisConstructorDemo(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new ThisConstructorDemo();
    }
}
