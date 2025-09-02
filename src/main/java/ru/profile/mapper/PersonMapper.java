package ru.profile.mapper;

import org.mapstruct.Mapper;
import ru.profile.dto.PersonRequestDTO;
import ru.profile.dto.PersonResponseDTO;
import ru.profile.model.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person toPerson(PersonRequestDTO personRequestDTO);

    PersonResponseDTO toPersonResponseDTO(Person person);
}
