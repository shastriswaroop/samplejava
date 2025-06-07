package shastri.swaroop.java_10;

import java.util.List;

public class TypeInference {
    public static void main(String[] args) {

        List<String> name1 = List.of("Swaroop", "Prachi");
        List<String> name2 = List.of("Swati", "Aditi");

        var names = List.of(name1, name2);
        names.forEach(System.out::println);
    }
}
