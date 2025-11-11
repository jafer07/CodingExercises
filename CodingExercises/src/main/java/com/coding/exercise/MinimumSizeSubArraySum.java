package com.coding.exercise;

public class MinimumSizeSubArraySum {

//    public static int minSubArrayLen(int target,int[] nums) {
//        int resultLen=0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = nums[i];
//            for (int j = i+1; j < nums.length ; j++) {
//                sum = sum + nums[j];
//                if (sum >= target && (resultLen > (j-i+1) || resultLen ==0)){
//                    resultLen = j-i+1;
//                }
//                if (resultLen != 0 && (j-i+1) > resultLen){
//                    break;
//                }
//            }
//        }
//        return resultLen;
//    }

    public static int minSubArrayLen(int target,int[] nums) {
        int minLen=nums.length;
        int left = 0, sum = 0;

        for (int right = 0; right < nums.length; right++){
            sum += nums[right];

            while (sum >= target){
                minLen = Math.min(minLen, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == nums.length? 0 : minLen;
    }
}
//[2,3,4,2,4,2,3,1] target 10


//[2,3,1,2,4,3] target 7


//[4,1,1,1,3,3,3]





//[2,3,1,2,4,2,1,3] target 8
