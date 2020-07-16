package shastri.swaroop.functionalinterfaces;

public class FunctionExample1 {

    public static String perfomConcate(String str){
        return FunctionExample.fn1.apply(str);
    }

    public static void main(String[] args) {
        System.out.println(perfomConcate("hello"));
    }
}
