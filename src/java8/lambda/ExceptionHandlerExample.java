package java8.lambda;

import java.util.function.BiConsumer;

/**
 * Created by premsingh on 10/3/18.
 * Where to catch exception
 *  1. In process - but this is not good way
 *  2. I lambda expression - this is not good way
 *  3. Create a wrapper lambda and catch the exception there and let the actucal lambda be cleaner
 */
public class ExceptionHandlerExample {

    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        int key = 0;

        process(a,key,wrapperLambda((v,k) -> System.out.println(v/k)));
    }

    private static void process(int a[], int key, BiConsumer<Integer,Integer> consumer){
            for(int i : a){
                System.out.println("In process before accept");
                consumer.accept(i,key);
                System.out.println("In process after accept");
            }
    }

    public static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
// We can change the behaviour by defining other lamda type
        //return (v,k) -> System.out.println(v+k);
        return (v,k) -> {
            try{
                System.out.println("Before in Wrapper");
                consumer.accept(v,k);
                System.out.println("After in Wrapper");
            }catch(ArithmeticException e){
                System.out.println("In exception block");
            }
        };

    }
}
