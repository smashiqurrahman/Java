package sorting;

public class QuickSort {
	public int[] quickSort(int[] theArray, int lowIndex, int highIndex) {
		if(lowIndex < highIndex) {
			int pidx = partition(theArray, lowIndex, highIndex);
			
			quickSort(theArray, lowIndex, pidx-1);
			quickSort(theArray, pidx+1, highIndex);
		}
		
		return theArray;
	}
	
	public int partition(int[] theArray, int lowIndex, int highIndex) {
		int pivot = theArray[highIndex];
		int i = lowIndex - 1;

		for (int j = lowIndex; j < highIndex; j++) {
			if (theArray[j] < pivot) {
				i++;
				// swap
				int temp = theArray[i];
				theArray[i] = theArray[j];
				theArray[j] = temp;
			}
		}

		// swap with pivot
		i++;
		int temp = theArray[i];
		theArray[i] = theArray[highIndex];
		theArray[highIndex] = temp;
		return i;
	}
}
