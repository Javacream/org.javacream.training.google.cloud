package restserver.people;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class PeopleRestController{


	@RequestMapping(method=RequestMethod.GET, path="/people/{id}", produces="application/json")
	public Person findPersonById(@PathVariable("id") Long personId) {
		return createDefaultPerson();
	}
	@RequestMapping(method=RequestMethod.GET, path="/people", produces="application/json")
	public Person[] findAllPeople() {
		Person[] result = new Person[1];
		result[0] = createDefaultPerson();
		return result;
	}

	private Person createDefaultPerson(){
        Person p = new Person();
        p.setId(815l);
        p.setLastname("Sawitzki");
        p.setFirstname("Rainer");
        p.setGender('m');
        p.setHeight(183);
    return p;
    }

	@RequestMapping(method=RequestMethod.POST, path="/people", consumes="application/json")
	public void savePerson(Person p) {
		System.out.println("saving " + p);
	}

	@RequestMapping(method=RequestMethod.PUT, path="/people", consumes="application/json")
	public void updatePerson(Person p) {
		System.out.println("updating" + p);
	}

	@RequestMapping(method=RequestMethod.DELETE, path="/people/{id}")
	public void deletePersonById(@PathVariable("id") Long personId) {
		System.out.println("deleting " + personId);
	}

}