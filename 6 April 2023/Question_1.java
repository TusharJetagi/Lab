package Lab;

 class Vehicle 
 {
    String brand;
    String model;
    int year;
    
    public Vehicle(String brand, String model, int year) //constructor for class vehicle
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void drive() 
    {
        System.out.println(this.brand + " " + this.model + " " + this.year+" is running");
    }
}

 class Car extends Vehicle // child class
 {
    String color;
    
    public Car(String brand, String model, int year, String color) //constructor for class car
    {
        super(brand, model, year);
        this.color = color;
    }
    
    public void honk() {
        System.out.println(this.brand + " " + this.model +" "+ this.year+" is honking");
    }
}

public class Question_1 
{
    public static void main(String[] args) 
    {
        Car myCar = new Car("TATA", "Safari", 2021, "White");
        myCar.drive();	// Call the drive method of the vehicle class
        myCar.honk();	// Call the honk method of the vehicle class
    }
}
