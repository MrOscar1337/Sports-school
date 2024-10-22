package ru.tagirov.Sports.School.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tagirov.Sports.School.Models.Coach;

public interface CoachRepository extends JpaRepository<Coach, Long> {
    void deleteByEmail(String email);
    Coach findByEmail(String email);
}
