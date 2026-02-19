public class DifferenceMinMax {

    public static void main(String[] args) {
        int[] arr = { 2, 8, 1, 10 };
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        System.out.println("Difference: " + (max - min));
    }
}
