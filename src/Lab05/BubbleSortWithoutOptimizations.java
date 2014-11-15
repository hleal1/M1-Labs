package Lab05;
/**
 * Bubble Sort Algorithm without any optimization
 * @author Hugo
 *
 */
public class BubbleSortWithoutOptimizations {

	public static void main(String[] args) {
		
		int[] numbers = {3,1,2,0,7,5,8,9, -1};
		for(int i = 0;i < numbers.length; i++)
		{
			for(int j = 1; j < numbers.length; j++)
			{
				if(numbers[j] < numbers[j - 1])
				{
					int temp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = temp;
				}
			}
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
