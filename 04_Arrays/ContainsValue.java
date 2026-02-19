public class ContainsValue {

    public static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8 };
        System.out.println(contains(arr, 6));
    }
}
