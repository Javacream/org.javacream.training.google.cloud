package org.javacream.people.rest.restserver.people;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PeopleRestController{
	@RequestMapping(method=RequestMethod.GET, path="/people/{id}", produces="application/json")
	public Person findPersonById(@PathVariable("id") Long personId) {
		return new Person();
	}
	@RequestMapping(method=RequestMethod.GET, path="/people", produces="application/json")
	public Person[] findAllPeople() {
		Person[] result = new Person[1];
		result[0] = new Person();
		return result;
	}

	@RequestMapping(method=RequestMethod.POST, path="/people", consumes="application/json")
	public void savePerson(Person p) {
		System.out.println("saving");
	}

	@RequestMapping(method=RequestMethod.PUT, path="/people", consumes="application/json")
	public void updatePerson(Person p) {
		System.out.println("saving");;
	}

	@RequestMapping(method=RequestMethod.DELETE, path="/people/{id}")
	public void deletePersonById(@PathVariable("id") Long personId) {
		System.out.println("deleting");;
	}

}