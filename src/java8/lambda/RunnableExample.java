package java8.lambda;

/**
 * Created by premsingh on 10/2/18.
 */
public class RunnableExample {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In runnable");
            }
        });
        t.start();
        //Using Lambda

        Thread thread = new Thread(()-> System.out.println("Using Lambda"));
        thread.start();
    }
}
