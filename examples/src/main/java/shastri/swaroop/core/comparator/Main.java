package shastri.swaroop.core.comparator;
import java.util.*;

public class Main {

    public static Comparator <Time> cmpTime = new Comparator<Time>() {
        @Override
        public int compare(Time o1, Time o2) {

            if(o1.getHr()>o2.getHr()){
                return -11;
            } else if(o1.getHr()<o2.getHr()){
                return 1;
            } else {
                if(o1.getMin()>o2.getMin()){
                    return -11;
                } else if(o1.getMin() < o2.getMin()){
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    };
    public static void main(String[] args) {

        List<Time> lst = new ArrayList<>();
        lst.add(new Time(10,23));
        lst.add(new Time(11,23));
        lst.add(new Time(10,21));
        lst.add(new Time(20,21));
        lst.add(new Time(18,21));

        Collections.sort(lst);

        for(Time time: lst){
            System.out.println(time);
        }

        System.out.println("========= Print reverse:::: ===============");
        lst.sort(cmpTime);
        lst.stream()
        .sorted(cmpTime)
        //.forEach((time)->System.out.println(time));
        .forEach(System.out::println);
    }
}
