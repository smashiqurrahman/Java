package leetCode;

public class SortAnArray_912 {
	public int[] sortArray(int[] nums, int lowIndex, int highIndex) {
		
		return nums;
	}

}

//--------------------------------------------------------------------
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
//--------------------------------------------------------------------

//--------------------------------------------------------------------
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
//--------------------------------------------------------------------