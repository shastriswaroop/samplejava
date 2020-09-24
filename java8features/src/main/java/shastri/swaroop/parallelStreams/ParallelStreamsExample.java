package shastri.swaroop.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {
    public static int getSum(){
        return IntStream.rangeClosed(0,100000)
                .sum();
    }
    public static int getSumParallel(){
        return IntStream.rangeClosed(0,100000)
                .parallel()
                .sum();
    }

    public static void printexecutiontime(Supplier sup ){
        long startTime = System.currentTimeMillis();
        System.out.println(sup.get());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        printexecutiontime(ParallelStreamsExample::getSum);
        printexecutiontime(ParallelStreamsExample::getSumParallel);

//        getSum();
 //       getSumParallel();
    }
}
