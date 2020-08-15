package shastri.swaroop.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> intList){
        return intList.stream()
                //wrapper integer values
                .mapToInt(Integer::intValue)
                // int
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> lstBoxed = boxing();
        System.out.println("Boxing : " +boxing());  
        System.out.println("UnBoxing : " +unBoxing(lstBoxed));
    }
}
