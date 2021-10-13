
public class NumPal {
	long curNum;
	long revNum;
	String curString;
	String revString;

	/**
	 * Constructs a NumPal object with an initial number
	 * 
	 * @param intNumber initial value for the number as a String
	 */
	public NumPal(String intNumber) {
		curString = intNumber;
	}

	/**
	 * Converts current string into number and returns that number
	 * 
	 * @return returns a the current number as a long data type
	 */
	public long getCur() {
		curNum = Long.parseLong(curString);
		return curNum;
	}

	/**
	 * Converts reversed string into number and returns that number
	 * 
	 * @return returns a the reversed number as a long data type
	 */
	public long getRev() {
		revNum = Long.parseLong(revString);
		return revNum;
	}

	/**
	 * sets the current number and reverse number variables to correct values, then
	 * returns a new NumPal object with the sum of the reversed and current number
	 * 
	 * @return returns new NumPal with String version of reversed and current number
	 */
	public NumPal next() {
		curNum = Long.parseLong(curString);
		revNum = reverseLong(curNum);

		return new NumPal(String.valueOf(curNum + revNum));

	}

	/**
	 * sets correct value for reversed String, then checks if they current and
	 * reversed string are equal. If they are then it is a palindrome and returns
	 * <code>true</code> and otherwise returns <code>false</code>
	 * 
	 * @return
	 */
	public boolean isPalindrome() {
		revString = reverseString(curString);
		// if the current string and the reversed string are equal, it's a palindrome,
		// otherwise its not
		if (curString.equals(revString)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * sets the correct value for reverseString, then returns the current string and
	 * the reversed string
	 */
	public String toString() {
		revString = reverseString(curString);
		return curString + " reverse-> " + revString;
	}

	/**
	 * turns a long to a string, reverses it, then converts it into a long and
	 * returns that long
	 * 
	 * @param init used for initial number in the reverse long program
	 * @return returns the reversed long
	 */
	private long reverseLong(long init) {
		String initString = String.valueOf(init);
		String reversedString = "";
		// for the length of the string value of init, the for loop runs, adding back to
		// a reversed string in backwards order
		for (int i = initString.length(); i > 0; i--) {
			reversedString += initString.substring(i - 1, i);
		}
		init = Long.parseLong(reversedString);
		return init;
	}

	/**
	 * takes an input string s and reverses it
	 * 
	 * @param s input string that is reversed
	 * @return returns the reversed string
	 */
	private String reverseString(String s) {
		String reversedString = "";
		// runs for the length of the initial string backwards to set the reversedString
		// variable to the reverse of the initial string
		for (int i = s.length(); i > 0; i--) {
			reversedString += s.substring(i - 1, i);
		}
		return reversedString;
	}
}
