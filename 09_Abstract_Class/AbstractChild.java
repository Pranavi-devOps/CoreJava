public class AbstractChild extends AbstractParent {

    // Implementing abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract Method Implemented in Child");
    }

    public static void main(String[] args) {

        // 🔹 Object using parent reference
        AbstractParent obj1 = new AbstractChild();

        // Access non-abstract method
        obj1.normalMethod();

        System.out.println();

        // 🔹 Object using child reference
        AbstractChild obj2 = new AbstractChild();

        // Calling abstract method
        obj2.abstractMethod();

        // Calling non-abstract method
        obj2.normalMethod();
    }
}
