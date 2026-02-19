public class GenerateNoSuchFieldException {

    public static void main(String[] args) throws NoSuchFieldException {

        Class<String> c = String.class;
        c.getDeclaredField("unknownField");
    }
}
