
public class NumPal {
	long curNum;
	long revNum;
	String curString;
	String revString;
	
	public NumPal(String intNumber){
		curString = intNumber;
	}
	public long getCur() {
		curNum = Long.parseLong(curString);
		return curNum;
	}
	public long getRev() {
		revNum = Long.parseLong(revString);
		return revNum;
	}
	public NumPal next() {
		curNum = Long.parseLong(curString);
		revNum = reverseLong(curNum);
		
		return new NumPal(String.valueOf(curNum + revNum));
		
	}
	public boolean isPalindrome() {
		revString = reverseString(curString);
		if(curString.equals(revString)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		revString = reverseString(curString);
		return curString + " reverse-> " + revString;  
	}
	private long reverseLong(long init) {
		String initString = String.valueOf(init);
		String reversedString = "";
		for(int i = initString.length(); i > 0; i--) {
			reversedString += initString.substring(i-1,i);
		}
		init = Long.parseLong(reversedString);
		return init;
	}
	private String reverseString(String s) {
		String reversedString = "";
		for(int i = s.length(); i > 0; i--) {
			reversedString += s.substring(i-1,i);
		}
		return reversedString;
	}
}
