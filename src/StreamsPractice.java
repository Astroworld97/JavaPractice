import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractice {

    //reference: https://www.youtube.com/watch?v=FWoYpM-E3EQ

    //Java streams gives us a set of functions that we can perform on certain data structures. They allow us to
    //quickly and conveniently perform bulk operations on them. Streams themselves are not data structures. They don't modify the
    //underlying data structure they are operating on.

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Warren Buffett", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Bill Gates", 100));
        people.add(new Person("Mark Zuckerberg", 50));

//        List<Person> hundredClub = new ArrayList<Person>();
//        for(Person p: people){
//            if(p.billions >= 100){
//                hundredClub.add(p);
//            }
//        }

        //the code above is replaced by the code below.

        List<Person> hundredClub = people.stream()
                                            .filter(person -> person.billions >= 100)
                                            .collect(Collectors.toList());

        //The forEach below can be used by both the commented out version and the stream version.

        hundredClub.forEach(person -> System.out.println(person.name));
    }

    static class Person{
        String name;
        int billions;

        public Person(String name, int billions){
            this.name = name;
            this.billions = billions;
        }
    }

}
