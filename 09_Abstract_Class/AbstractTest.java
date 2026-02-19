public class AbstractTest {

    public static void main(String[] args) {

        // Parent reference, child object
        AbstractParent obj = new AbstractChild();

        obj.abstractMethod();
        obj.normalMethod();
    }
}
