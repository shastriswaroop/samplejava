package shastri.swaroop.graphtheory;

import java.util.*;

//https://www.youtube.com/watch?v=EE_9U798nvQ&t=29s
public class RemoveParanthasis {
    boolean isBalanced(String inStr){
        boolean isValid = true;
        int count = 0;

        for(int idx = 0; idx< inStr.length(); idx++){
            if(inStr.charAt(idx)=='(')count++;
            else if(inStr.charAt(idx)==')')count--;
            if(count!=0)      isValid = false;
        }
        return isValid;
    }

    List<String> getAllStrings(String inStr){
        List<String> lstSting = new ArrayList<>();
        String tmpString;
        for(int idx = 0; idx< inStr.length(); idx++) {
            char ch = inStr.charAt(idx);
            if (ch == '(' || ch == ')') {
                if(idx==0)
                    tmpString = inStr.substring(1, inStr.length());
                else if(idx==inStr.length()-1)
                    tmpString = inStr.substring(0, inStr.length() - 1);
                else
                    tmpString = inStr.substring(0, idx-1 ) + inStr.substring(idx, inStr.length() - 1);
                lstSting.add(tmpString);
            }
        }
        return lstSting;
    }

    public static void main(String[] args) {
        String inStr = "(a)())()";
        System.out.println("Original String is :- " + inStr);
        Queue<String> qOfStrings = new PriorityQueue<>();
        qOfStrings.add(inStr);

        RemoveParanthasis obj = new RemoveParanthasis();

        while (qOfStrings.size()!=0){
            String str = qOfStrings.peek();
            if(obj.isBalanced(str)){
                System.out.println(str + "is valid string");

                break;
            } else {
                qOfStrings.remove();
                qOfStrings.addAll(obj.getAllStrings(str));
            }

            }
        }
}
