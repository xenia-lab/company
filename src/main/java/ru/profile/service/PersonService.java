package ru.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.profile.model.Company;
import ru.profile.model.Person;
import ru.profile.repository.PersonRepository;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person getPerson(Long id) {
        return personRepository.getPersonById(id);
    }

    public Long addPerson(Person person) {
        return personRepository.save(person).getId();
    }

    public boolean deletePerson(Long id) {
        personRepository.deleteById(id);
        return false;
    }

    public Long putPerson(Long id, Person person) {
        person.setId(id);
        return personRepository.save(person).getId();
    }
}
