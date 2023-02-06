package com.ashiq;

import com.ashiq.leetcode.ShuffletheArray_1470;

public class MainClass {

	public static void main(String[] args) {
		
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		
		ShuffletheArray_1470 array_1470 = new ShuffletheArray_1470();
		int[] returnArray = array_1470.shuffle(nums, n);
		
		for(int i : returnArray) {
			System.out.print(i + " ");		
		}
	}

}
