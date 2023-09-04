package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.model.Person;
import com.demo.spring.config.AppConfig;
import com.demo.spring.dao.PersonDAO;

public class Main {
	public static void main(String[] args) {
		//activate the container using this class below which configures the class AppConfig.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonDAO personDAO = context.getBean(PersonDAO.class);

//		System.out.println("List of person is:");
//		//we  get record from the database based on the query we selected.
//		for (Person p : personDAO.getAllPersons()) {
//			System.out.println(p);
//		}
//
//		System.out.println("\nGet person with ID 1");

//		Person personById = personDAO.getPersonById(1l);
//		System.out.println(personById);
//



		System.out.println("\nCreating person: ");
		Person person = new Person(4L, 36, "Sergey", "Emets");
		System.out.println(person);
		personDAO.createPerson(person);

		System.out.println("\nList of person is:");

		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}


		//DELETE
//		System.out.println("\nDeleting person with ID 2");
//		personDAO.deletePerson(personById);


//		System.out.println("\nUpdate person with ID 4");
//
//		//first we check if this person id is there in database or not. it returns a person object.
//		Person pperson = personDAO.getPersonById(4L);
//		//whateber the last name is, it will cal
//		pperson.setLastName("CHANGED");
//		//call the updatePerson() and this calls the updateQuery
//		personDAO.updatePerson(pperson);
//
//		System.out.println("\nList of person is:");
//		for (Person p : personDAO.getAllPersons()) {
//			System.out.println(p);
//		}

		
		context.close();
	}
}

/*
 * Gone through this problem yesterday and Here is the solution.

Open Eclipse
Open window in menu bar -> preferences -> java ->installed jre
add new jre which is installed in system(c:program_files->java->jre->bin) add it.
Select the new added jre and run it
 */
