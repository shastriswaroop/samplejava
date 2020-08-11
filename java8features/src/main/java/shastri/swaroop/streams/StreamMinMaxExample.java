package shastri.swaroop.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
    public static List<Integer> numbers = Arrays.asList(3,4,5,6,7,8,9,10);
    //public static List<Integer> numbers = new ArrayList<>();

    public static Optional<Integer> getMaxNumber(){
        return numbers.stream()
                .reduce(Integer::max);
    }

    public static Optional<Integer> getMinNumber(){
        return numbers.stream()
                .reduce((a,b)-> a<b?a:b);
    }


    public static void main(String[] args) {

        //Optional.empty
        //Optional[10]
        System.out.println(getMaxNumber());
        //Optional.empty
        //Optional[3]
        System.out.println(getMinNumber());

        if(getMaxNumber().isPresent())
           System.out.println(getMaxNumber().get());
        else
           System.out.println("List is  empty " );

        if(getMinNumber().isPresent())
            System.out.println(getMinNumber().get());
        else
            System.out.println("List is  empty " );

    }
}
