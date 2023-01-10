/*
912. Sort an Array
Medium
3.1K
596
Companies
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 

Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104 
*/

package leetCode;

public class SortAnArray_912 {
	public int[] sortArray(int[] nums, int lowIndex, int highIndex) {
		
		return nums;
	}

}

///* Accepted but time limit exceeded*/
///*Quick Sort*/
//public int[] sortArray(int[] nums, int lowIndex, int highIndex) {
//
//	if (lowIndex <= highIndex) {
//		int pidx = partition(nums, lowIndex, highIndex);
//
//		sortArray(nums, lowIndex, pidx - 1);
//		sortArray(nums, pidx + 1, highIndex);
//	}
//
//	return nums;
//}
//
//public int partition(int[] theArray, int lowIndex, int highIndex) {
//	int pivot = theArray[highIndex];
//	int i = lowIndex - 1;
//
//	for (int j = lowIndex; j < highIndex; j++) {
//		if (theArray[j] < pivot) {
//			i++;
//			// swap
//			int temp = theArray[i];
//			theArray[i] = theArray[j];
//			theArray[j] = temp;
//		}
//	}
//
//	// swap with pivot
//	i++;
//	int temp = theArray[i];
//	theArray[i] = theArray[highIndex];
//	theArray[highIndex] = temp;
//	return i;
//}

//	/* Accepted but time limit exceeded*/
//	/*Selection Sort*/
//	public int[] sortArray(int[] nums) {
//
//		int temp;
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] > nums[j]) {
//					temp = nums[i];
//					nums[j] = temp;
//					nums[i] = nums[j];
//				}
//			}
//
//			System.out.println(nums[i]);
//		}
//
//		
//		
//
//		return nums;
//	}
