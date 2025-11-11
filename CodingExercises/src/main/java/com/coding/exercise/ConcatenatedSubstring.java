package com.coding.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcatenatedSubstring {

//    public static List<Integer> findSubstring(String s, String[] words) {
//        List<Integer> result = new ArrayList<>();
//        List<String> wordList = new ArrayList<>(Arrays.stream(words).toList());
//        List<String> concatenatedWords = new ArrayList<>();
//        int wordLen = words[0].length();
//        int right =0;
//
//        for (int left = 0; left+wordLen <= s.length() ; left++) {
//            right = left + wordLen;
//            String currentWord = s.substring(left, right);
//            while (wordList.contains(currentWord)) {
//                concatenatedWords.add(currentWord);
//                wordList.remove(currentWord);
//                if (wordList.isEmpty()) {
//                    result.add(right - (wordLen * words.length));
//                    break;
//                }
//                if (right+wordLen > s.length()) {
//                    break;
//                }
//                currentWord = s.substring(right, right + wordLen);
//                right += wordLen;
//            }
//            wordList.addAll(concatenatedWords);
//            concatenatedWords.clear();
//        }
//        return result;
//    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> targetFreq = new HashMap<>();
        for (String word:words){
            targetFreq.put(word, targetFreq.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        int wordsCount = words.length;

        for (int offset = 0; offset < wordLen; offset++) {
            int left = offset;
            int right = offset;
            Map<String, Integer> currentFreq = new HashMap<>();
            int count = 0;
            while(right + wordLen <= s.length()) {
                String currentWord = s.substring(right, right + wordLen);
                right += wordLen;

//                in case the word doesnt match
                Integer targetWordCount = targetFreq.get(currentWord);
                if (targetWordCount == null){
                    currentFreq.clear();
                    count = 0;
                    left = right;
                    continue;
                }

//                in case the current word frequency exceed target word frequency
                currentFreq.put(currentWord, currentFreq.getOrDefault(currentWord, 0) + 1);
                count++;
                while (currentFreq.get(currentWord) > targetWordCount){
                    String leftWord = s.substring(left, left + wordLen);
                    left += wordLen;
                    currentFreq.put(leftWord, currentFreq.get(leftWord) - 1);
                    count--;
                }

//                when count is equal to total word count
                if (count == wordsCount){
                    result.add(left);

                    String leftWord = s.substring(left, left + wordLen);
                    left += wordLen;
                    currentFreq.put(leftWord, currentFreq.get(leftWord) - 1);
                    count--;
                }
            }
        }
        return result;
    }
}
