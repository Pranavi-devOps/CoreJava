public class ClassB extends ClassA {

    int number = 20;

    void methodB1() {
        System.out.println("ClassB - Specific Method 1");
    }

    void methodB2() {
        System.out.println("ClassB - Specific Method 2");
    }

    @Override
    void commonMethod() {
        System.out.println("ClassB - Common Method");
    }
}
