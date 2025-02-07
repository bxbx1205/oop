import java.util.Scanner;

public class Employee {
    private int id;
    private double sales;

    public Employee(int id, double sales) {
        this.id = id;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public double getSales() {
        return sales;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        Employee[] employees = new Employee[numberOfEmployees];

        double totalSales = 0, maxSales = Double.MIN_VALUE, minSales = Double.MAX_VALUE;

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter sales for employee " + (i + 1) + ": ");
            double sales = scanner.nextDouble();
            employees[i] = new Employee(i + 1, sales);
            totalSales += sales;
            maxSales = Math.max(maxSales, sales);
            minSales = Math.min(minSales, sales);
        }

        System.out.println("Employee details:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Sales: " + employee.getSales());
        }

        System.out.printf("Total Sales: %.2f%n", totalSales);
        System.out.printf("Maximum Sales: %.2f%n", maxSales);
        System.out.printf("Minimum Sales: %.2f%n", minSales);
        System.out.printf("Average Sales: %.2f%n", totalSales / numberOfEmployees);

        scanner.close();
    }
}
