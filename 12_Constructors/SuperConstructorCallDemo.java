class ParentConstructorDemo {

    ParentConstructorDemo() {
        System.out.println("Parent Default Constructor");
    }

    ParentConstructorDemo(int x) {
        System.out.println("Parent Argument Constructor: " + x);
    }
}

public class SuperConstructorCallDemo extends ParentConstructorDemo {

    SuperConstructorCallDemo() {
        super(); // calling default parent constructor
        System.out.println("Child Default Constructor");
    }

    SuperConstructorCallDemo(int x) {
        super(x); // calling argument parent constructor
        System.out.println("Child Argument Constructor");
    }

    public static void main(String[] args) {

        new SuperConstructorCallDemo();
        new SuperConstructorCallDemo(50);
    }
}
