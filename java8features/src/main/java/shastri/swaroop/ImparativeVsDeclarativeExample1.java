package shastri.swaroop;

import java.util.stream.IntStream;

public class ImparativeVsDeclarativeExample1 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println("Imparative : " + sum);

		int sum1 = IntStream.rangeClosed(0,100)
					.parallel()
					.sum();

		System.out.println("Declarative : " + sum1);

	}

}
