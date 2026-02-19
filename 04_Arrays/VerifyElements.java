public class VerifyElements {

    public static void main(String[] args) {
        int[] arr = { 10, 12, 23, 40 };
        boolean found12 = false, found23 = false;

        for (int num : arr) {
            if (num == 12)
                found12 = true;
            if (num == 23)
                found23 = true;
        }

        if (found12 && found23)
            System.out.println("Both 12 and 23 are present");
        else
            System.out.println("Elements not found");
    }
}
