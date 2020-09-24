package shastri.swaroop.examples;

import java.util.stream.IntStream;

public class SplitList {
    public static int getSplitPoint(int []numbers){
        int index = 0;

        int sumOfNumbers = 0;
        for(int num : numbers){
            sumOfNumbers += num;
        }

//        int sumOfNumbers = IntStream.rangeClosed(0, numbers.length).sum();
        System.out.println(sumOfNumbers);
        int tmpSum = numbers[0];
        int diff = sumOfNumbers - numbers[0];
        if(numbers[0]==diff){
            return 0;
        }
        for(int i=1; i<numbers.length; i++){
            tmpSum += numbers[i];
            if(sumOfNumbers - tmpSum == diff){
                index = i;
                break;
            } else {
                int newDiff = sumOfNumbers - tmpSum;
                if(newDiff>0){
                    if(newDiff < diff){
                        diff = newDiff;
                        index = i;
                    }
                }
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int numbers[] = {15,4,1,2,3,10};// {3,-3, 2, 5,6}; //{4,1,2,3,10};
        System.out.println(getSplitPoint(numbers));
    }
}
