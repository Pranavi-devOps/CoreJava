public class OverloadSameTypeSameParameters {

    void show(int a, int b) {
        System.out.println("First Method");
    }

    // ❌ This will cause compilation error
    /*
     * void show(int x, int y) {
     * System.out.println("Second Method");
     * }
     */

    public static void main(String[] args) {
        OverloadSameTypeSameParameters obj = new OverloadSameTypeSameParameters();
        obj.show(10, 20);
    }
}
