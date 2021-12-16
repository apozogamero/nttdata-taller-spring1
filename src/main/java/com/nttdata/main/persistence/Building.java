package com.nttdata.main.persistence;

public class Building {
	
	private Person[][] building;
	private int floors = 4;
	private int rooms = 6;
	
	public Building() {
		this.building = new Person[floors][rooms]; 
	}

	/**
	 * @return the roomNumbers
	 */
	public Person[][] getBuilding() {
		return building;
	}

	/**
	 * @param roomNumbers the roomNumbers to set
	 */
	public void setBuilding(Person[][] building) {
		this.building = building;
	}

	/**
	 * @return the floors
	 */
	public int getFloors() {
		return floors;
	}

	/**
	 * @param floors the floors to set
	 */
	public void setFloors(int floors) {
		this.floors = floors;
	}

	/**
	 * @return the rooms
	 */
	public int getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
}
