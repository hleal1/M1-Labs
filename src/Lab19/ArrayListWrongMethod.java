package Lab19;

import java.util.ArrayList;
import java.util.List;
/**
 * Para se obter o resultado pretendido bastou adicionar à lista o valor 2, e no ciclo adicionar
 * uma variável que armazenasse o número de iterações realizadas.
 */

public class ArrayListWrongMethod {
	
	public static void wrongMethod(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(new Integer(4));
		list.add(3);
		list.add(2); // valor adicionado 
		
		int sum = 0, count = 0, size = list.size();
		for(Integer i : list){
		sum+= i;
		count++;
		}
		list.add(2);
		System.out.println("Sum: " + sum);
		System.out.println("Count: " + count);
		System.out.println("Size: " + size);
		}

	public static void main(String [] args){
		wrongMethod();
	}
}
