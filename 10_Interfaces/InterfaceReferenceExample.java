interface InterfaceRef {
    void display();
}

class InterfaceReferenceExample implements InterfaceRef {

    public void display() {
        System.out.println("Called using interface reference");
    }

    public static void main(String[] args) {
        InterfaceRef obj = new InterfaceReferenceExample();
        obj.display();
    }
}
