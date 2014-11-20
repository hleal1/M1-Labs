package Lab20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class that implements the interface {@link PersonsContainer} for keep in the memory 
 * {@link Person} objects using one {@link List}.
 * 
 * @author Challenge.IT
 *
 * Copyright (c) 2014, Challenge.IT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is distributed in the hope that it will be useful for learning purposes, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 * */
public class ListPersonsContainer implements PersonsContainer
{
	private List<Person> _persons = new ArrayList<Person>();

	/**
	 * Adds a Person to the container
	 */
	@Override
	public boolean add(Person person) 
	{
		if(_persons.contains(person)) // se a person já existir na lista retorna false
			return false;
		else
			_persons.add(person); //adiciona a person a lista
			return true;
	}

	/**
	 * returns all Persons from the container
	 */
	@Override
	public Collection<Person> getAll()
	{
		return _persons;
	}

	/**
	 * returns a Person with a specific nif
	 */
	@Override
	public Person getByNif(String nif)
	{	for( int i = 0; i < _persons.size() ; i++)	// percorre todos os elementos da lista, quando o objecto da lista tiver o mesmo nif, que o introduzido é retornado esse objecto
		{		
		Person findPersonByNif;
	
			if((findPersonByNif = _persons.get(i)).getNif() == nif)
				
				return findPersonByNif;
		}
		return null;
	}
}


