package com.ashiq.leetcode;

public class SearchInsertPosition_35 {
	public int searchInsert(int[] nums, int target) {
		boolean isFound = false;
		int position = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				isFound = true;
				return i;
			}
		}

		if (!isFound) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] <= target) {
					position++;
				}
			}
		}
		return position;
	}
}
