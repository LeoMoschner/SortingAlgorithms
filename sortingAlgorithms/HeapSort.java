package sortingAlgorithms;

public class HeapSort extends SortUtil {

	public void heapSort(int[] inputArray, int orderSelection) {

		HeapSort ob = new HeapSort();
		ob.sort(inputArray, orderSelection);
	}

	public void sort(int[] inputArray, int orderSelection) {

		int n = inputArray.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--) {
			
			heapify(inputArray, n, i, orderSelection);
		}

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = inputArray[0];
			inputArray[0] = inputArray[i];
			inputArray[i] = temp;

			// call max heapify on the reduced heap
			heapify(inputArray, i, 0, orderSelection);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in inputArray[]. n is size of heap

	private void heapify(int[] inputArray, int n, int i, int orderSelection) {

		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (orderSelection == 1) {

			if (l < n && inputArray[l] > inputArray[largest]) {
				
				largest = l;
			}

			if (r < n && inputArray[r] > inputArray[largest]) {
				
				largest = r;
			}
		} else {
			if (l < n && inputArray[l] < inputArray[largest]) {
				
				largest = l;
			}

			if (r < n && inputArray[r] < inputArray[largest]) {
				
				largest = r;
			}
		}
		// If largest is not root
		if (largest != i) {

			swapArrayValues(inputArray, i, largest);

			// Recursively heapify the affected sub-tree
			heapify(inputArray, n, largest, orderSelection);
		}
	}

	public void heapSort(char[] inputArray, int orderSelection) {

		HeapSort ob = new HeapSort();
		ob.sort(inputArray, orderSelection);
	}

	public void sort(char[] inputArray, int orderSelection) {

		int n = inputArray.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			
			heapify(inputArray, n, i, orderSelection);
		}
		
		for (int i = n - 1; i >= 0; i--) {

			char temp = inputArray[0];
			inputArray[0] = inputArray[i];
			inputArray[i] = temp;

			heapify(inputArray, i, 0, orderSelection);
		}
	}

	private void heapify(char[] inputArray, int n, int i, int orderSelection) {

		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (orderSelection == 1) {

			if (l < n && inputArray[l] > inputArray[largest]) {
				largest = l;
			}

			if (r < n && inputArray[r] > inputArray[largest]) {
				largest = r;
			}
		} else {
			if (l < n && inputArray[l] < inputArray[largest]) {
				largest = l;
			}

			if (r < n && inputArray[r] < inputArray[largest]) {
				largest = r;
			}
		}

		if (largest != i) {

			swapArrayValues(inputArray, i, largest);
			heapify(inputArray, n, largest, orderSelection);
		}
	}

}