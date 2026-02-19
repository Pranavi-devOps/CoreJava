public class InvalidConstructorReturnType {

    int getValue() {
        return 10;
    }

    String getString(String s) {
        return s;
    }

    public static void main(String[] args) {

        InvalidConstructorReturnType obj = new InvalidConstructorReturnType();

        System.out.println(obj.getValue());
        System.out.println(obj.getString("Hello"));
    }
}
