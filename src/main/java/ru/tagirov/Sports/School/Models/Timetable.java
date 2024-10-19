package ru.tagirov.Sports.School.Models;

import java.time.LocalDate;

public class Timetable {
    Long id;
    Long groupId;
    Long coachId;
    Long gymId;
    LocalDate startDateTime;
    LocalDate endDateTime;
}
