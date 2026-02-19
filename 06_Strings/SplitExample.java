public class SplitExample {

    public static void main(String[] args) {

        String s = "Java,Python,C++";
        String[] arr = s.split(",");

        for (String str : arr)
            System.out.println(str);
    }
}
