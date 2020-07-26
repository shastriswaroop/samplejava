package shastri.swaroop;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class MyBinaryExample {
    static BinaryOperator <Integer> binaryOperator = (a,b) -> a*b;
    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
    static BinaryOperator <Integer> minBy = (a,b) -> BinaryOperator.minBy(comparator).apply(a,b);
    static BinaryOperator <Integer> maxBy = (a,b) -> BinaryOperator.maxBy(comparator).apply(a,b);

    public static void main(String[] args) {

        System.out.println("Multiplication is :" + binaryOperator.apply(3,5));

        System.out.println("Max is :" + maxBy.apply(3,5));
        System.out.println("Min is :" + minBy.apply(3,5));

    }
}
