package ru.tagirov.Sports.School.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "gym")
public class Gym {
    @Column(name = "gym_id")
    @Id
    @GeneratedValue
    int id;
    @Column(name = "gym_number")
    String number;
}
