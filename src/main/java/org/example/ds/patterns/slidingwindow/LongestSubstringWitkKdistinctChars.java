package org.example.ds.patterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWitkKdistinctChars {
    public static void main(String[] args) {
        String str = "araaci";
        int res = findLongestSubString(str, 2);
        System.out.println(res);
    }

    static int findLongestSubString(String str, int k) {
        int maxLength = 0;
        int windowStart = 0;
        Map<Character, Integer> distinctCharMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {

            distinctCharMap.put(str.charAt(windowEnd), distinctCharMap.getOrDefault(str.charAt(windowEnd), 0) + 1);

            while (distinctCharMap.size() > k) {
                //reduce frequency
                distinctCharMap.put(str.charAt(windowStart), distinctCharMap.get(str.charAt(windowStart)) - 1);

                //remove if character does not exist in string anymore
                if (distinctCharMap.get(str.charAt(windowStart)) == 0) {
                    distinctCharMap.remove(str.charAt(windowStart));
                }
                //shrink window
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}

