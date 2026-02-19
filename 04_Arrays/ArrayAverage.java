public class ArrayAverage {

    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        System.out.println("Average: " + average(arr));
    }
}
