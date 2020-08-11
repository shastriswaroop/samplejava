package shastri.swaroop.streams;

import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
    public static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    public static Optional<Integer> getSumWithLimit(){
        Optional<Integer> sumwithlimit = numbers.stream()
                .limit(9)
                .reduce(Integer::sum);
        return sumwithlimit;
    }

    public static Optional<Integer> getSumWithSkip(){
        Optional<Integer> sumwithskip = numbers.stream()
                .skip(2)
                .reduce(Integer::sum);
        return sumwithskip;
    }

    public static void main(String[] args) {
        Optional<Integer> number = getSumWithLimit();
        if(number.isPresent())
            System.out.println(number.get());


        Optional<Integer> number1 = getSumWithSkip();
        if(number1.isPresent())
            System.out.println(number1.get());

    }
}
