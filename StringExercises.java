/*** Note to student - Copy and paste this file into Eclipse as PA13.java */
/*
 * Name: 
 * Block: 
 * Program: PA13 
 * Date:
 */

public class StringExercises {

	/*
	 * Given two strings, a and b, return the result of putting them together in the
	 * order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 */
	public static String makeAbba(String a, String b) {
		return null; // Remove this line when you start to code this method.
	}

	/*
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
	 * italic text. In this example, the "i" tag makes <i> and </i> which surround
	 * the word "Yay". Given tag and word strings, create the HTML string with tags
	 * around the word, e.g. "<i>Yay</i>".
	 */
	public static String makeTags(String tag, String word) {
		return null; // Remove this line when you start to code this method.
	}

	/*
	 * Given 2 strings, a and b, return a string of the form short+long+short, with
	 * the shorter string on the outside and the longer string on the inside. The
	 * strings will not be the same length, but they may be empty (length 0).
	 */
	public static String comboString(String a, String b) {
		return null; // Remove this line when you start to code this method.
	}

	/*
	 * Given a string, return a string length 2 made of its first 2 chars. If the
	 * string length is less than 2, use '@' for the missing chars.
	 */
	public static String atFirst(String str) {
		return null; // Remove this line when you start to code this method.
	}

	/*
	 * Given a string, return true if the first 2 chars in the string also appear at
	 * the end of the string, such as with "edited". Return false if sting is not
	 * longer than 2 characters.
	 */
	public static boolean frontAgain(String str) {
		return false; // Remove this line when you start to code this method.
	}

	/*
	 * Given a string, if a length 2 substring appears at both its beginning and
	 * end, return a string without the substring at the beginning, so "HelloHe"
	 * yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
	 * Otherwise, return the original string unchanged.
	 */
	public static String without2(String str) {
		return null; // Remove this line when you start to code this method.
	}

	/*
	 * Given a string, return a string where for every char in the original, there
	 * are two chars. Yes, you will need a loop for this and the rest of this
	 * programming assignment
	 */
	public static String doubleChar(String str) {
		return null; // Remove this line when you start to code this method.
	}

	/*
	 * Return the number of times that the string "hi" appears anywhere in the given
	 * string.
	 */
	public static int countHi(String str) {
		return 0; // Remove this line when you start to code this method.
	}

	/*
	 * We'll say that a String is xy-balanced if for all the 'x' chars in the
	 * string, there exists a 'y' char somewhere later in the string. So "xxy" is
	 * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if
	 * the given string is xy-balanced.
	 */
	public static boolean xyBalance(String str) {
		return false; // Remove this line when you start to code this method.
	}

	/*
	 * Main method. It starts out next to blank. You can create Strings and test
	 * your code here if you would like by calling each method and printing out to
	 * the console. An example of using makeAbba() is provided for you.
	 */
	public static void main(String[] args) {
		String a = "Hi"; // Makes a String called "a"
		String b = "Bye"; // Makes a String called "b"
		String c = makeAbba(a, b); // Makes a String called "c" and sets it to the result of makeAbba();
		System.out.println("makeAbba prints: " + c); // Prints the value of c
		// You should test your other code here! 

	}
}
