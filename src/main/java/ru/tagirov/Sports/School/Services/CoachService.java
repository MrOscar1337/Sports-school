package ru.tagirov.Sports.School.Services;

import ru.tagirov.Sports.School.Models.Coach;

import java.util.List;

public interface CoachService {
    List<Coach> findAllCoaches();
    Coach saveCoach(Coach coach);
    Coach updateCoach(Coach coach);
    Coach findByEmail(String email);
    void deleteByEmail(String email);
}
