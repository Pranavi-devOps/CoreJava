public class ProtectedDifferentPackageSubclass extends ProtectedExample {

    public static void main(String[] args) {

        ProtectedDifferentPackageSubclass obj = new ProtectedDifferentPackageSubclass();

        System.out.println(obj.number);
        obj.display();
    }
}
