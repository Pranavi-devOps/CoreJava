public class InstanceInStatic {

    int x = 100;
    int y = 200;

    static void display() {
        InstanceInStatic obj = new InstanceInStatic();
        System.out.println("x: " + obj.x);
        System.out.println("y: " + obj.y);
    }

    public static void main(String[] args) {
        display();
    }
}
