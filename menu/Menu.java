package menu;
import sortingAlgorithms.SortUtil;

public class Menu extends MenuUtil {

	private String statement;
	private int options;
	private int selection;

	public Menu(String statement, int options) {

		this.statement = statement;
		this.options = options;
	}

	public Menu() {

	}

	public String getStatement() {
		
		return this.statement;
	}

	public int getOptions() {
		
		return this.options;
	}

	public int getSelection() {
		
		return this.selection;
	}

	public void setStatement(String statement) {
		
		this.statement = statement;
	}

	public void setOptions(int options) {
		
		this.options = options;
	}

	public void setSelection(int selection) {
		
		this.selection = selection;
	}

	public void printMenu() {
		
		System.out.println(this.statement);
	}

	public int displayMenu() {

		this.printMenu();
		String userInput = this.userInput();
		
		while (checkSelections(userInput, this.options) == false) {
			
			this.printMenu();
			userInput = this.userInput();
		}
		
		this.selection = Integer.parseInt(userInput);
		return this.selection;
	}

	public int[] userInputNumArray() {
		
		this.printMenu();
		String userInput = this.userInput();
		
		while (checkUserNumArrayInput(userInput) == false) {
			
			this.printMenu();
			userInput = this.userInput();
		}
		
		String[] separatedStrings = userInput.replaceAll("\\[", "").split(" ");
		int[] outputArray = new int[separatedStrings.length];
		
		for (int i = 0; i < outputArray.length; i++) {
			
			outputArray[i] = Integer.parseInt(separatedStrings[i]);
		}
		
		System.out.println("Your own numeric array: ");
		SortUtil.printArray(outputArray);
		return outputArray;
	}

	public char[] userInputLettArray() {
		
		this.printMenu();
		String userInput = this.userInput();
		String correctString = userInput.replaceAll("[^A-Za-z]", "");
		char[] outputArray = new char[correctString.length()];

		for (int i = 0; i < outputArray.length; i++) {

			if (Character.isUpperCase(correctString.charAt(i))) {
				
				outputArray[i] = correctString.charAt(i);
				
			} else {
				
				outputArray[i] = Character.toUpperCase(correctString.charAt(i));
			}
		}

		System.out.println("Your own letters array: ");
		SortUtil.printArray(outputArray);
		return outputArray;
	}
}
	

