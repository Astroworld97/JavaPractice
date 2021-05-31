package ClassesObjectsPractice;
//source: https://www.youtube.com/watch?v=IUqKuGNasdM&list=PLuVT2Ug8ISOUeumoUczDqraT_EO6qFdWt&index=2
public class Pokemon {

    //instance variables
    String name;
    int level;

    //constructors
    Pokemon(){
        level = 1;
    }

    Pokemon(String pName, int pLevel){
        name = pName;
        level = pLevel;
    }

    //methods
    void attack(){
        System.out.println(name + " attack!");
    }

}
