import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPracticeSorting {

    //reference: https://www.youtube.com/watch?v=FWoYpM-E3EQ

    //Java streams gives us a set of functions that we can perform on certain data structures. They allow us to
    //quickly and conveniently perform bulk operations on them. Streams themselves are not data structures. They don't modify the
    //underlying data structure they are operating on.

    public static void main(String[] args) {
        List<StreamsPractice.Person> people = new ArrayList<StreamsPractice.Person>();

        people.add(new StreamsPractice.Person("Warren Buffett", 120));
        people.add(new StreamsPractice.Person("Jeff Bezos", 150));
        people.add(new StreamsPractice.Person("Bill Gates", 100));
        people.add(new StreamsPractice.Person("Mark Zuckerberg", 50));

        List<StreamsPractice.Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());

        sortedList.forEach(person -> System.out.println(person.name));

    }
}
