public class InheritanceMain {

    public static void main(String[] args) {

        // Object of ClassA
        ClassA a = new ClassA();
        a.methodA1();
        a.methodA2();
        a.commonMethod();

        System.out.println();

        // Object of ClassB
        ClassB b = new ClassB();
        b.methodB1();
        b.methodB2();
        b.commonMethod();

        System.out.println();

        // Object of ClassC
        ClassC c = new ClassC();
        c.methodC1();
        c.methodC2();
        c.commonMethod();

        System.out.println();

        // Runtime Polymorphism (Super class reference)
        ClassA ref1 = new ClassB();
        ref1.commonMethod();

        ClassA ref2 = new ClassC();
        ref2.commonMethod();
    }
}
