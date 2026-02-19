public class ThisCurrentClassDemo {

    int number = 100;
    String name = "Pranavi";

    void display() {

        // Using this
        System.out.println("Using this:");
        System.out.println(this.number);
        System.out.println(this.name);

        // Without this
        System.out.println("Without this:");
        System.out.println(number);
        System.out.println(name);
    }

    public static void main(String[] args) {
        ThisCurrentClassDemo obj = new ThisCurrentClassDemo();
        obj.display();
    }
}
