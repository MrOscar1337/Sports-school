package ru.tagirov.Sports.School.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tagirov.Sports.School.Models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);
}
