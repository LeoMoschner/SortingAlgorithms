package sortingAlgorithms;

public class BubbleSort extends SortUtil {

	public void bubbleSort(int[] inputArray, int orderSelection) {

		int inputLength = inputArray.length - 1;

		if (orderSelection == 1) {

			for (int leftMark = 0; leftMark < inputLength; leftMark++) {
				
				for (int rightMark = inputLength; leftMark < rightMark; rightMark--) {

					if (inputArray[rightMark] < inputArray[rightMark - 1]) {
						
						swapArrayValues(inputArray, rightMark, rightMark - 1);
					}
				}

			}
			
		} else {
			
			for (int leftMark = 0; leftMark < inputLength; leftMark++) {
				
				for (int rightMark = inputLength; leftMark < rightMark; rightMark--) {

					if (inputArray[rightMark] > inputArray[rightMark - 1]) {
						
						swapArrayValues(inputArray, rightMark, rightMark - 1);
					}
				}

			}
		}
	}

	public void bubbleSort(char[] inputArray, int orderSelection) {

		int inputLength = inputArray.length - 1;

		if (orderSelection == 1) {

			for (int leftMark = 0; leftMark < inputLength; leftMark++) {
				
				for (int rightMark = inputLength; leftMark < rightMark; rightMark--) {

					if (inputArray[rightMark] < inputArray[rightMark - 1]) {
						
						swapArrayValues(inputArray, rightMark, rightMark - 1);
					}
				}

			}
			
		} else {
			
			for (int leftMark = 0; leftMark < inputLength; leftMark++) {
				
				for (int rightMark = inputLength; leftMark < rightMark; rightMark--) {

					if (inputArray[rightMark] > inputArray[rightMark - 1]) {
						swapArrayValues(inputArray, rightMark, rightMark - 1);
					}
				}

			}
		}
	}

}
