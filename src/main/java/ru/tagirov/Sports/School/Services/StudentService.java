package ru.tagirov.Sports.School.Services;

import ru.tagirov.Sports.School.Models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
