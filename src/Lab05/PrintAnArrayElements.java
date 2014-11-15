package Lab05;

/**
 * Class that prints all elements of an Array of int separated by dots
 * @author Hugo
 *
 */

public class PrintAnArrayElements {

	public static void main(String[] args)
	{
		int[] numbers = {1,3,5,7,9};
		
		for (int i = 0; i <numbers.length; ++i)
		{
			if (i < numbers.length-1)
				System.out.print ( numbers[i] + ".");
			else
				System.out.print ( numbers[i] );
		}
	}
}
