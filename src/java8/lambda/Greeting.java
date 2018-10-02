package java8.lambda;

/**
 * Created by premsingh on 10/2/18.
 * Following steps need to take by Beginner for defining Lambda function
 *  1. Write function in old way
 *  2. Remove modifier/ return type/name of function as this will be taken care of compiler.
 *  3. -> this is required after method argument and before curly braces
 *  Ex: addTwoNumbers = (int a, int b) -> a+b;
 *  lengthOfString = (String s) -> s.length();
 */
public class Greeting {

    public static void main(String[] args) {

        Greeting greet = new Greeting();

       //Inner class way of implementing Interface
        IGreeting innerclassGreeting = new IGreeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!!");
            }
        };
        greet.greet(innerclassGreeting);

        // Lambda function way
       // Functional Interface will have only one method matching with Lambda function signature.
        IGreeting lambdaGreeting = () -> System.out.println("Hello World!!");
        // It will execute when method of Interface will be invoked
        greet.greet(lambdaGreeting);
    }

    public void greet(IGreeting greeting){
        greeting.perform();

    }
}
