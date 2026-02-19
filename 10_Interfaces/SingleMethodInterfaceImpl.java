interface SingleMethodInterface {
    void show();
}

public class SingleMethodInterfaceImpl implements SingleMethodInterface {

    public void show() {
        System.out.println("Single method implemented");
    }

    public static void main(String[] args) {
        SingleMethodInterface obj = new SingleMethodInterfaceImpl();
        obj.show();
    }
}
