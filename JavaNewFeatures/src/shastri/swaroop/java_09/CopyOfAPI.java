package shastri.swaroop.java_09;

import java.util.ArrayList;
import java.util.List;

/**
 * List.copyOf(names)
 * Map.copyOf(names)
 * Set.copyOf(names)
 * */
public class CopyOfAPI {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("swaroop");
        names.add("kedar");

        unmodifiedList(names);
       // System.out.println(names);

        /*
        Exception in thread "main" java.lang.UnsupportedOperationException
    	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	    at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
	    at com.acc.explore.java_09.Java09_CopyOfAPIExample.unmodifiedList(Java09_CopyOfAPIExample.java:27)
        * */

        //
        unmodifiedList(List.copyOf(names));
        System.out.println(names);

    }

    private static void unmodifiedList(List<String> names) {
        names.add("Mandar");
    }
}
