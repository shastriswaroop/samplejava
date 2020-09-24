package shastri.swaroop.dynamicprograming;

public class Fibonacci {
    static int previous = 1;
    static int prePrevious= 1;
    static int fab =1;
    static int count = 1;

    public static int getFibonacciNumber(int n){
        if(n==0){
            fab = 0;
            previous = 0;
            prePrevious= 0;
            return fab;
        }
        if(n==1){
            fab = 1;
            previous = 1;
            prePrevious= 0;
            return fab;
        }
        while(count<n) {
            fab = previous + prePrevious;
            prePrevious = previous;
            previous = fab;
            count++;
        }
        return fab;
    }

    public static void main(String[] args) {
        //IntStream intStream = I

/*
        IntStream.rangeClosed(0,5)
                .mapToLong(p->getFibonacciNumber(p))
                .forEach(System.out::println);
*/

        System.out.println(getFibonacciNumber(4));

        /*
        for(int i=0;i<10; i++) {
            System.out.println(getFibonacciNumber(i )+" , ");
        }
*/
    }
}
