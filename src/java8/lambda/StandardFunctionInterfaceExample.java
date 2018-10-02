package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by premsingh on 10/2/18.
 */
public class StandardFunctionInterfaceExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(1, "Prem", "Singh", 30),
                new Person(1, "Pankaj", "Singh", 32),
                new Person(1, "Samaira", "Singh", 6),
                new Person(1, "Ranjan", "Kumar", 36)
        );

        // sort by first name
        Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

        //We can pass this behaviour inline as well
        Consumer printPerson = p -> System.out.println(p);

        // Print all elements of list
        System.out.println("Print all elements of list");
        performAllWithCondition(people, p ->true, printPerson);

        // Print list of person whose first name start with P
        System.out.println("Print list of person whose first name start with P");
        performAllWithCondition(people, p -> p.getFirstName().startsWith("P"),printPerson);


        // Print list of person whose last name start with K
        System.out.println("Print list of person whose last name start with K");
        performAllWithCondition(people, p -> p.getLastName().startsWith("K"),printPerson);

    }

    private static void performAllWithCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {

        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }

    }
}
