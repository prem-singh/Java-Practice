package java8.lambda;

/**
 * Created by premsingh on 10/2/18.
 */
public class TypeInferenceExample {

    public static void main(String[] args) {

        //Option-1
        StringLengthLambda myLambda = (String s) ->s.length();
        System.out.println(myLambda.getLength("Hello"));

        //Option-2
        StringLengthLambda myLambda1 = (s) ->s.length();
        System.out.println(myLambda1.getLength("Hello"));

        //Option-3: If only one argument then we can remove the parenthesis
        StringLengthLambda myLambda2 =  s ->s.length();
        System.out.println(myLambda2.getLength("Hello"));

        //Option-4: We can pass the inline expression to function
        printLambda(s->s.length());

    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello"));
    }
}

interface StringLengthLambda{
    int getLength(String s);
}