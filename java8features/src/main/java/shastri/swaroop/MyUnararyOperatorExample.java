package shastri.swaroop;

import java.util.function.UnaryOperator;

public class MyUnararyOperatorExample {
    static UnaryOperator <String> uniOperator = (string) -> string.concat("Default");
    public static void main(String[] args) {
            System.out.print(uniOperator.apply("HEllo"));
        System.out.println();

    }
}
