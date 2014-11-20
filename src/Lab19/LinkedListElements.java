package Lab19;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListElements {
	
	/**
	 * 
	 * @return
	 */
	public static LinkedList<Integer> addToLinkedList()
	{
		Scanner kbd = new Scanner(System.in);
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		int number = kbd.nextInt();
		
		while (number != 0)
		{
		numbers.add(number);
		number = kbd.nextInt();
		}
		return numbers;
		}
	
		public static void printList(List<Integer> numbers) 
		{
			for (Integer integer : numbers)
			{
				System.out.print(integer + " ");
			}
		}
		
		
		public static void usingListMethods() {
		LinkedList<Integer> numbers = addToLinkedList();
		printList(numbers);
		System.out.println("");
		System.out.println("FIRST ELEMENT: " + numbers.getFirst()); // .getFirst retorna o primeiro elemento da Lista
		System.out.println("LAST ELEMENT: " + numbers.getLast());	// .getLast retorna o último elemento da lista
		System.out.println("CONTAINS 6: " + numbers.contains(6));	// .contains verifica se o valor 6 se encontra na Lista
		System.out.println("REMOVE 4: " + numbers.remove(4));		// .remove remove o valor armazenado no indice 4
		numbers.add(0, 234);	//.add adiciona na posição 0 o valor 234
		printList(numbers);
		}
		
		
		public static void main(String [] args)
		{
			usingListMethods();
		}
}
