package ru.tagirov.Sports.School.Models;

import jakarta.persistence.*;

@Entity
@Table (name = "sports")
public class Sport {
    @Column(name = "sport_id")
    @Id
    @GeneratedValue
    int id;
    @Column(name = "sport_name")
    String name;
}
