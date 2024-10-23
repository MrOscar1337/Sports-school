package ru.tagirov.Sports.School.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Coaches")
public class Coach {
    @Column(name = "coach_id")
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "coach_name")
    String firstName;
    @Column(name = "coach_surname")
    String lastName;
    @Column(name = "coach_patronymic")
    String patronymic;
    @Column(name = "coach_email", unique = true)
    String email;
    @Column(name = "coach_sport_id")
    Long sportId;
}
