package shastri.swaroop.techdosevideos;

//https://www.youtube.com/watch?v=qEIGhVtZ-sg
public class LargestNumberFromArray {
    public static void main(String[] args) {
        int arr[] = {8,10,9};
        // 934330
        int ptr =0;
        int tmp;
        while(ptr< arr.length-1){
            if(isShiftRequired(arr[ptr], arr[ptr+1])){
                tmp = arr[ptr];
                arr[ptr] = arr[ptr+1];
                arr[ptr+1] = tmp;
                ptr =0;
            } else {
                ptr++;
            }
        }
        for(int a:arr){
            System.out.print(a);
        }
    }

    private static boolean isShiftRequired(int left, int right){
        String tmpNumber1 = left +"" +right;
        String tmpNumber2 = right +"" +left;
        if(Integer.parseInt(tmpNumber2)>Integer.parseInt(tmpNumber1)){
            return true;
        }
        return false;
    }
}
