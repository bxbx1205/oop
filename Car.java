public class Car {
     private String name;
     private int modelYear;

    
    public Car(String name, int modelYear) {
        this.name = name;
        this.modelYear = modelYear;
    }

    

    
    public void printCarDetails() {
        System.out.println("Car Name: " + name + ", Model Year: " + modelYear);
    }

    public static void main(String[] args) {
       
        Car car1 = new Car("Toyota Camry", 2020);
        Car car2 = new Car("Honda Accord", 2021);

        // Printing car details
        car1.printCarDetails();
        car2.printCarDetails();
    }
}