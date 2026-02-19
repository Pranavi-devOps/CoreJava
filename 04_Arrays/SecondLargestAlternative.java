import java.util.Arrays;

public class SecondLargestAlternative {

    public static void main(String[] args) {
        int[] arr = { 5, 8, 12, 3, 9 };
        Arrays.sort(arr);
        System.out.println("Second Largest: " + arr[arr.length - 2]);
    }
}
