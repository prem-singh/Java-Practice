package java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by premsingh on 10/4/18.
 */
public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Prem", "Singh", 30),
                new Person(1, "Pankaj", "Singh", 32),
                new Person(1, "Samaira", "Singh", 6),
                new Person(1, "Ranjan", "Kumar", 36)
        );

        System.out.println("Using for loop");

        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }

        System.out.println("Using for in");

        for(Person p: people){
            System.out.println(p);
        }

        // Above two are external iteration i.e. we are having control. All above will be executed in sequential

        // Java 8 introduced internal iterator.

        System.out.println("Using for each");
        people.forEach((p) -> System.out.println(p));

        System.out.println("Using for each and method reference");
        people.forEach(System.out::println); //Here we are caring of order. So this loop will be executing in parallel.
    }
}
