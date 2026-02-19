import java.util.LinkedHashSet;

public class RemoveDuplicatesNewArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4 };
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr)
            set.add(num);

        int[] newArr = new int[set.size()];
        int i = 0;
        for (int num : set)
            newArr[i++] = num;

        for (int num : newArr)
            System.out.print(num + " ");
    }
}
