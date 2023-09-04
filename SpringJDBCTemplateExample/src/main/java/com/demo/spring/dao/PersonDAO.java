package com.demo.spring.dao;

import java.util.List;

import com.demo.model.Person;

public interface PersonDAO {
	//select * from person where id = ?
	Person getPersonById(Long id);

	List<Person> getAllPersons();

	boolean deletePerson(Person person);

	boolean updatePerson(Person person);

	boolean createPerson(Person person);
}
