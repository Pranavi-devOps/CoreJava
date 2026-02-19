interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

public class InterfaceInheritance implements ChildInterface {

    public void parentMethod() {
        System.out.println("Parent Interface Method");
    }

    public void childMethod() {
        System.out.println("Child Interface Method");
    }

    public static void main(String[] args) {
        InterfaceInheritance obj = new InterfaceInheritance();
        obj.parentMethod();
        obj.childMethod();
    }
}
