package Lab21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MultipleOfFiveList {

	/**
	 * This method removes of the sequence iterated by it all the elements that aren't null
	 * and all elements multiple of five. The elements removed will be added to the collection list
	 * In this collection the odd numbers precede the even numbers
	 * @param it
	 * @return
	 */
	public static Collection<Integer> multipleOfFiveOddBeforeEven(
			Iterator<Integer> it) {
		LinkedList<Integer> list = new LinkedList<Integer>(); // lista que ir� receber os n�meros m�ltiplos de 5

		while (it.hasNext()) 
		{
			Integer nextValue = it.next(); // nextValue vai armazenar o pr�ximo valor da sequ�ncia
			if (nextValue != null && nextValue % 5 == 0) //se nextValue for diferente de 0 e multiplo de 5, � removido da sequ�ncia
			{												// se for par � adicionado na �ltima posi��o da lista, se for impar � adicionado na primeira posi�ao da lista
				it.remove();
				if (nextValue % 2 == 0)
					list.addLast(nextValue);
				else
					list.addFirst(nextValue);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> col1 = new ArrayList<Integer>();
		col1.add(3);
		col1.add(5);
		col1.add(10);
		col1.add(4);
		col1.add(80);
		col1.add(2);
		col1.add(17);
		col1.add(100);
		col1.add(50);
		col1.add(25);
		col1.add(98);
		col1.add(35);

		Iterator<Integer> iter = col1.iterator();

		System.out.println(multipleOfFiveOddBeforeEven(iter));
	}

}
