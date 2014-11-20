package Lab20;

import java.util.Collection;

/**
 * Interface that defines the contract to be implemented by all 
 * containers of {@link Person} objects.
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
public interface PersonsContainer
{
	/**
	 * Add operation.
	 * @param person The person for save in the container.
	 * @return True if the operation succeeds.
	 */
	public boolean add(Person person);
	
	/**
	 * @return All the persons.
	 */
	public Collection<Person> getAll();
	
	/**
	 * @param nif The person's nif number for search.
	 * @return The person with the nif equals to the nif passed in the arguments or null if not exists.
	 */
	public Person getByNif(String nif);
}
