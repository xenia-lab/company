package ru.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.profile.dto.PersonRequestDTO;
import ru.profile.dto.ProductsRequestDTO;
import ru.profile.exception.EntityNotFoundException;
import ru.profile.mapper.PersonMapper;
import ru.profile.model.Company;
import ru.profile.model.Person;
import ru.profile.model.Products;
import ru.profile.repository.CompanyRepository;
import ru.profile.repository.PersonRepository;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;
    private final CompanyRepository companyRepository;

    public Person getPerson(Long id) {
        return personRepository.getPersonById(id)
                .orElseThrow(() -> new EntityNotFoundException("Человек с id " + id + " не найден!"));
    }

    public Long addPerson(PersonRequestDTO dto) {
        Company company = companyRepository.findById(dto.getCompanyId())
                .orElseThrow(() -> new EntityNotFoundException("Компания с id " + dto.getCompanyId() + " не найдена"));

        Person person = personMapper.toPerson(dto);
        person.setCompany(company);

        Person saved = personRepository.save(person);
        return saved.getId();
    }

    public void deletePerson(Long id) {
        if(!personRepository.existsById(id)){
            throw new EntityNotFoundException("Человек с id " + id + " не найден!");
        }
        personRepository.deleteById(id);
    }

    public Long putPerson(Long id, PersonRequestDTO dto) {
        Person existingPerson = personRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Человек с id " + id + " не найден"));

        Company company = companyRepository.findById(dto.getCompanyId())
                .orElseThrow(() -> new EntityNotFoundException("Компания с id " + id + " не найдена"));

        existingPerson.setPersonLastname(dto.getPersonLastname());
        existingPerson.setPersonName(dto.getPersonName());
        existingPerson.setPersonPatronymic(dto.getPersonPatronymic());
        existingPerson.setPersonPhone(dto.getPersonPhone());
        existingPerson.setPersonWorkDirection(dto.getPersonWorkDirection());

        existingPerson.setCompany(company);

        Person update = personRepository.save(existingPerson);
        return update.getId();
    }
}
