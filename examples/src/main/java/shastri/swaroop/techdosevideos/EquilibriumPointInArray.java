package shastri.swaroop.techdosevideos;


import java.util.Arrays;

//https://www.youtube.com/watch?v=c9imv2LvgWk&t=511s
public class EquilibriumPointInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,0,9,1,2,3,0,-3};
        int arr1[] = {1,2,3,0,-3};
        int arr2[] = {1,2,0,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,91,2,3,0,-3};
        int arr3[] = {1,3};
        isEquilibriumArray(arr);
        isEquilibriumArray(arr1);
        isEquilibriumArray(arr2);
        isEquilibriumArray(arr3);
    }
    private static void isEquilibriumArray(int [] arr){
        int arrTotal = 0;
        int leftArrSum = 0;
        int rightArrSum = 0;
        //        int arr[] = {1,2,0,9,1,2,3,0,-3};
        if(arr!=null && arr.length!=0){
            int arrSize = arr.length;
            if(arrSize==1){
                System.out.println("EQ point is " + arr[0]);
            } else if(arrSize==2){
                System.out.println("No eq point found as it has size 2");
            } else {
                boolean eqPointFound = false;
                arrTotal = Arrays.stream(arr).sum();

                for(int ptr=1; ptr<arrSize-1;ptr++){
                    leftArrSum += arr[ptr-1];
                    rightArrSum = arrTotal - leftArrSum -arr[ptr];

                    if(leftArrSum==rightArrSum){
                        eqPointFound = true;
                        System.out.println("Equilibrium found at " + ptr);
                        break;
                    }
                }
                if(!eqPointFound)
                    System.out.println("No Equilibrium point found....");
            }

        } else {
            System.out.println("Array is null or blank.");
        }

    }
}
