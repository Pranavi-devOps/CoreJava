class ParentConstructor {
    ParentConstructor() {
        System.out.println("Parent Constructor Called");
    }
}

public class SuperConstructorDemo extends ParentConstructor {

    SuperConstructorDemo() {
        super(); // Calling parent constructor
        System.out.println("Child Constructor Called");
    }

    public static void main(String[] args) {
        new SuperConstructorDemo();
    }
}
