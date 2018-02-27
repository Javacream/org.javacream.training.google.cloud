package com.viessmann.gcptraining.appengine;

import com.viessmann.gcptraining.appengine.data.Person;
import com.viessmann.gcptraining.appengine.data.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final PersonRepository resonRepo;

    public PersonController(PersonRepository resonRepo) {
        this.resonRepo = resonRepo;
    }

    @GetMapping("/person")
    public Iterable<Person> getAllPersons() {
        return resonRepo.findAll();
    }

    @GetMapping("/person/{id}")
    public Person getPerson(long id) {
        return resonRepo.findOne(id);
    }

    @PostMapping(value = "/person", consumes = "application/json")
    @PutMapping(value = "/person", consumes = "application/json")
    public void createPerson(@RequestBody Person person) {
        log.info("Creating new person: {}", person);
        resonRepo.save(person);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") long id) {
        resonRepo.delete(id);
    }

}
