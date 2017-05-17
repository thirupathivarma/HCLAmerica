package com.HCLAmerica.StateStreet;

import java.util.HashMap;
import java.util.Map;

public class PersonTable {

	Map<Integer, Person> persons = new HashMap<Integer, Person>();
	private class Person {
		Person(int id, String name, String phone , String address) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}

		public String toString() {
			return "id:" + id + " name:" + name + " address:" + address + " phone:" + phone;
		}
	
		private int id;
		private String name;
		private String address;
		private String phone;
	}
	public Person getPersons(int id) {
		return persons.get(id);
	}
	
	public void addPersons(Person person) {
		this.persons.put(person.id, person);
	}
	public static void main(String[] args) {
		PersonTable pTable = new PersonTable();
		
		PersonTable.Person person1 = pTable. new Person(1, "person1", "phone1", "address1");
		pTable.addPersons(person1);
		
		PersonTable.Person person2 = pTable. new Person(2, "person2", "phone2", "address2");
		pTable.addPersons(person2);

		System.out.println(pTable.getPersons(2));
		System.out.println(pTable.getPersons(1));

	}

}
