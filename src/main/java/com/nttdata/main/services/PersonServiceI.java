package com.nttdata.main.services;

import java.util.List;
import com.nttdata.main.persistence.Person;

public interface PersonServiceI {
	public void insertPerson(Person person);
	
	public List<Person> searchAll();
	
	public List<Person> searchByFullName(String name, String lastName);
}
