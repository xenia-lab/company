package ru.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.profile.model.Person;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> getPersonById(Long id);
}
