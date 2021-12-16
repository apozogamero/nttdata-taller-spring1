package com.nttdata.main.persistence;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	
	private String lastName;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + "]";
	}
	
}
