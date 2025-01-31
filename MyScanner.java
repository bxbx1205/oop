import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Your name is: " + name);
        
        scanner.close();
    }
}