package com.coding.exercise;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int head = 0, tail = numbers.length -1;
        int[] result = new int[2];
        if(numbers.length >= 2 && numbers.length <= (3 * Math.pow(10,4)) &&
                target >= -1000 && target <= 1000) {
            while (head <= tail) {
                if (numbers[head] + numbers[tail] == target) {
                    return new int[]{head + 1, tail + 1};
                } else if (numbers[head] + numbers[tail] > target) {
                    tail--;
                } else if (numbers[head] + numbers[tail] < target) {
                    head++;
                }
            }
        }
        return result;
    }
}
