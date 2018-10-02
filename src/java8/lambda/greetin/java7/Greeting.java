package java8.lambda.greetin.java7;

/**
 * Created by premsingh on 10/2/18.
 */
public class Greeting {

    public static void main(String[] args) {

        Greeting greet = new Greeting();
        IGreeting g = new GreetingImpl();
        greet.greet(g);

    }

    public void greet(IGreeting greeting){
        greeting.perform();

    }
}
