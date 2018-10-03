package java8.lambda;

/**
 * Created by premsingh on 10/4/18.
 */
public class MethodReferenceExample1 {

    public static void main(String[] args) {
        //Thread t = new Thread(()->printMe());
        Thread t = new Thread(MethodReferenceExample1::printMe);// This is same as above labda statement. This is with method reference.
        t.start();
    }

    public static void printMe(){
        System.out.println("Hello");
    }
}
