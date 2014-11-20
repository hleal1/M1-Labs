package Lab16;
/**
 * Class to invert an array
 * @author Hugo
 *
 */
public class Invert extends Transform{

	public Invert()
	{
		super("Invert");
	}
	
	/**
	 * This method inverts an array
	 */
	@Override
	public int[] execute (int []a)
	{
		int[] invertA = new int[a.length];	// cria um novo array com o número de elementos igual ao array a
		int j = invertA.length-1;			// número do indice do último elemento do array

		for (int i=0; i < a.length; i++)	// coloca no novo array invertA os elementos do array a pela ordem inversa
		{		
			invertA[j] = a[i];
			j--;
		}
		return invertA;
	}
}
