package shastri.swaroop.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function <String, String> fn = (str) -> str.toUpperCase();
    static Function <String, String> fn1 = (str) -> str.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result : " + fn.apply("java8"));
        System.out.println("Result : " + fn1.apply("java8"));
        System.out.println("Result : " + fn.compose(fn1).apply("java8"));

    }

}
