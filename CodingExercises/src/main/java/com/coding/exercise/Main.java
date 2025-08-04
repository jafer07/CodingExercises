package com.coding.exercise;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] nums1 = {0};
//        int m = 0;
//        int[] nums2 = {1};
//        int n = 1;
//        MergeArray.merge(nums1, m, nums2, n);

//        int[] nums = {0,1,2,2,3,0,4,2};
//        int val = 2;
//        RemoveElement.removeElement(nums, val);
//
//        int[] nums1 = {1,1,2,2,2,3,4,5,5,6};
//        RemoveDuplicatesFromSortedArray.removeDuplicates(nums1);

//        int[] nums2 = {1,2,3,4,5,6,7};
//        RotateArray.rotate(nums2, 3);
          int[] nums = {2,7,11,15};
          int[] result = TwoSumII.twoSum(nums,9);
          System.out.println(Arrays.toString(result));
    }
}