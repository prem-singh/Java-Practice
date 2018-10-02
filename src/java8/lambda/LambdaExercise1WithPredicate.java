package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by premsingh on 10/2/18.
 */
public class LambdaExercise1WithPredicate {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(1, "Prem", "Singh", 30),
                new Person(1, "Pankaj", "Singh", 32),
                new Person(1, "Samaira", "Singh", 6),
                new Person(1, "Ranjan", "Kumar", 36)
        );

        // sort by first name
        Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

        // Print all elements of list
        System.out.println("Print all elements of list");
        printAllWithCondition(people, p ->true);

        // Print list of person whose first name start with P
        System.out.println("Print list of person whose first name start with P");
        printAllWithCondition(people, p -> p.getFirstName().startsWith("P"));


        // Print list of person whose last name start with K
        System.out.println("Print list of person whose last name start with K");
        printAllWithCondition(people, p -> p.getLastName().startsWith("K"));

    }

    private static void printAllWithCondition(List<Person> people, Predicate<Person> predicate) {

        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }

    }
}
