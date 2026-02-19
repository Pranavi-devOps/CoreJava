class ScopeDemo {

    int number = 10; // Global variable

    public static void main(String[] args) {

        ScopeDemo obj = new ScopeDemo();
        obj.show();
    }

    void show() {

        int number = 20; // Local variable

        System.out.println("Local variable: " + number);
        System.out.println("Global variable: " + this.number);
    }
}
