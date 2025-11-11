package com.coding.exercise;

public class MaxWaterContainer {

    public static int maxArea(int[] height) {
        int maxWater = 0;
        int head = 0, tail = height.length -1;
        while (head < tail){
            int currentContainerCapacity = 0;
            if (height[head] >= height[tail]) {
                currentContainerCapacity = (tail - head) * height[tail];
            } else {
                currentContainerCapacity = (tail - head) * height[head];
            }
            maxWater = Math.max(currentContainerCapacity, maxWater);
            if (height[head] >= height[tail]){
                --tail;
            } else {
                ++head;
            }
        }
        return maxWater;
    }
}
// [1,8,6,30,2,5,4,30,8,3,7]