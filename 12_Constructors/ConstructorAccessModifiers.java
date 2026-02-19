public class ConstructorAccessModifiers {

    public ConstructorAccessModifiers() {
        System.out.println("Public Constructor");
    }

    protected ConstructorAccessModifiers(int a) {
        System.out.println("Protected Constructor");
    }

    ConstructorAccessModifiers(String s) {
        System.out.println("Default Constructor");
    }

    private ConstructorAccessModifiers(double d) {
        System.out.println("Private Constructor");
    }

    public static void main(String[] args) {

        new ConstructorAccessModifiers();
        new ConstructorAccessModifiers(10);
        new ConstructorAccessModifiers("Hello");
        new ConstructorAccessModifiers(5.5);
    }
}
