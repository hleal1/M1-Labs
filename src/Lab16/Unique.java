package Lab16;
/**
 * This class creates a new array without any repetitions of elements
 * @author Hugo
 *
 */
public class Unique extends Transform {

	/**
	 * Description of the class
	 */
	public Unique()
	{
		super("Unique");
	}

	/**
	 * This method creates a new array without repeated elements
	 */
	@Override
	public int[] execute (int []a)
	{
		int[] aClone = new int[a.length];		// novo array igual ao original, para salvaguardar que o original não é alterado
		aClone = a;
		int count = 0;							// armazena o número de elementos repetidos

		for (int i = 0; i < a.length; i++)		//percorre todos os elementos do array comparando o elemento da posição i com o da 
		{										//	posição i+1, e se estes forem iguais altera o valor do elemento da poisção i para 0
			for (int j= i+1; j < a.length; j++)	// quando isto acontece é incrementada a variável count
			{
				if(a[i] == a[j] && a[i] != 0)
				{
					aClone[i] = 0;
					count++;
				}
			}
		}
		int[] aUnique = new int[a.length-count];  // novo array com dimensão igual ao array original menos o número de elementos repetidos
		int idx = 0;								// indice de elementos do novo array
		for(int i = 0; i < aClone.length ; i++)		// para cada elemento do array aClone diferente de 0 é indexado o valor ao array aUnique
		{
			if(aClone[i] != 0)
			{	
				aUnique[idx] = aClone[i];
				idx++;
			}
		}
		return aUnique;
	}
}	
