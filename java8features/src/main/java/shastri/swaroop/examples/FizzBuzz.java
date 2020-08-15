package shastri.swaroop.examples;

import java.util.function.Predicate;

public class FizzBuzz {
    public static void fizzBuzz(int n) {
        // Write your code here
        Predicate<Integer> p1 = (num)->num%3==0;
        Predicate<Integer> p2 = (num)->num%5==0;
        Predicate<Integer> p3 = p1.and(p2);
        Predicate<Integer> p4 = p1.negate().and(p2.negate());

        if(p4.test(n)){
            System.out.println(n);
        } else {
            if(p3.test(n)){
                System.out.println("FizzBuzz");
            }
            if(p1.and(p2.negate()).test(n)){
                System.out.println("Fizz");
            }
            if(p2.and(p1.negate()).test(n)){
                System.out.println("Buzz");
            }
        }
    }
    public static void main(String[] args) {
        fizzBuzz(15);

        fizzBuzz(14);fizzBuzz(5);fizzBuzz(3);
    }
}
