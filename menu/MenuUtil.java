package menu;
import java.util.Scanner;

public class MenuUtil {

	@SuppressWarnings("resource")

	protected String userInput() {
		Scanner input = new Scanner(System.in);
		String scannerSelection = input.nextLine();
		return scannerSelection;
	}

	protected static boolean checkUserNumArrayInput(String inputSelection) {

		if (inputSelection.isEmpty()) {
			System.out.println("ERROR: You must enter the numbers with a blank space between eachother."
					+ "\n\tExample: -23 45 2 -6 1238 29 -68 +38");
			return false;

		} else {

			if (inputSelection.matches("[+-]?\\d[[+-]?[\\d+ ]]*")) { // Couldn't find the correct regular expression :(
																		// It breaks when input is like 25+25+63
																		// (without spaces);
				return true;

			} else {

				System.out.println("ERROR: You must enter the numbers with a blank space between eachother."
									+ "\n\tExample: -23 45 2 -6 1238 29 -68 +38");

				return false;
			}
		}
	}

	// Checks that the string isn't empty, if it can be taken as an int and if it's
	// in the possible menu selections range.

	protected static boolean checkSelections(String inputSelection, int possibleSelections) {

		if (inputSelection.isEmpty()) {

			System.out.println("ERROR: Selection must be a number between 1 and " + possibleSelections + ".\n");
			return false;

		} else {

			if (inputSelection.matches("[+-]?\\d*")) {

				if (Integer.parseInt(inputSelection) > 0 && Integer.parseInt(inputSelection) <= possibleSelections) {
					return true;

				} else {

					System.out.println("ERROR: Selection must be a number between 1 and " + possibleSelections + ".\n");
					return false;

				}
			} else {

				System.out.println("ERROR: Selection must be a number between 1 and " + possibleSelections + ".\n");
				return false;
			}
		}
	}
}
