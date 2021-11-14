package ClassesObjectsPractice;

import static ClassesObjectsPractice.PublicPrivateExample.exVar;

public class AnimalMain {

    public static void main(String[] args) { //write this every time you want to create a main function
        Animal a1 = new Animal("Bobby", 4, "snake");
        Animal a2 = new Animal("Juan", 6, "horse");
        Animal pedro1 = new Animal();
        Animal pedro2 = new Animal();
        pedro1.eat();
        System.out.println(pedro1.getName());
    }

}
