package Lab16;
/**
 * Transform is an abstract class that has all methods used in the subclasses
 * @author Hugo
 *
 */
public abstract class Transform {
	
	private String description;
	
	/**
	 * Description of the transform
	 * @param d description
	 */
	public Transform (String d)
	{
		this.description = d;
	}
	
	/**
	 * This class return the result of a transformations serie
	 * @param a original array
	 * @return a String with all transformations
	 */
	public String executePrint (int[] a)
	{
		String resultTransformation = "My Transformation: [";

		for(int i = 0; i<a.length; i++)
		{
			resultTransformation += a[i];

			if(i < a.length -1)
				resultTransformation += ", ";
		}

		resultTransformation += "] -> [";

		int[] result = execute(a);
		for (int i = 0; i < result.length; i++)
		{
			resultTransformation += result[i];
			
			if(i < result.length -1)
				resultTransformation += ", ";
		}
		
		resultTransformation += "]";
		return resultTransformation;
	}
	
	/**
	 * Abstract method to implement the transformations in the sub classes
	 * @param a original array
	 * @return an array with the transformations
	 */
	public abstract int[] execute (int[] a);
	
}
