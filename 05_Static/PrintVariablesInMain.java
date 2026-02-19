public class PrintVariablesInMain {

    static int a = 50;
    static int b = 60;

    int x = 5;
    int y = 6;

    public static void main(String[] args) {

        PrintVariablesInMain obj = new PrintVariablesInMain();

        // Static variables
        System.out.println("Static a: " + a);
        System.out.println("Static b: " + b);

        // Instance variables
        System.out.println("Instance x: " + obj.x);
        System.out.println("Instance y: " + obj.y);
    }
}
