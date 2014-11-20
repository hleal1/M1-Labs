package Lab21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveGreaterThanGetLastRemoved {
	
	/**
	 * This method removes of a iterated sequence by the iterator iter all the Integers that are higher
	 * than value using the criteria of comparador cmp.
	 * @param iter iterator
	 * @param cmp comparator
	 * @param value 
	 * @return
	 */
	public static Collection<Integer> removeGreaterThanAndGetLastNRemoved(
			Iterator<Integer> iter, Comparator<Integer> cmp, Integer value) 
			{
			LinkedList<Integer> list = new LinkedList<Integer>(); // lista que contem os valores removidos da sequência
			
			while (iter.hasNext()) // enquanto houver um valor
			{
				Integer nextValue = iter.next(); // Lê o próximo valor do iterador
					if( (cmp.compare(value, nextValue)) < 0) //se value for menor que o valor do iterador, o valor é removido da sequência e é adicionado a nova lista
						{
							iter.remove();
							list.add(nextValue);
						}
			}
			return list;
			}
	
	public static void main(String [] args)
	{
		List<Integer> col1 = new ArrayList<Integer>();
		col1.add(1);
		col1.add(2);
		col1.add(9);
		col1.add(8);
		col1.add(4);
		
		Iterator<Integer> iter = col1.iterator();
		
		Comparator <Integer>cmp = new IntegerComparator();
		Integer value = 3;
		
		
		System.out.println(removeGreaterThanAndGetLastNRemoved(iter, cmp, value));
	}

}
