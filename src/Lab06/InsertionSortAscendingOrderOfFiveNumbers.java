package Lab06;

import java.util.Scanner;
/**
 * Insertion Sort in Ascending order of 5 numbers
 * @author Hugo
 *
 */
public class InsertionSortAscendingOrderOfFiveNumbers {
	public static void main(String[] args) 
	{
		int n = 5;
		int numbers[] = new int[n];

		System.out.println("introduza os numeros aleatoriamente:");

		Scanner kb = new Scanner(System.in);

		// Get the numbers from input.
		for (int i = 0; i < n; i++)
		{
			numbers[i] = kb.nextInt();
		}

		// Order the numbers in ascending order.
		for (int i = 1; i < numbers.length; i++)
		{
			int key = numbers[i];
			int j = i - 1;

			while(j >=0 && numbers[j] > key)
			{
				numbers[j+1] = numbers[j];
				j--;
			}
			numbers[j + 1] = key;

		}

		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + ((i == numbers.length - 1)? "" : "."));
	}

}

