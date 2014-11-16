package Lab09;

import java.util.Arrays;

public class StringUtils {

	/**
	 * Counts the number of times that a char occurs in the original string
	 * 
	 * @param original
	 *            The original sentence
	 * @param c
	 *            The char to find in the sentence
	 * @return The number of times the char c occurs in the sentence
	 */
	public int countLetters(String original, char c) {

		int charCTimes = 0;

		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) == c)
				charCTimes++;
		}
		return charCTimes;
	}

	/**
	 * Indicates if the original sentence contains another sentence
	 * 
	 * @param original
	 *            The original sentence
	 * @param toFind
	 *            The sentence to find
	 * @return A string with the result
	 */
	public String exists(String original, String toFind) {
		if (original.contains(toFind))

			return toFind + " exists in " + original;
		else
			return toFind + " doesn't exists in " + original;
	}

	/**
	 * Sorts the chars in a the original sentence
	 * 
	 * @param original
	 *            The original sentence
	 * @return The string sorted
	 */
	public String sort(String original) {
		char[] stringSorted = original.toCharArray();
		Arrays.sort(stringSorted);
		return String.valueOf(stringSorted);
	}

	/**
	 * Returns a String that is a substring of the original sentence
	 * 
	 * @param original
	 *            The original sentence
	 * @param start
	 *            The index that starts the cut
	 * @param end
	 *            The index that ends the cut
	 * @return The substring of the original sentence, from start to end
	 */

	public String cutFrom(String original, int start, int end) {
		return original.substring(start, end);
	}
}