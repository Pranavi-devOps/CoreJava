public class RuntimePolymorphism {

    public static void main(String[] args) {

        ClassA ref1 = new ClassB();
        ClassA ref2 = new ClassC();

        System.out.println("ref1 number: " + ref1.number);
        System.out.println("ref2 number: " + ref2.number);
    }
}
