package ru.tagirov.Sports.School.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tagirov.Sports.School.Models.Coach;

public interface CoachRepository extends JpaRepository<Coach, Integer> {
    Coach findByEmail(String email);
}
