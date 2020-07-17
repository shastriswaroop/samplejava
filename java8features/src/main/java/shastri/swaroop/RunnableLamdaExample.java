package shastri.swaroop;

public class RunnableLamdaExample {
    public static void main(String[] args) {
        /**
         * Prior java 8
         */
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside 1");
            }
        };

        new Thread(runnable).start();

        new Thread(() -> System.out.println("Inside Lamda")).start();
    }
}
