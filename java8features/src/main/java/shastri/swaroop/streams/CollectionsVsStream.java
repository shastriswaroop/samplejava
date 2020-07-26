package shastri.swaroop.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Swaroop");
        names.add("Kedar");
        names.add("Mandar");

        for(String name: names){
            System.out.println(name);
        }

        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);
        //java.lang.IllegalStateException: stream has already been operated upon or closed
        //namesStream.forEach(System.out::println);
    }

}
