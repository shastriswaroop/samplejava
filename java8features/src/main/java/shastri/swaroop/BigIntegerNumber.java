package shastri.swaroop;

//9358
// 25 (9+3+5+8
// 7 (2+5)
public class BigIntegerNumber {
    public static long calculateBigInt(String number, int factor){
    //  long bigInt = 0;
    //  char []chars = number.toCharArray();
    //  for(char ch:chars){
    //       bigInt += Character.getNumericValue(ch);
    //  }
        long bigInt = number.chars().mapToLong((ch)->Character.getNumericValue(ch)).sum();

        bigInt = bigInt%9;
        if(bigInt == 0)
            bigInt = 9;

        return bigInt;
    }
    public static void main(String[] args) {
        String inNumber = "9999";
        int k = 4;
        System.out.println(calculateBigInt(inNumber,k));
    }
}
