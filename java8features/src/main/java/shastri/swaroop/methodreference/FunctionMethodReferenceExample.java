package shastri.swaroop.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function <String,String> fnInterfaceLamda = (s) -> s.toUpperCase();
    static Function <String,String> fnInterface = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(fnInterfaceLamda.apply("swaroop"));
        System.out.println(fnInterface.apply("swaroop"));
    }
}
