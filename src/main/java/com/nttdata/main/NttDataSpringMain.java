package com.nttdata.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.main.persistence.Person;
import com.nttdata.main.services.PersonServiceI;

@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {

	@Autowired
	private PersonServiceI personServiceI;
	
	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p1 = new Person();
		p1.setName("Roy");
		p1.setLastName("García");
		
		Person p2 = new Person();
		p2.setName("Enrique");
		p2.setLastName("Arlucea");
		
		personServiceI.insertPerson(p1);
		personServiceI.insertPerson(p2);
		
		System.out.println(personServiceI.searchAll());	
		personServiceI.searchByFullName("Roy","García").forEach(System.out::println);	
		personServiceI.searchByFullName("Marco","Palmero").forEach(System.out::println);
	}

}