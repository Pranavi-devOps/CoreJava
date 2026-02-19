interface InterfaceFieldsExample {

    int a = 10;
    int b = 20;
}

public class InterfaceFieldsExampleImpl implements InterfaceFieldsExample {

    public static void main(String[] args) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
