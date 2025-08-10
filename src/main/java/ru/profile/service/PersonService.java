package ru.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
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

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
