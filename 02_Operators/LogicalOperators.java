class LogicalDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a > 5 && b > 10); // AND
        System.out.println(a > 5 || b < 10); // OR
        System.out.println(!(a > 5)); // NOT
    }
}
