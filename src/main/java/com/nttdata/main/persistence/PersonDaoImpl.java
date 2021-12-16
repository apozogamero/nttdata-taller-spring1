package com.nttdata.main.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDaoI {

	private Building building;

    public PersonDaoImpl() {
        this.building = new Building();
    }
	
	@Override
	public void insertPerson(Person person) {
		for (int i = 0; i < building.getFloors(); i++) {
            for (int j = 0; j < building.getRooms(); j++) {
                if (building.getBuilding()[i][j] == null) {
                    building.getBuilding()[i][j] = person;
                    return;
                }
            }
        }
	}

	@Override
	public List<Person> searchAll() {
		
		List<Person> list = new ArrayList<>();
		
		for (int i = 0; i < building.getFloors(); i++) {
            for (int j = 0; j < building.getRooms(); j++) {
            	
            	Person x = building.getBuilding()[i][j];
            	
                if (x != null) {
                	list.add(x);
                }
            }
        }
		return list;
	}

	@Override
	public List<Person> searchByFullName(String name, String lastName) {
		
		List<Person> list = new ArrayList<>();
		
		for (int i = 0; i < building.getFloors(); i++) {
            for (int j = 0; j < building.getRooms(); j++) {
            	
            	Person x = building.getBuilding()[i][j];
            	
                if (x != null && x.getName() == name && x.getLastName() == lastName) {
                	list.add(x);
                }
            }
        }
		return list;
	}

}
