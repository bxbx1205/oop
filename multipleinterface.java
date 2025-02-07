interface Printable {
    void print();
}

interface Showable {
    void show();
}

class multipleinterface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        multipleinterface obj = new multipleinterface();
        obj.print();
        obj.show();
    }
}