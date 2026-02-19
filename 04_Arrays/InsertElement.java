public class InsertElement {

    public static int[] insert(int[] arr, int value, int position) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position)
                newArr[i] = value;
            else
                newArr[i] = arr[j++];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int[] result = insert(arr, 3, 2);
        for (int num : result)
            System.out.print(num + " ");
    }
}
