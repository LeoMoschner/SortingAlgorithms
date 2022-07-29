package sortingAlgorithms;

public class SelectionSort extends SortUtil {

	public void selectionSort(int[] inputArray, int orderSelection) {

		if (orderSelection == 1) {

			for (int i = 0; i < inputArray.length; i++) {

				int smallerValue = 2147483647, smallerIndex = 0;

				for (int j = i; j < inputArray.length; j++) {

					if (inputArray[j] < smallerValue) {
						
						smallerIndex = j;
						smallerValue = inputArray[j];
					}
				}
				
				swapArrayValues(inputArray, i, smallerIndex);

			}
			
		} else {

			for (int i = 0; i < inputArray.length; i++) {

				int largestValue = 0, largestIndex = 0;

				for (int j = i; j < inputArray.length; j++) {

					if (inputArray[j] > largestValue) {
						largestIndex = j;
						largestValue = inputArray[j];
					}
				}
				
				swapArrayValues(inputArray, i, largestIndex);

			}
		}
	}

	public void selectionSort(char[] inputArray, int orderSelection) {

		if (orderSelection == 1) {

			for (int i = 0; i < inputArray.length; i++) {

				int smallerValue = 2147483647, smallerIndex = 0;

				for (int j = i; j < inputArray.length; j++) {

					if (inputArray[j] < smallerValue) {
						smallerIndex = j;
						smallerValue = inputArray[j];
					}
				}
				
				swapArrayValues(inputArray, i, smallerIndex);

			}
		} else {

			for (int i = 0; i < inputArray.length; i++) {

				int greatestValue = 0, greatestIndex = 0;

				for (int j = i; j < inputArray.length; j++) {

					if (inputArray[j] > greatestValue) {
						greatestIndex = j;
						greatestValue = inputArray[j];
					}
				}
				
				swapArrayValues(inputArray, i, greatestIndex);

			}
		}
	}
}
