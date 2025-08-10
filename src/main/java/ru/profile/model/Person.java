package ru.profile.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person", schema = "public")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Long id;

    @Column(name = "person_name")
    private String person_name;

    @Column(name = "person_lastname")
    private String person_lastname;

    @Column(name = "person_patronymic")
    private String person_patronymic;

    @Column(name = "person_work_direction")
    private String person_work_direction;

    @Column(name = "person_phone")
    private String person_phone;

}
