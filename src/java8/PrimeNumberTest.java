package java8;

import java.io.InputStream;
import java.util.stream.IntStream;

/**
 * Created by premsingh on 9/23/18.
 */
public class PrimeNumberTest {

    public static void main(String[] args) {

        System.out.println("====> 1 is Prime -->" + isPrime(1));
        System.out.println("====> 2 is Prime --> " + isPrime(2));
        System.out.println("====> 3 is Prime --> " + isPrime(3));
        System.out.println("====> 4 is Prime --> " + isPrime(4));


    }

    private static boolean isPrime(final int number){

        return number > 1 && IntStream.range(2,number)
                                       .noneMatch(index -> number % index == 0);
    }
}
