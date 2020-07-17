package shastri.swaroop;

import java.util.Comparator;

public class ComparatorLamdaExample {
    public static void main(String[] args) {
        // before java 8
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // o1=o2
            }
        };

        System.out.println(cmp.compare(2,3));
        Comparator<Integer> cmp1 = (Integer a,Integer b) -> a.compareTo(b);

    }


}
