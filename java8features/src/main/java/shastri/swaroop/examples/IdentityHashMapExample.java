package shastri.swaroop.examples;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/identityhashmap-class-java/

/*
dentityHashMap implements Map, Serializable and Clonable interfaces and extends AbstractMap class.
This class is not a general-purpose Map implementation. While this class implements the Map interface,
        it intentionally violates Map’s general contract, which mandates the use of the equals method when
        comparing objects.

        IdentityHashMap uses equality operator “==” for comparing keys and values while HashMap uses equals
        method for comparing keys and values inside Map.
        Since IdentityHashMap doesn’t use equals() its comparatively faster than HashMap for object with
        expensive equals().
        IdentityHashMap doesn’t require keys to be immutable as it is not relied on equals().
*/

public class IdentityHashMapExample {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        Map<String, String> ihm = new IdentityHashMap<>();

        hm.put("key1", "key1");
        hm.put(new String("key1"), "key1");

        ihm.put("key1", "key1");
        ihm.put(new String("key1"), "key1");

        System.out.println(hm.size());
        System.out.println(ihm.size());


    }
}
