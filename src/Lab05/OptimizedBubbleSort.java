package Lab05;
/**
 * BubbleSort with two optimizations
 *  - In the second for statement the condition "j < numbers.legnt - i" it will skip
 * the already sorted largest elements
 *  - In the condition of the second for statement the variable swapsCount it will represent
 *  the number of swaps, when the number of swaps will be 0 the array is already sorted
 * @author Hugo
 *
 */
public class OptimizedBubbleSort {

	public static void main(String[] args) {

		int[] numbers = {3,1,2,0,7,5,8,9, -1};
		
		for(int i = 0;i < numbers.length; i++)
		{
			int swapsCount = 0;
			
			for(int j = 1; j < numbers.length - i; j++)
			{
				if(numbers[j] < numbers[j - 1])
				{
					int temp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = temp;
					swapsCount++;
				}
			}
			if ( swapsCount == 0)
				break;
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
