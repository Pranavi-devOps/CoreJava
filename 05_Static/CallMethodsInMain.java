public class CallMethodsInMain {

    static void staticMethod() {
        System.out.println("Static Method");
    }

    void instanceMethod() {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {

        // Call static method
        staticMethod();

        // Call instance method
        CallMethodsInMain obj = new CallMethodsInMain();
        obj.instanceMethod();
    }
}
