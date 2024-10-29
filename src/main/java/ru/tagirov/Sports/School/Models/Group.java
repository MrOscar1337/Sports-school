package ru.tagirov.Sports.School.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "groups")
public class Group {
    @Column(name = "group_id")
    @Id
    @GeneratedValue
    int id;
    @Column(name = "group_name")
    String name;
    @Column(name = "sport_id")
    int sportId;
}
