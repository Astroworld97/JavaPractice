package ClassesObjectsPractice;

public class Vehicle {
    //first: define the instance variables (aka the characteristics of the objects)
    //second: define the constructor (aka what lets us make new instances of that object)
    //third: define the functions/methods (aka what the object can do or what can be done to the object)

    //Step one: make instance variables!
    private int numWheels;
    private int horsePower;
    private String color;
    private String brand;
    //Step one complete!

    //Step 2: define the constructor!
    //Step 2a: define the default constructor
    public Vehicle(){
        numWheels = 4;
        horsePower = 20;
        color = "blue";
        brand = "Toyota";
    }
    //Step 2a complete!

    //Step 2b: define the non-default constructor
    public Vehicle(int numWheels, int horsePower, String color, String brand){
       this.numWheels = numWheels;
       this.horsePower = horsePower;
       this.color = color;
       this.brand = brand;
    }
    //Step 2b is complete!
    //Step 2 is complete!

    //Step 3: define the functions/methods
    //Step 3a: define the getter methods
    public int getNumWheels(){
        return numWheels;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }
    //Step 3a done!

    //Step 3b: define the setter methods

}
