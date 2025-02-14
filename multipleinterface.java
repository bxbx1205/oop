interface Mul {
    void muli(int a, int b);
}

interface Div {
    void divi(int a, int b);
}

class Calculator implements Mul, Div {
    public void muli(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divi(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.muli(10, 5);
        calc.divi(10, 5);
    }
}