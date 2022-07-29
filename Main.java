import menu.Menu;
import sortingAlgorithms.SortUtil;

public class Main {

	private static int[] numbers;
	private static char[] letters;

	public static void main(String[] args) {

		SortUtil sortUtility = new SortUtil();

		System.out.println("Welcome to the Ultimate Sorting Program!!"
				+ "\n\nIn this program you can sort integer numbers (negative and positives)"
				+ " and also letters. Both from smallest to largest and vice versa."
				+ "\nThis program also prevents erroneous input entered by the user, "
				+ "allowing this one to re-enter the values until they are correct.\n\n");

		Menu dataTypeMenu = new Menu("\tPlease select the data type you want to sort:\n" 
									+ "\t\t 1.\tNumbers.\n" 
									+ "\t\t 2.\tChars.\n", 2);

		Menu orderMenu = new Menu("\tIn which way do you want to perform the sorting?\n"
									+ "\t\t 1.\tFrom smallest to largest.\n" 
									+ "\t\t 2.\tFrom largest to smallest\n", 2);

		Menu randomizeMenu = new Menu("\tDo you want to enter the elements to sort by yourself?\n" 
									+ "\t\t 1.\tYes.\n"
									+ "\t\t 2.\tNo, randomize it\n", 2);

		Menu sortMethodMenu = new Menu("\tWhich method do you preefer to use for the sorting?\n"
										+ "\t\t 1.\tBubble Sort.\n" 
										+ "\t\t 2.\tHeap Sort.\n" 
										+ "\t\t 3.\tInsertion Sort.\n"
										+ "\t\t 4.\tMerge Sort.\n" 
										+ "\t\t 5.\tSelection Sort.\n" 
										+ "\t\t 6.\tYOLO! All of them !!", 6);

		dataTypeMenu.displayMenu();
		orderMenu.displayMenu();
		randomizeMenu.displayMenu();
		sortMethodMenu.displayMenu();

		if (randomizeMenu.getSelection() == 1) {

			// NOT RANDOM

			if (dataTypeMenu.getSelection() == 1) {

				// NUMBERS

				Menu notRandNumMenu = new Menu();
				notRandNumMenu.setStatement("\tPlease enter the numbers to sort with a blank space between eachother"
											+ "\n\tExample: -23 45 2 -6 1238 29 -68 +38");
				numbers = notRandNumMenu.userInputNumArray();
				sortUtility.applySorting(numbers, orderMenu.getSelection(), sortMethodMenu.getSelection());

			} else {

				// LETTERS

				System.out.println("Please enter the letters you want to sort:");
				Menu notRandLettMenu = new Menu();
				notRandLettMenu.setStatement("\tPlease enter the letters to sort, not valid elements will be deleted"
						+ " and lower cases will be converted into upper cases." + "\n\tExample:AASDjdkjsAKSLHUE");
				letters = notRandLettMenu.userInputLettArray();
				sortUtility.applySorting(letters, orderMenu.getSelection(), sortMethodMenu.getSelection());
			}
		} else {

			// RANDOM

			if (dataTypeMenu.getSelection() == 1) {

				// NUMBERS

				numbers = sortUtility.createRandomNumbersArray();
				sortUtility.applySorting(numbers, orderMenu.getSelection(), sortMethodMenu.getSelection());
			} else {

				// LETTERS

				letters = sortUtility.createRandomLettersArray();
				sortUtility.applySorting(letters, orderMenu.getSelection(), sortMethodMenu.getSelection());
			}
		}
	}
}
