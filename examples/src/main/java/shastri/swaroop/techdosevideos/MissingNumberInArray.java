package shastri.swaroop.techdosevideos;

//https://www.youtube.com/watch?v=6KHW7ZQwtCA
public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};

        int tmp = 0;
        int tmp1 = 0;

        for(int i=1; i<6;i++){
            tmp = tmp^i;
   //         System.out.println(tmp);

        }
        System.out.println("===================");
        for(int i=0;i< arr.length;i++){
            tmp1 = tmp1^arr[i];
  //          System.out.println(tmp1);

        }
        System.out.println(tmp^tmp1);

    }


}
