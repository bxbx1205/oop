class Example {
    private int num;
    private String text;

    // Default constructor
    public Example() {
        this.num = 0;
        this.text = "Default";
    }

    // Constructor with one parameter
    public Example(int num) {
        this.num = num;
        this.text = "Default";
    }

    // Constructor with two parameters
    public Example(int num, String text) {
        this.num = num;
        this.text = text;
    }

    public void display() {
        System.out.println("Number: " + num + ", Text: " + text);
    }

    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example(10);
        Example ex3 = new Example(20, "Hello");

        ex1.display();
        ex2.display();
        ex3.display();
    }
}