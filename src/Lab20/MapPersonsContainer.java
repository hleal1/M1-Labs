package Lab20;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/*
* Class that implements the interface {@link PersonsContainer} for keep in the memory 
* {@link Person} objects using one {@link Map}.
*/
public class MapPersonsContainer implements PersonsContainer {

	Map<String, Person> personsMap = new TreeMap<String, Person>(); 
	
	/**
	 * Adds a Person to the container
	 */
	@Override
	public boolean add(Person person) 
	{
		if (personsMap.containsKey(person.getNif()))
			return false;
		else
			personsMap.put(person.getNif(), person);
			return true;
	}
	
	/**
	 * returns all Persons from the container
	 */
	@Override
	public Collection<Person> getAll() 
	{
		return personsMap.values(); // retorna todos os valores do Map que neste caso são as persons sendo as keys os nifs
	}

	/**
	 * returns a Person with a specific nif
	 */
	@Override
	public Person getByNif(String nif)
	{
		return personsMap.get(nif);  // retorna a person através da key
	}
}
