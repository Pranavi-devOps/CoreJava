public class StringComparisonMethods {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "java";
        String s3 = "Java Programming";

        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));
        System.out.println("startsWith: " + s3.startsWith("Java"));
        System.out.println("endsWith: " + s3.endsWith("ing"));
        System.out.println("compareTo: " + s1.compareTo(s2));
    }
}
