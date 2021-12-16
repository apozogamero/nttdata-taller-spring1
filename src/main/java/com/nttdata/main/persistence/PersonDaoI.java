package com.nttdata.main.persistence;

import java.util.List;

public interface PersonDaoI {
	
	public void insertPerson(Person person);
	
	public List<Person> searchAll();
	
	public List<Person> searchByFullName(String name, String lastName);
}
