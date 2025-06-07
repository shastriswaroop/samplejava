import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] intArray = {1,5,4,3,9,6,91, 2, 3, 4, 5};

        Arrays.stream(intArray).sorted().distinct().forEach(System.out::println);

/*
        List ls = new java.util.ArrayList<>();
        java.util.stream.IntStream intStream = java.util.Arrays.stream(intArray); // IntStream for primitive int array

        String[] strArray = {"apple", "banana", "cherry"};
        java.util.stream.Stream<String> strStream = java.util.Arrays.stream(strArray); // Stream<String> for String array
*/
    }
}