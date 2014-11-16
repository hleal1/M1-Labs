package Lab08;
/**
 * To sort the array in ascending order
 * O código actual está a organizar os números por ordem descrescente, ou seja quando o elemento do
 * array na posição j-1 é menor que o elemento na posição j, o método troca as suas posições. Assim para
 * termos o método organizado de forma crescente, basta alterar a seguinte linha de código:
 * if (num[j-1] > num[j])
 * Assim o método troca o elemento da posição j-1 pelo da posição j quando o da posição j-1 for maior,
 * ficando assim o array organizado por ordem crescente, como pretendido.
 * @author Hugo
 *
 */
public class SortAnArray {
	public static void main(String[] args) 
	{
		int array[] = { 84, 69, 76, 34, 86, 94, 91 };
		sortArray(array);
		printArray(array);
	}

	public static void printArray(int[] array)
	{
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.print("]");
	}

	public static void sortArray(int[] num)
	{
		int n = num.length;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 1; j < (n - i); j++) 
			{
				if (num[j - 1] > num[j]) // bastou trocar o sinal para maior nesta condição para o array ser organizado de forma crescente
				{
					swap(num, j);
				}
			}
		}
	}

	public static void swap(int[] num, int idx) 
	{
		int temp = 0;
		temp = num[idx - 1];
		num[idx - 1] = num[idx];
		num[idx] = temp;
	}
}
