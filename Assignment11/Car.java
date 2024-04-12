
import java.util.Scanner;

public class Car {
    //  declaring fields and the scanner :)
    String brand;   // see here even though i dont use an access modifier by default its there as public.
    String type;
    String size;
    String color;
    int amount;

    Scanner cardetails = new Scanner(System.in);
    
    // having constructors..
    public Car(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    public Car(String size, String color, int amount){
        this.size = size;
        this.color = color;
        this.amount = amount;
    }

    // now this is method overloading.. see same name, different parameters and data type;
    public void carBehaviour(String brand, String type){
        System.out.println( "Brand " + brand + " and  Type " + type + " is driving in kampala. \n ");
    }

    public void carBehaviour(String size, String color, int amount){
        System.out.println( "The car is " + size + " Size" );
        System.out.println( "The car is " + color + " Color" );
        System.out.println( "The car was purchased at:  " + amount );
    }

    public void scannerInput(){
        System.out.println("Enter the car details");

        System.out.print("Enter the brand: ");
        this.brand = cardetails.nextLine();

        System.out.print("Enter the type: ");
        this.type = cardetails.nextLine();

        System.out.print("Enter the size: ");
        this.size = cardetails.nextLine();

        System.out.print("Enter the color: ");
        this.color = cardetails.nextLine();

        System.out.print("Enter the amount: ");
        this.amount = cardetails.nextInt();
    }

    public static void main(String[] args) {
        Car car1 = new Car("", "");
        Car car =  new Car("", "", 0);

        car1.scannerInput();
        car1.carBehaviour(car1.brand, car1.type);
        car1.carBehaviour(car1.size, car1.color, car1.amount);

        car.scannerInput();
        car.carBehaviour(car.brand, car.type);
        car.carBehaviour(car.size, car.color, car.amount);

    }

}