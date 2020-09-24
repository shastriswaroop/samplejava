package shastri.swaroop.dynamicprograming;

public class Factorial {
    static long factorial = 1;
    public static long getFactorial(long number){
        if(number ==0 || number ==1){
            return factorial;
        } else {
            factorial *= number;
           return getFactorial(--number);
        }
    }
    public static void main(String[] args) {
        long timerBefore = System.currentTimeMillis();
        System.out.println(getFactorial(5));
        long timerafter = System.currentTimeMillis();
        System.out.println("timerBefore:" + timerBefore);
        System.out.println("timerafter:" + timerafter);
        System.out.println("Total time taken : " + (timerafter-timerBefore));

    }

}
