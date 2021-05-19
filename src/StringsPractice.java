public class StringsPractice {
    //reference: https://www.youtube.com/watch?v=yMkFYxrDL2M&list=PLuVT2Ug8ISOUeumoUczDqraT_EO6qFdWt&index=1

    public static void main(String[] args) {

        System.out.println("This is a Java object"); //in Java, all strings are objects, not arrays of characters.

        //a string not assigned to a variable is called a string literal.

        String myString = new String("keep on coding"); //a valid way to initialize a string
        String myString2 = "i love java"; //another valid way to initialize a string

        if(myString.equals(myString2)){ //checks for equal text in the string. "==" checks for object equality.
            System.out.println("Strings are equal");
        }

        System.out.println(myString.length()); //prints length of a string

        System.out.println(myString.charAt(3)); //prints the character at the given index

        System.out.println(myString.indexOf('o')); //prints the index this character is at.

        String[] strs = myString.split(" "); //splits the string at the given character. Here, it is the space character

        for(String str: strs){
            System.out.println(str + " ");
        }

        strs[2] = "coding, with Sam";

        for(String str: strs){
            System.out.println(str + " ");
        }

        //in Java, every string is immutable. Whenever you change a string, it is actually creating a new string.

    }
}
