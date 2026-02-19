public class GenerateNoSuchMethodException {

    public static void main(String[] args) throws NoSuchMethodException {

        Class<String> c = String.class;
        c.getDeclaredMethod("unknownMethod");
    }
}
