package ru.profile.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.profile.model.Person;
import ru.profile.service.PersonService;

@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/get/{id}")
    public Person getPerson(@PathVariable("id") Long id) {
        return personService.getPerson(id);
    }

    @PostMapping("")
    public Long addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable("id") Long id){
        personService.deletePerson(id);
    }
}
