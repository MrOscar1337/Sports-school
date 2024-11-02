package ru.tagirov.Sports.School.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tagirov.Sports.School.Models.Student;
import ru.tagirov.Sports.School.Repositories.StudentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public void deleteByEmail(Student student) {
        studentRepository.delete(student);
    }
}
