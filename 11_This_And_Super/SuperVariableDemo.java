class ParentSuper {
    int number = 50;
}

public class SuperVariableDemo extends ParentSuper {

    int number = 100;

    void display() {
        System.out.println("Child number: " + this.number);
        System.out.println("Parent number: " + super.number);
    }

    public static void main(String[] args) {
        SuperVariableDemo obj = new SuperVariableDemo();
        obj.display();
    }
}
