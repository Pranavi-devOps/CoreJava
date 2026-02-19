public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(int a) {
        System.out.println("One Argument Constructor: " + a);
    }

    ConstructorOverloading(int a, int b) {
        System.out.println("Two Argument Constructor: " + (a + b));
    }

    public static void main(String[] args) {

        new ConstructorOverloading();
        new ConstructorOverloading(10);
        new ConstructorOverloading(10, 20);
    }
}
