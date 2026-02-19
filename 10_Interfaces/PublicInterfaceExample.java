public interface PublicInterfaceExample {

    int number = 100;

    void display();
}

class PublicInterfaceImpl implements PublicInterfaceExample {

    public void display() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        PublicInterfaceImpl obj = new PublicInterfaceImpl();
        obj.display();
    }
}
