package ru.tagirov.Sports.School.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "coaches")
public class Coach {
    @Column(name = "coach_id")
    @Id
    @GeneratedValue
    int id;

    @Column(name = "coach_name")
    String firstName;

    @Column(name = "coach_surname")
    String lastName;

    @Column(name = "сoach_patronymic")
    String patronymic;

    @Column(name = "coach_email", unique = true)
    String email;

    @Column(name = "coach_sport_id")
    int sportId;

}
