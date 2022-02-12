package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));

    }

    public static int findLength(String str, int k) {
        if (str == null || str.length() == 0)
            throw new IllegalArgumentException();

        int slideByOne = 0, maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        // in the following loop we'll try to extend the range [windowStart, windowEnd]
        for (int i = 0; i < str.length(); i++) {
            char rightChar = str.charAt(i);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            // shrink the sliding window, until we are left with 'k' distinct characters in the frequency map
            while (map.size() > k) {
                char leftChar = str.charAt(slideByOne);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                slideByOne++; // shrink the window
            }
            maxLength = Math.max(maxLength, i - slideByOne + 1); // remember the maximum length so far
        }

        return maxLength;
    }
}
