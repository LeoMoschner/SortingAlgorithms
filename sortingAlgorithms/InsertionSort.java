package sortingAlgorithms;

public class InsertionSort extends SortUtil {

	public void insertionSort(int[] inputArray, int orderSelection) {

		if (orderSelection == 1) {

			for (int i = 1; i < inputArray.length; i++) {
				
				for (int j = i; j > 0; j--) {
					
					if (inputArray[j] < inputArray[j - 1]) {
						
						swapArrayValues(inputArray, j, j - 1);
						
					} else 						
						break;
					
				}
			}
			
		} else {
			
			for (int i = 1; i < inputArray.length; i++) {
				
				for (int j = i; j > 0; j--) {
					
					if (inputArray[j] > inputArray[j - 1]) {
						
						swapArrayValues(inputArray, j, j - 1);
						
					} else
						break;
				}
			}
		}
	}

	public void insertionSort(char[] inputArray, int orderSelection) {

		if (orderSelection == 1) {

			for (int i = 1; i < inputArray.length; i++) {
				
				for (int j = i; j > 0; j--) {
					
					if (inputArray[j] < inputArray[j - 1]) {
						
						swapArrayValues(inputArray, j, j - 1);
						
					} else
						break;
				}
			}
			
		} else {
			for (int i = 1; i < inputArray.length; i++) {
				
				for (int j = i; j > 0; j--) {
					
					if (inputArray[j] > inputArray[j - 1]) {
						
						swapArrayValues(inputArray, j, j - 1);
					
					} else
						break;
				}
			}
		}
	}
}
