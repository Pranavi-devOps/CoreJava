public class CopyArray {

    public static int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[i];
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] copied = copy(arr);
        for (int num : copied)
            System.out.print(num + " ");
    }
}
