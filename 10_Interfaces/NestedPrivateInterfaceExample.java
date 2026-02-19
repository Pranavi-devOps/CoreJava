public class NestedPrivateInterfaceExample {

    private interface PrivateInterface {
        int value = 50;
    }

    public static void main(String[] args) {
        System.out.println("Value: " + PrivateInterface.value);
    }
}
