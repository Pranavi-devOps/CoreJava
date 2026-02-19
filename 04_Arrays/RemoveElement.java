public class RemoveElement {

    public static int[] remove(int[] arr, int value) {
        int count = 0;
        for (int num : arr)
            if (num != value)
                count++;

        int[] newArr = new int[count];
        int index = 0;

        for (int num : arr)
            if (num != value)
                newArr[index++] = num;

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4 };
        int[] result = remove(arr, 2);
        for (int num : result)
            System.out.print(num + " ");
    }
}
