package shastri.swaroop;

import java.util.stream.IntStream;

public class ImparativeVsDeclarativePrograming {
    public static void main(String[] args) {
        // Imperative how style
        int sum = 0 ;
        for(int i=0; i<=100; i++){
            sum+=i;
        }
        System.out.println(sum);

        int sum1 = IntStream.rangeClosed(0,100)
                .parallel()
                .sum();

        System.out.println(sum1);
    }
}
