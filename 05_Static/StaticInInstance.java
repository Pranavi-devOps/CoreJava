public class StaticInInstance {

    static int a = 10;
    static int b = 20;

    void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        StaticInInstance obj = new StaticInInstance();
        obj.display();
    }
}
