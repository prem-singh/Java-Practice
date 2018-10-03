package java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by premsingh on 10/4/18.
 */
public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Prem", "Singh", 30),
                new Person(1, "Pankaj", "Singh", 32),
                new Person(1, "Samaira", "Singh", 6),
                new Person(1, "Ranjan", "Kumar", 36)
        );

        people.stream()
                .filter((p)-> p.getLastName().startsWith("K"))
                .forEach(System.out::println);

        long count = people.stream()
                        .filter(p -> p.getLastName().startsWith("S"))
                        .count();
        System.out.println(count);


        long count1 = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("S"))
                .count();
        System.out.println(count1);

    }
}
