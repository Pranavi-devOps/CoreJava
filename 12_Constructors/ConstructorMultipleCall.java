public class ConstructorMultipleCall {

    ConstructorMultipleCall() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {

        ConstructorMultipleCall obj = new ConstructorMultipleCall();

        // Constructor cannot be called again directly
        // obj.ConstructorMultipleCall(); // ❌ Not allowed

        // Only way is creating new object
        obj = new ConstructorMultipleCall();
    }
}
