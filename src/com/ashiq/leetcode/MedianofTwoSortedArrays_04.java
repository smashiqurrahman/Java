package com.ashiq.leetcode;

public class MedianofTwoSortedArrays_04 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double answer = 0;

		int[] newArray = new int[nums1.length + nums2.length];
		System.arraycopy(nums1, 0, newArray, 0, nums1.length);
		System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);

		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {
				if (newArray[i] > newArray[j]) {
					int temp = newArray[i];
					newArray[i] = newArray[j];
					newArray[j] = temp;
				}
			}
		}

		if (newArray.length % 2 != 0) {
			answer = newArray[newArray.length / 2];
			return answer;
		} else {
			answer = Double.valueOf(newArray[(newArray.length / 2)] + newArray[(newArray.length / 2) - 1]) / 2;
			return answer;
		}
	}
}
