package ru.tagirov.Sports.School.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
@Table(name = "students")
public class Student {
    @Column(name = "student_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "student_name")
    String firstName;
    @Column(name = "student_surname")
    String lastName;
    @Column(name = "student_patronymic")
    String patronymic;
    @Column(name = "student_email", unique = true)
    String email;
    @Column(name = "student_birth")
    LocalDate birth;

    public Student(String firstName, String lastName, String patronymic, String email, LocalDate birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.email = email;
        this.birth = birth;
    }

    public Student() {
    }
}
