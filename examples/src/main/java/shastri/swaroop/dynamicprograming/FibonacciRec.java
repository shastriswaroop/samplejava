package shastri.swaroop.dynamicprograming;

public class FibonacciRec {
    public static int getFibonacci(int x){
        if(x==0)
            return 0;
        if(x==1)
            return 1;
        return getFibonacci(x-1) +getFibonacci(x-2);
    }

    public static void main(String[] args) {
        System.out.println(getFibonacci(5));
    }
}
