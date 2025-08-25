package ru.profile.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.profile.dto.PersonRequestDTO;
import ru.profile.dto.PersonResponseDTO;
import ru.profile.mapper.PersonMapper;
import ru.profile.model.Person;
import ru.profile.service.PersonService;

@Validated
@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;
    private final PersonMapper personMapper;

    @GetMapping("/get/{id}")
    public ResponseEntity<PersonResponseDTO> getPerson(@PathVariable("id") Long id) {
        return new ResponseEntity<>(personMapper.toPersonResponseDTO(personService.getPerson(id)),HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Long> addPerson(@Valid @RequestBody PersonRequestDTO personRequestDTO){
        return new ResponseEntity<>(
                personService.addPerson(personMapper.toPerson(personRequestDTO)), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable("id") Long id){
        personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Long> updatePerson(@PathVariable("id")Long id,
                                             @RequestBody PersonRequestDTO personRequestDTO) {
        return new ResponseEntity<>(
                personService.putPerson(id, personMapper.toPerson(personRequestDTO)), HttpStatus.OK);
    }
}
