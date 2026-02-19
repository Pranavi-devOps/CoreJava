interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

public class MultipleInterfaces implements Interface1, Interface2 {

    public void method1() {
        System.out.println("Interface1 method");
    }

    public void method2() {
        System.out.println("Interface2 method");
    }

    public static void main(String[] args) {
        MultipleInterfaces obj = new MultipleInterfaces();
        obj.method1();
        obj.method2();
    }
}
