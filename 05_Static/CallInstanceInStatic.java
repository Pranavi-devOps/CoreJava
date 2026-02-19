public class CallInstanceInStatic {

    void show() {
        System.out.println("Instance Method Called");
    }

    static void display() {
        CallInstanceInStatic obj = new CallInstanceInStatic();
        obj.show();
    }

    public static void main(String[] args) {
        display();
    }
}
