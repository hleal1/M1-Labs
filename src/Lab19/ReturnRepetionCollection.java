package Lab19;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Para a colecção repetitions receber os elementos comuns das duas colecções foi utilizado em
 * primeiro lugar o método addAll(col1) que adicionou todos os elementos de col1 a repetitions e
 * depois foi utilizado o método retainAll(col2) que reteve em repetitions apenas os elementos
 * em comum com col2.
 * @author Hugo
 *
 */

public class ReturnRepetionCollection {

	public static Collection<Integer> returnRepetitions(Collection<Integer> col1, Collection<Integer> col2){
		Collection <Integer> repetitions = new LinkedList<>();

		repetitions.addAll(col1); // adiciona todos os elementos de col1 a colecção repetitions
		repetitions.retainAll(col2); // retem os elementos em comum com a col2
		
		return repetitions;
		}
	
	public static void main(String [] args)
	{
		List<Integer> col1 = new LinkedList<Integer>();
		col1.add(1);
		col1.add(2);
		col1.add(9);
		col1.add(8);
		col1.add(4);
		
		List<Integer> col2 = new LinkedList<Integer>();
		col2.add(3);
		col2.add(7);
		col2.add(23);
		col2.add(8);
		col2.add(9);
		
		System.out.println(returnRepetitions(col1, col2));
	}
}

