interface DefaultMethod {

    default void show() {
        System.out.println("Default Method in Interface");
    }
}

public class DefaultMethodInterface implements DefaultMethod {

    public static void main(String[] args) {

        DefaultMethodInterface obj = new DefaultMethodInterface();
        obj.show();
    }
}
