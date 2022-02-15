package Top_K_Elements;

import java.util.*;

/*
* Given a string, sort it based on the decreasing frequency of its characters.
*/
class FrequencySort {

    public static String sortCharacterByFrequency(String str) {
        // TODO: Write your code here

        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);

        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<Map.Entry<Character, Integer>>(
                (n1, n2)-> n2.getValue() - n1.getValue());

        maxHeap.addAll(map.entrySet());

        StringBuilder builder = new StringBuilder();

        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for(int i=0; i<entry.getValue(); i++){
                builder.append(entry.getKey());
            }
        }



        return builder.toString();
    }

    public static void main(String[] args) {
        String result = FrequencySort.sortCharacterByFrequency("Programming");
        System.out.println("Here is the given string after sorting characters by frequency: " + result);

        result = FrequencySort.sortCharacterByFrequency("abcbab");
        System.out.println("Here is the given string after sorting characters by frequency: " + result);
    }
}
