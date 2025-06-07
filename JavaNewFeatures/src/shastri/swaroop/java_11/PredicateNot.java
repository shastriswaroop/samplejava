package shastri.swaroop.java_11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {
    public static void main(String[] args){
        Predicate<Integer> evenNumber = num->num%2==0;
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);

//        numbers.stream().filter(Java11_PredicateNotExample::isEven)
//                .forEach(System.out::println);

        numbers.stream().filter(evenNumber)
                .forEach(System.out::println);

        numbers.stream().filter(evenNumber.negate())
                .forEach(System.out::println);

        numbers.stream().filter(Predicate.not(PredicateNot::isEven))
                .forEach(System.out::println);


    }
     public static boolean isEven(int number){
        return number%2==0;
     }

}
