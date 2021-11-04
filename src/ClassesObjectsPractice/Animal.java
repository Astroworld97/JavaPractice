package ClassesObjectsPractice;

public class Animal {

    private String name; //instance variables/global variables
    private int age; //instance variables/global variables
    private String species; //instance variables/global variables

    public Animal(String n, int a, String s){ //constructor
        name = n;
        age = a;
        species = s;
    }

    public void eat(){
        System.out.println("Animal has eaten!");
    }

    public void sleep(){
        System.out.println("Animal has slept!");
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSpecies(){
        return species;
    }



}
