package shastri.swaroop.dynamicprograming;

import java.util.stream.IntStream;

public class FibonacciDP {
    public static int getFibonacci(int n){
        if(n==0){
            return 0;
        }

        int fib[] = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i=2; i<n+1 ; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(0,10)
                .mapToLong(p->getFibonacci(p))
                .forEach(System.out::println);
//        System.out.println(getFibonacci(5));
    }
}
