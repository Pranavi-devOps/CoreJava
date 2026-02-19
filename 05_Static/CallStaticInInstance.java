public class CallStaticInInstance {

    static void show() {
        System.out.println("Static Method Called");
    }

    void display() {
        show();
    }

    public static void main(String[] args) {
        CallStaticInInstance obj = new CallStaticInInstance();
        obj.display();
    }
}
