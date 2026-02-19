public class OverloadDifferentReturnType {

    int add(int a, int b) {
        return a + b;
    }

    // ❌ Not allowed (Only return type different)
    /*
     * double add(int a, int b) {
     * return a + b;
     * }
     */

    public static void main(String[] args) {

        OverloadDifferentReturnType obj = new OverloadDifferentReturnType();
        System.out.println(obj.add(10, 20));
    }
}
