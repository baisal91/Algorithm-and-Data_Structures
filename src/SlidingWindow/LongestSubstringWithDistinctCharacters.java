package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithDistinctCharacters {

    public static void main(String[] args) {
        String s  = "aabccbb";  //3

        System.out.println(findLength(s));

    }

    public static int findLength1(String str) {
        // TODO: Write your code here
        if(str.length() == 0 || str == null) throw new IllegalArgumentException();

        int max =Integer.MIN_VALUE;
        int slideByOne = 0;
        int count=0;

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            Character c = str.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0) +1);
                count++;
                max=Math.max(max, count);
            }else{
                map.remove(str.charAt(slideByOne));
                slideByOne++;
                i--;
                count = 0;
            }

        }



        return max;
    }

    public static int findLength(String str) {
        // TODO: Write your code here

        if(str.length() == 0 || str == null) throw new IllegalArgumentException();

        HashMap<Character, Integer> map = new HashMap();
        int slideByOne = 0;
        int max_length = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char l = str.charAt(i);
            if(!map.containsKey(l)){
                map.put(l, 1);
                count++;
            }else{
                map.remove(str.charAt(slideByOne));
                slideByOne++;
                i--;
                count--;
            }
            max_length = Math.max(max_length, count);
        }

        return max_length;
    }

}
