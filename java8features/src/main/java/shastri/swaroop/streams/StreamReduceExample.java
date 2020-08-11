package shastri.swaroop.streams;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> inList){
        return inList.stream().reduce(1,(a,b)->a*b);
    }
    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> inList){
        return inList.stream().reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> s1.getGpa()>s2.getGpa() ? s1:s2);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);
        List<Integer> integerList1 = Arrays.asList();
        System.out.println(performMultiplication(integerList));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integerList);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> result1 = performMultiplicationWithoutIdentity(integerList1);
        System.out.println(result1.isPresent());
        if(result1.isPresent()) {
            /*    Exception in thread "main" java.util.NoSuchElementException: No value present
            at java.util.Optional.get(Optional.java:135)
            at shastri.swaroop.streams.StreamReduceExample.main(StreamReduceExample.java:26)*/

            System.out.println(result1.get());

        }

        System.out.println(getHighestGPAStudent());

    }
}
