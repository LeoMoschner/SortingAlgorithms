package sortingAlgorithms;

import java.util.Random;

public class SortUtil {

	public static void printArray(int[] inputArray) {
		
		System.out.printf("\t");

		for (int i = 0; i < inputArray.length; i++) {

			System.out.printf(inputArray[i] + " ");
		}
		
		System.out.println();
	}

	public static void printArray(char[] inputArray) {
		
		System.out.printf("\t");

		for (int i = 0; i < inputArray.length; i++) {

			System.out.printf(inputArray[i] + " ");
		}
		
		System.out.println();
	}

	private static void printOutput(int[] inputArray) {

		System.out.println("\n\tSorted numeric array:");
		printArray(inputArray);
	}

	private static void printOutput(char[] inputArray) {
		
		System.out.println("\n\tSorted letter array:");
		printArray(inputArray);
	}

	protected static void swapArrayValues(int[] inputArray, int firstIndex, int secondIndex) {

		int memAux = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[secondIndex];
		inputArray[secondIndex] = memAux;
	}

	protected static void swapArrayValues(char[] inputArray, int firstIndex, int secondIndex) {

		char memAux = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[secondIndex];
		inputArray[secondIndex] = memAux;
	}

	private static void randomizeArray(int[] inputArray) {
		
		Random rand = new Random();
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = rand.nextInt(10000);

		}
	}

	private static void randomizeArray(char[] inputArray) {
		
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < inputArray.length; i++) {
			
			int randomIndex = new Random().nextInt(letters.length());
			inputArray[i] = letters.charAt(randomIndex);
		}
	}

	public int[] createRandomNumbersArray() {

		int[] numbers = new int[15];
		randomizeArray(numbers);
		System.out.println("Automatically created numeric array with random values:");
		printArray(numbers);
		return (numbers);
	}

	public char[] createRandomLettersArray() {
		
		char[] letters = new char[20];
		randomizeArray(letters);
		System.out.println("Automatically created char array with random letters:");
		printArray(letters);
		return (letters);
	}

	public void applySorting(int[] inputArray, int orderSelection, int sortMethodSelection) {
		
		switch (sortMethodSelection) {
		
		case 1: // BubbleSort
			BubbleSort bubbleSorting = new BubbleSort();
			bubbleSorting.bubbleSort(inputArray, orderSelection);
			System.out.println("\nBubble Sort");
			printOutput(inputArray);
			break;

		case 2: // HeapSort
			HeapSort heapSorting = new HeapSort();
			heapSorting.heapSort(inputArray, orderSelection);
			System.out.println("\nHeap Sort");
			printOutput(inputArray);
			break;

		case 3: // InsertionSort
			InsertionSort insertionSorting = new InsertionSort();
			insertionSorting.insertionSort(inputArray, orderSelection);
			System.out.println("\nInsertion Sort");
			printOutput(inputArray);
			break;

		case 4: // MergeSort
			MergeSort mergeSorting = new MergeSort();
			mergeSorting.mergeSort(inputArray, orderSelection);
			System.out.println("\nMerge Sort");
			printOutput(inputArray);
			break;

		case 5: // SelectionSort
			SelectionSort selectionSorting = new SelectionSort();
			selectionSorting.selectionSort(inputArray, orderSelection);
			System.out.println("\nSelection Sort");
			printOutput(inputArray);
			break;

		case 6: // All Sorts
			BubbleSort bubbleSortingAll = new BubbleSort();
			bubbleSortingAll.bubbleSort(inputArray, orderSelection);
			System.out.println("\nBubble Sort");
			printOutput(inputArray);

			HeapSort heapSortingAll = new HeapSort();
			heapSortingAll.heapSort(inputArray, orderSelection);
			System.out.println("\nHeap Sort");
			printOutput(inputArray);

			InsertionSort insertionSortingAll = new InsertionSort();
			insertionSortingAll.insertionSort(inputArray, orderSelection);
			System.out.println("\nInsertion Sort");
			printOutput(inputArray);

			MergeSort mergeSortingAll = new MergeSort();
			mergeSortingAll.mergeSort(inputArray, orderSelection);
			System.out.println("\nMerge Sort");
			printOutput(inputArray);

			SelectionSort selectionSortingAll = new SelectionSort();
			selectionSortingAll.selectionSort(inputArray, orderSelection);
			System.out.println("\nSelection Sort");
			printOutput(inputArray);

			break;
		}
	}

	public void applySorting(char[] inputArray, int orderSelection, int sortMethodSelection) {
		
		switch (sortMethodSelection) {
		
		case 1: // BubbleSort
			BubbleSort bubbleSorting = new BubbleSort();
			bubbleSorting.bubbleSort(inputArray, orderSelection);
			System.out.println("\nBubble Sort");
			printOutput(inputArray);
			break;

		case 2: // HeapSort
			HeapSort heapSorting = new HeapSort();
			heapSorting.heapSort(inputArray, orderSelection);
			System.out.println("\nHeap Sort");
			printOutput(inputArray);
			break;

		case 3: // InsertionSort
			InsertionSort insertionSorting = new InsertionSort();
			insertionSorting.insertionSort(inputArray, orderSelection);
			System.out.println("\nInsertion Sort");
			printOutput(inputArray);
			break;

		case 4: // MergeSort
			MergeSort mergeSorting = new MergeSort();
			mergeSorting.mergeSort(inputArray, orderSelection);
			System.out.println("\nMerge Sort");
			printOutput(inputArray);
			break;

		case 5: // SelectionSort
			SelectionSort selectionSorting = new SelectionSort();
			selectionSorting.selectionSort(inputArray, orderSelection);
			System.out.println("\nSelection Sort");
			printOutput(inputArray);
			break;

		case 6: // All Sorts
			BubbleSort bubbleSortingAll = new BubbleSort();
			bubbleSortingAll.bubbleSort(inputArray, orderSelection);
			System.out.println("\nBubble Sort");
			printOutput(inputArray);

			HeapSort heapSortingAll = new HeapSort();
			heapSortingAll.heapSort(inputArray, orderSelection);
			System.out.println("\nHeap Sort");
			printOutput(inputArray);

			InsertionSort insertionSortingAll = new InsertionSort();
			insertionSortingAll.insertionSort(inputArray, orderSelection);
			System.out.println("\nInsertion Sort");
			printOutput(inputArray);

			MergeSort mergeSortingAll = new MergeSort();
			mergeSortingAll.mergeSort(inputArray, orderSelection);
			System.out.println("\nMerge Sort");
			printOutput(inputArray);

			SelectionSort selectionSortingAll = new SelectionSort();
			selectionSortingAll.selectionSort(inputArray, orderSelection);
			System.out.println("\nSelection Sort");
			printOutput(inputArray);
			break;
		}
	}
}
