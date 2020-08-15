package shastri.swaroop.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("sum : " + sum);

        OptionalInt optMaxInt = IntStream.rangeClosed(1,50).max();
        System.out.println("Max : " + (optMaxInt.isPresent()?optMaxInt.getAsInt():0));

        OptionalLong optMinLong = LongStream.rangeClosed(50,100)
                .min();
        System.out.println("Min : " + (optMinLong.isPresent()?optMinLong.getAsLong():0));
        OptionalDouble optAvgInt = IntStream.rangeClosed(1,50).average();
        System.out.println("Avg : " + (optAvgInt.isPresent()?optAvgInt.getAsDouble():0.0));


    }
}
