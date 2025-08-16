package ru.profile.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.profile.dto.PersonRequestDTO;
import ru.profile.dto.PersonResponseDTO;
import ru.profile.model.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(source = "person_name", target = "person_name")
    @Mapping(source = "person_lastname", target = "person_lastname")
    @Mapping(source = "person_patronymic", target = "person_patronymic")
    @Mapping(source = "person_work_direction", target = "person_work_direction")
    @Mapping(source = "person_phone", target = "person_phone")
    Person toPerson(PersonRequestDTO personRequestDTO);

    @Mapping(source = "person_name", target = "person_name")
    @Mapping(source = "person_lastname", target = "person_lastname")
    @Mapping(source = "person_patronymic", target = "person_patronymic")
    @Mapping(source = "person_work_direction", target = "person_work_direction")
    @Mapping(source = "person_phone", target = "person_phone")
    PersonResponseDTO toPersonResponseDTO(Person person);
}
