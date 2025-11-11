package com.coding.exercise;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s){
        int maxLen = 0;
        int left = 0;
        int currentSubStringLength = 0;
        for (int right = 0; right < s.length(); right++) {
            for (int i = left; i < right ; i++) {
                if (s.charAt(i) == s.charAt(right)){
                    left = i+1;
                    break;
                }
            }
            currentSubStringLength = right - left +1;
            maxLen = Math.max(currentSubStringLength, maxLen);
        }
        return maxLen;
    }
}