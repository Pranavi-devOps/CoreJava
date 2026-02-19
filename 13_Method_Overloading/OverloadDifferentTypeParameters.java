public class OverloadDifferentTypeParameters {

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String s, int a) {
        System.out.println("String and Integer: " + s + " " + a);
    }

    public static void main(String[] args) {

        OverloadDifferentTypeParameters obj = new OverloadDifferentTypeParameters();
        obj.display(10);
        obj.display("Hello", 20);
    }
}
