package Lab16;

/**
 * This class sort an array by using the insertion sort algorithm
 * @author Hugo
 *
 */
public class AscendingSort extends Transform {

	/**
	 * Description of the class
	 */
	public AscendingSort()
	{
		super ("AscendigSort");
	}
	
	/**
	 * This method sort an array using the insertion sort algorithm
	 */
	@Override
	public int[] execute (int []a)
	{
		for (int i = 1; i < a.length; i++) 
		{
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) 
			{
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		return a;
	}
	
}
