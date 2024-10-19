package ru.tagirov.Sports.School.Models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Student {
    Long id;
    String firstName;
    String lastName;
    String email;
    LocalDate birth;
    Long groupId;
}
