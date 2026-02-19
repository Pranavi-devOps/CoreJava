interface PartialInterface {
    void method1();

    void method2();
}

abstract class PartialImplementation implements PartialInterface {

    public void method1() {
        System.out.println("Only method1 implemented");
    }
}
