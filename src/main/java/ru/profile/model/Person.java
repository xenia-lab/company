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
    private String personName;

    @Column(name = "person_lastname")
    private String personLastname;

    @Column(name = "person_patronymic")
    private String personPatronymic;

    @Column(name = "person_work_direction")
    private String personWorkDirection;

    @Column(name = "person_phone")
    private String personPhone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_company", referencedColumnName = "id_company")
    private Company company;

}
