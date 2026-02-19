public class PrivateExample {

    private int number = 100;

    private void display() {
        System.out.println("Private Method");
    }

    public static void main(String[] args) {

        PrivateExample obj = new PrivateExample();

        // Accessing private field
        System.out.println("Number: " + obj.number);

        // Calling private method
        obj.display();
    }
}
