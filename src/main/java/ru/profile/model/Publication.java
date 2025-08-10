package ru.profile.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "publication", schema = "public")
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publication")
    private Long id;

    @Column(name = "publication_text")
    private String publication_text;

    @Column(name = "publication_date")
    private Date publication_date;
}
