package shastri.swaroop;

import java.util.stream.*;

public class JavaStreams {

	public static void main(String[] args) {
		IntStream.range(1,10).forEach(System.out::print);
		System.out.println();
		IntStream.range(1, 9).skip(5).forEach(x->System.out.println(x));
	}

}
