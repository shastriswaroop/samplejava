package shastri.swaroop.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {
    public static int getSumFromStream(List<Integer> intList){
        return intList.stream().reduce(0,(x, y) ->x+y); // unboxing of integer to int
    }

    public static int getSumFromIntStream(){
        return IntStream.rangeClosed(1,6)
        .sum();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("sum with stream : " + getSumFromStream(intList));
        System.out.println("sum with int Stream" + getSumFromIntStream());
    }
}
