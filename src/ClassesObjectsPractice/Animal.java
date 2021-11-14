package ClassesObjectsPractice;

public class Animal {

    private String name; //instance variables/global variables
    private int age; //instance variables/global variables
    private String species; //instance variables/global variables

    public Animal(){ //default constructor
        name = "Pedro";
        age = 20;
        species = "dog";
    }

    public Animal(String name, int age, String species){ //constructor = is used to create an instance of an object
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void eat(){
        System.out.println("Animal has eaten!");
    }

    public void sleep(){
        System.out.println("Animal has slept!");
    }

    public String getName(){ //getter method
        return name;
    }

    public int getAge(){ //getter method
        return age;
    }

    public String getSpecies(){ //getter method
        return species;
    }

    public void setName(String name){ //setter method

        this.name = name;
    }

    public void setAge(int age){ //setter method
        this.age = age;
    }

    public void setSpecies(String species){ //setter method
        this.species = species;
    }

}
