package leetCode;

public class TwoSum_01 {
	public int[] twoSum(int[] nums, int target) {
		int[] theArray = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int temp = 0;
				temp = nums[i] + nums[j];
				if (temp == target) {
					theArray[0] = i;
					theArray[1] = j;
					return theArray;
				}
			}
		}
		return theArray;
	}
}
