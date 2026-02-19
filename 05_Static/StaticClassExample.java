public class StaticClassExample {

    // Static variables
    static int a = 10;
    static int b = 20;

    // Instance variables
    int x = 100;
    int y = 200;

    // Static methods
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // Instance methods
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {
        StaticClassExample obj = new StaticClassExample();
        staticMethod1();
        staticMethod2();
        obj.instanceMethod1();
    }
}