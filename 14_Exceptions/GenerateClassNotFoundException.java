public class GenerateClassNotFoundException {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("UnknownClass");
    }
}
