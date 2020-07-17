package shastri.swaroop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImparativeVsDeclarativeExample2 {
	public static void main(String args[]) {

		List<Integer> intList = Arrays.asList(1,2,3,4,2,2,1,1,4,5);
		List<Integer> uniqueList = new ArrayList<Integer>();
		for(Integer integer:intList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println(uniqueList);

		List<Integer> uniqueList1 = intList.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(uniqueList1);

	}
}
