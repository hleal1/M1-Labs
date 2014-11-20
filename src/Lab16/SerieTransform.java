package Lab16;

/**
 * This class allows more than one transformation to a specific array
 * @author Hugo
 *
 */
public class SerieTransform extends Transform{

	private int numberOfTransformations;
	private Transform[] transformer;
	private int transformationsExecuted;
	
	/**
	 * Constructs a series of transformations
	 * @param d - description of the series
	 * @param i - number of transformations
	 */
	public SerieTransform(String d, int i)
	{
		super(d);
		this.numberOfTransformations = i;
		transformer = new Transform [numberOfTransformations];
	}

	/**
	 * Adds a transformation to the array of transformations transformer
	 * @param transformation
	 */
	public void addTransformation(Transform transformation) 
	{
		transformer[transformationsExecuted] = transformation;
		transformationsExecuted++;
	}

	/**
	 * Executes all the transformations
	 */
	@Override
	public int[] execute(int[] a) 
	{
		for(int i = 0; i < numberOfTransformations; i++)
		{
			a = transformer[i].execute(a);
		}
		return a;
	}
}
