package ru.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.profile.exception.EntityNotFoundException;
import ru.profile.model.Company;
import ru.profile.model.Person;
import ru.profile.repository.PersonRepository;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person getPerson(Long id) {
        return personRepository.getPersonById(id)
                .orElseThrow(() -> new EntityNotFoundException("Человек с id " + id + " не найден!"));
    }

    public Long addPerson(Person person) {
        return personRepository.save(person).getId();
    }

    public void deletePerson(Long id) {
        if(!personRepository.existsById(id)){
            throw new EntityNotFoundException("Человек с id " + id + " не найден!");
        }
        personRepository.deleteById(id);
    }

    public Long putPerson(Long id, Person person) {
        if(!personRepository.existsById(id)){
            throw new EntityNotFoundException("Человек с id " + id + " не найден!");
        }
        person.setId(id);
        return personRepository.save(person).getId();
    }
}
