package com.ashiq;


import leetCode.SortAnArray_912;
import sorting.QuickSort;

public class MainClass {

	public static void main(String[] args) {
		
		int[] theArray = {6,1,9,6,5,7,3};
		SortAnArray_912 anArray_912 = new SortAnArray_912();
		int[] nums = anArray_912.sortArray(theArray, 0, theArray.length-1);
		
		
		for(int item : nums) {
			System.out.println(item);
		}
	}

}
