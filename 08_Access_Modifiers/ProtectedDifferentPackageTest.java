public class ProtectedDifferentPackageTest {

    public static void main(String[] args) {

        ProtectedExample obj = new ProtectedExample();

        // ❌ Cannot access directly
        // System.out.println(obj.number);
        // obj.display();

        System.out.println("Cannot access protected members in different package without inheritance");
    }
}
