package Lab06;

import java.util.Scanner;
/**
 * Insertion Sort in descending order of n numbers
 * @author Hugo
 *
 */
public class InsertionSortDescendingOrderOfNNumbers {

	public static void main(String[] args) 
	{	//get the number of elements
		System.out.println("introduza o n�mero de elementos:");

		Scanner input = new Scanner (System.in);

		int n = input.nextInt();
		int numbers[] = new int[n];

		System.out.println("introduza os numeros aleatoriamente:");

		Scanner kb = new Scanner(System.in);

		// Get the numbers from input.
		for (int i = 0; i < n; i++)
		{
			numbers[i] = kb.nextInt();
		}

		// Order the numbers in descending order.
		for (int i = 1; i < numbers.length; i++)
		{
			int key = numbers[i];
			int j = i - 1;

			while(j >=0 && numbers[j] < key)
			{
				numbers[j+1] = numbers[j];
				j--;
			}
			numbers[j+1] = key;

		}

		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + ((i == numbers.length - 1)? "" : "."));
	}

}