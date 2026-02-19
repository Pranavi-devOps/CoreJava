interface StaticFinalVariableInterface {

    static final int VALUE = 999;
}

public class StaticFinalVariableInterfaceImpl implements StaticFinalVariableInterface {

    public static void main(String[] args) {
        System.out.println("Static Final Value: " + VALUE);
    }
}
