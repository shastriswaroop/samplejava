package shastri.swaroop.java_08;

public class LamdaExample {
    public static void main(String args[]){
        // Simple Runnable Example
        Runnable r = LamdaExample::task;
       // Runnable r = ()-> task();
       // Runnable r = ()-> System.out.println("Hello Swaroop");
        new Thread(r).start();
    }

    public static void task(){
        System.out.println("Task: Hello Swaroop ");
    }
}
