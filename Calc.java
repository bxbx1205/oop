import java.util.Scanner;

class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}

class Subtraction extends Addition {
    public int subtract(int a, int b) {
        return a - b;
    }
}

class Multiplication extends Subtraction {
    public int multiply(int a, int b) {
        return a * b;
    }
}

class Division extends Multiplication {
    public int divide(int a, int b) {
        
        return a / b;
    }
}

class Square extends Division {
    public int square(int a) {
        return a * a;
    }
}

class SquareRoot extends Square {
    public double sqrt(int a) {
        return Math.sqrt(a);
    }
}

public class Calc extends SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calculator = new Calc();

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        System.out.println("Choose operation: add, subtract, multiply, divide, square, sqrt");
        String operation = scanner.next();

        double result = 0;
        switch (operation) {
            case "add":
                result = calculator.add(num1, num2);
                break;
            case "subtract":
                result = calculator.subtract(num1, num2);
                break;
            case "multiply":
                result = calculator.multiply(num1, num2);
                break;
            case "divide":
                result = calculator.divide(num1, num2);
                break;
            case "square":
                result = calculator.square(num1);
                break;
            case "sqrt":
                result = calculator.sqrt(num1);
                break;
            default:
                System.out.println("Invalid operation");
                scanner.close();

                return;
                
        }
        

        System.out.println("The result is: " + result);
    }
}