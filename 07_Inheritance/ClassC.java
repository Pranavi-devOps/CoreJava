public class ClassC extends ClassB {

    int number = 30;

    void methodC1() {
        System.out.println("ClassC - Specific Method 1");
    }

    void methodC2() {
        System.out.println("ClassC - Specific Method 2");
    }

    @Override
    void commonMethod() {
        System.out.println("ClassC - Common Method");
    }
}
