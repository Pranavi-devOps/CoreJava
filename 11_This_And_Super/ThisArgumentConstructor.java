public class ThisArgumentConstructor {

    ThisArgumentConstructor() {
        this(20, 30);
        System.out.println("Default Constructor");
    }

    ThisArgumentConstructor(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        new ThisArgumentConstructor();
    }
}
