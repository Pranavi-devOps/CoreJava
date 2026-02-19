public class PrivateSubClass extends PrivateExample {

    public static void main(String[] args) {

        PrivateSubClass obj = new PrivateSubClass();

        // ❌ Cannot access private members directly
        // System.out.println(obj.number); // ERROR
        // obj.display(); // ERROR

        System.out.println("Cannot access private members in subclass");
    }
}
