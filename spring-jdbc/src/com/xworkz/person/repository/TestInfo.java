package com.xworkz.person.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.person.entity.PersonEntity;

public class TestInfo {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
		PersonRepository repo=container.getBean(PersonRepository.class);
		System.out.println("PersonInfo list : ");
		for (PersonEntity person1 :repo.getAllPerson()) {
			System.out.println(person1);
		}
		System.out.println("\nGet person with ID 2");
		PersonEntity personById = repo.getPersonById(2L);
		System.out.println(personById);
		
		System.out.println("\nCreating person: ");
		PersonEntity person = new PersonEntity(3L, 30, "Dharini", "K.S");
		System.out.println(person);
		repo.createPerson(person);
		System.out.println("\nList of person is:");

		for (PersonEntity p : repo.getAllPerson()) {
			System.out.println(p);
		}
		System.out.println("\nDeleting person with ID 2");
		repo.deletePerson(personById);

		System.out.println("\nUpdate person with ID 4");

		PersonEntity pperson = repo.getPersonById(4L);
		pperson.setLastName("CHANGED");
		repo.updatePerson(pperson);

		System.out.println("\nList of person is:");
		for (PersonEntity p : repo.getAllPerson()) {
			System.out.println(p);
		}		
	}

}
