package sortingAlgorithms;

public class MergeSort extends SortUtil {

	public void mergeSort(int[] inputArray, int orderSelection) {
		
		int inputLength = inputArray.length;

		if (inputLength < 2) {
			
			return;
		}

		int inputMid = (inputLength / 2);
		int[] leftPart = new int[inputMid];
		int[] rightPart = new int[inputLength - inputMid];

		for (int i = 0; i < leftPart.length; i++) {
			
			leftPart[i] = inputArray[i];
		}

		for (int i = 0; i < rightPart.length; i++) {
			
			rightPart[i] = inputArray[inputMid + i];
		}

		mergeSort(leftPart, orderSelection);
		mergeSort(rightPart, orderSelection);

		if (orderSelection == 1) {
			
			orderFromLower(inputArray, leftPart, rightPart);
			
		} else {
			
			orderFromHigher(inputArray, leftPart, rightPart);
		}
	}

	public void mergeSort(char[] inputArray, int orderSelection) {
		
		int inputLength = inputArray.length;

		if (inputLength < 2) {
			
			return;
		}

		int inputMid = (inputLength / 2);
		char[] leftPart = new char[inputMid];
		char[] rightPart = new char[inputLength - inputMid];

		for (int i = 0; i < leftPart.length; i++) {
			
			leftPart[i] = inputArray[i];
		}

		for (int i = 0; i < rightPart.length; i++) {
			
			rightPart[i] = inputArray[inputMid + i];
		}

		mergeSort(leftPart, orderSelection);
		mergeSort(rightPart, orderSelection);

		if (orderSelection == 1) {
			
			orderFromLower(inputArray, leftPart, rightPart);
		} else {
			
			orderFromHigher(inputArray, leftPart, rightPart);
		}
	}

	private static void orderFromLower(int[] inputArray, int[] leftPart, int[] rightPart) {
		
		int leftLength = leftPart.length;
		int rightLength = rightPart.length;
		int l = 0, r = 0, c = 0;

		while (l < leftLength && r < rightLength) {
			
			if (leftPart[l] < rightPart[r]) {
				
				inputArray[c] = leftPart[l];
				l++;
				
			} else {
				
				inputArray[c] = rightPart[r];
				r++;
				
			}
			c++;
		}

		while (l < leftLength) {
			
			inputArray[c] = leftPart[l];
			l++;
			c++;
		}

		while (r < rightLength) {
			
			inputArray[c] = rightPart[r];
			r++;
			c++;
		}
	}

	private static void orderFromHigher(int[] inputArray, int[] leftPart, int[] rightPart) {
		
		int leftLength = leftPart.length;
		int rightLength = rightPart.length;
		int l = 0, r = 0, c = 0;

		while (l < leftLength && r < rightLength) {
			
			if (leftPart[l] > rightPart[r]) {
				
				inputArray[c] = leftPart[l];
				l++;
			} else {
				
				inputArray[c] = rightPart[r];
				r++;
			}
			c++;
		}

		while (l < leftLength) {
			
			inputArray[c] = leftPart[l];
			l++;
			c++;
		}

		while (r < rightLength) {
			
			inputArray[c] = rightPart[r];
			r++;
			c++;
		}
	}

	private static void orderFromLower(char[] inputArray, char[] leftPart, char[] rightPart) {
		
		int leftLength = leftPart.length;
		int rightLength = rightPart.length;
		int l = 0, r = 0, c = 0;

		while (l < leftLength && r < rightLength) {
			
			if (leftPart[l] < rightPart[r]) {
				
				inputArray[c] = leftPart[l];
				l++;
				
			} else {
				
				inputArray[c] = rightPart[r];
				r++;
			}
			c++;
		}

		while (l < leftLength) {
			
			inputArray[c] = leftPart[l];
			l++;
			c++;
		}

		while (r < rightLength) {
			
			inputArray[c] = rightPart[r];
			r++;
			c++;
		}
	}

	private static void orderFromHigher(char[] inputArray, char[] leftPart, char[] rightPart) {
		
		int leftLength = leftPart.length;
		int rightLength = rightPart.length;
		int l = 0, r = 0, c = 0;

		while (l < leftLength && r < rightLength) {
			
			if (leftPart[l] > rightPart[r]) {
				
				inputArray[c] = leftPart[l];
				l++;
				
			} else {
				
				inputArray[c] = rightPart[r];
				r++;
			}
			c++;
		}

		while (l < leftLength) {
			
			inputArray[c] = leftPart[l];
			l++;
			c++;
		}

		while (r < rightLength) {
			
			inputArray[c] = rightPart[r];
			r++;
			c++;
		}
	}

}

