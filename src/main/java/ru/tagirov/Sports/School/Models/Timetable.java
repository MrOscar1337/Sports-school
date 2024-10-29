package ru.tagirov.Sports.School.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "timetable")
public class Timetable {
    @Column(name = "timetable_id")
    @Id
    @GeneratedValue
    int id;
    @Column(name = "group_id")
    int groupId;
    @Column(name = "coach_id")
    int coachId;
    @Column(name = "gym_id")
    int gymId;
    @Column(name = "start_datetime")
    LocalDate startDateTime;
    @Column(name = "end_datetime")
    LocalDate endDateTime;
}
