package Lab06;
/**
 * Insertion Sort algorithm with ascending order
 * @author Hugo
 *
 */
public class InsertionSortAscendingOrder {

	public static void main(String[] args) {

		int[] numbers = { 3, 1, 2, 0, 7, 5, 8, 9, -1 };
		for (int i = 1; i < numbers.length; i++) 
		{
			int key = numbers[i];
			int j = i - 1;

			while (j >= 0 && numbers[j] > key) 
			{
				numbers[j + 1] = numbers[j];
				j--;
			}
			numbers[j + 1] = key;
		}
		printValues(numbers);
	}
	/**
	 * Prints all elements of an Array of int 
	 * @param numbers
	 */
	private static void printValues(int[] numbers) 
	{
		for (int i = 0; i < numbers.length; ++i)
			System.out.print(numbers[i] + " ");
	}

}
