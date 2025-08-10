package ru.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.profile.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person getPersonById(Long id);
}
