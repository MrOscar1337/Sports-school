package ru.tagirov.Sports.School.Models;

import lombok.Data;

@Data
public class Coach {
    Long id;
    String firstName;
    String lastName;
    String email;
    Long sportId;
}
