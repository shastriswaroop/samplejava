package shastri.swaroop.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {


    static boolean isAnagram(String a, String b) {
        int arr[] =  {19,2,3,5,4,32,1,0};

        Arrays.stream(arr).asLongStream()
                .sorted().forEach(System.out::println);

        // Complete the function
        boolean flag = true;

        if(a==null || a.isEmpty() || b==null || b.isEmpty()){
            return false;
        }

        char aChar[] = a.toLowerCase().toCharArray();
        char bChar[] = b.toLowerCase().toCharArray();

        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for(char ch: aChar){
            Integer count = aMap.get(ch);
            if(count!=null){
                count++;
            } else {
                count = 1;
            }
            aMap.put(ch,count);
        }

        for(char ch: bChar){
            Integer count = bMap.get(ch);
            if(count!=null){
                count++;
            } else {
                count = 1;
            }
            bMap.put(ch,count);
        }
        if(aMap.size()!=bMap.size()){
            flag = false;
        } else {
            Character key  = null;
            for(Map.Entry<Character, Integer> entry: aMap.entrySet()){
                key = entry.getKey();
                if(aMap.get(key)!=bMap.get(key)){
                    flag = false;
                    break;
                }
            }
            for(Map.Entry<Character, Integer> entry: bMap.entrySet()){
                key = entry.getKey();
                if(aMap.get(key)!=bMap.get(key)){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String a = "anagrams";
        String b = "managra";

        System.out.println(isAnagram(a,b));
    }
}
