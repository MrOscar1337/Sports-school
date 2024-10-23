package ru.tagirov.Sports.School.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Students")
public class Student {
    @Column(name = "student_id")
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "student_name")
    String firstName;
    @Column(name = "student_surname")
    String lastName;
    @Column(name = "student_patronymic")
    String patronymic;
    @Column(name = "student_email", unique = true)
    String email;
    @Column(name = "student_birth")
    @Transient
    LocalDate birth;
}
