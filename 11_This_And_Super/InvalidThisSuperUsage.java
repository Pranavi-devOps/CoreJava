class ParentInvalid {
    ParentInvalid() {
        System.out.println("Parent Constructor");
    }
}

public class InvalidThisSuperUsage extends ParentInvalid {

    InvalidThisSuperUsage() {
        super();
    }

    void display() {

        // ❌ Not allowed inside method:
        // this(); // Compilation error
        // super(); // Compilation error

        System.out.println("this() and super() cannot be used inside methods");
    }

    public static void main(String[] args) {
        InvalidThisSuperUsage obj = new InvalidThisSuperUsage();
        obj.display();
    }
}
