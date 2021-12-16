package com.nttdata.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.main.persistence.*;

@Service
public class PersonServiceImpl implements PersonServiceI {
	
	@Autowired
	private PersonDaoImpl personDaoImpl;

	@Override
	public void insertPerson(Person person) {
		personDaoImpl.insertPerson(person);
	}

	@Override
	public List<Person> searchAll() {
		return personDaoImpl.searchAll();
	}

	@Override
	public List<Person> searchByFullName(String name, String lastName) {
		return personDaoImpl.searchByFullName(name, lastName);
	}
	
	
}
