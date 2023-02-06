package com.ashiq.leetcode;

public class ShuffletheArray_1470 {
	 public int[] shuffle(int[] nums, int n) {
	        int[] newArray = new int[n*2];
	        for(int i = 0, j=0; i < n; i++){
	                newArray[2*i] = nums[i];
	                newArray[2*i+1] = nums[n+i];
	            }
	        return newArray;
	    }
}
