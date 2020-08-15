package shastri.swaroop.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

class NumericStreamRangeExample {
    public static void intStreamRange(){
        System.out.println("Int Range");
        IntStream.range(1,50)
                .forEach((value) -> System.out.print(value + ","));

        System.out.println("\nInt RangeClosed");
        IntStream.rangeClosed(1,50)
                .forEach((value) -> System.out.print(value + ","));
   }
    public static void longStreamRange(){
        System.out.println("\nLong Range");
        LongStream.range(1,50)
                .forEach((value) -> System.out.print(value + ","));

        System.out.println("\nLong Range");
        LongStream.rangeClosed(1,50)
                .forEach((value) -> System.out.print(value + ","));
    }
    public static void doubleStreamRange(){
        System.out.println("\nDouble Range");
        IntStream.range(1,50).asDoubleStream()
                .forEach((value) -> System.out.print(value + ","));
    }

    public static void main(String[] args) {
        intStreamRange();
        longStreamRange();
        doubleStreamRange();
    }


}
