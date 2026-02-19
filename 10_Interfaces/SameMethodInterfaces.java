interface Same1 {
    void common();
}

interface Same2 {
    void common();
}

public class SameMethodInterfaces implements Same1, Same2 {

    public void common() {
        System.out.println("Common method implemented once");
    }

    public static void main(String[] args) {
        SameMethodInterfaces obj = new SameMethodInterfaces();
        obj.common();
    }
}
