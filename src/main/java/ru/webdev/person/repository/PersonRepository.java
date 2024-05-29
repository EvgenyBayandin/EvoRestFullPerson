package ru.webdev.person.repository;

import org.springframework.data.repository.CrudRepository;
import ru.webdev.person.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
