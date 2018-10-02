package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by premsingh on 10/2/18.
 */
public class LambdaExercise1WithJava7 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(1,"Prem", "Singh",30),
                new Person(1,"Pankaj", "Singh",32),
                new Person(1,"Samaira", "Singh",6),
                new Person(1,"Ranjan", "Kumar",36)
        );

        // sort by first name
        Collections.sort(people,new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        // Print all elements of list
        System.out.println("Print all elements of list");
        printAll(people);

        // Print list of person whose first name start with P
        System.out.println("Print list of person whose first name start with P");
        printAllWithCondition(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("P");
            }
        });

        // Print list of person whose last name start with K
        System.out.println("Print list of person whose last name start with K");
        printAllWithCondition(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("K");
            }
        });

    }

    private static void printAllWithCondition(List<Person> people,Condition condition) {

        for(Person p : people){
            if(condition.test(p)) {
                System.out.println(p);
            }
        }

    }

    private static void printAll(List<Person> people) {

        for(Person p : people){
            System.out.println(p);
        }
    }


    interface Condition{
        boolean test(Person p);
    }
}
