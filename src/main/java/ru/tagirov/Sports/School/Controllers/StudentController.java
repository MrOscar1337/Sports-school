package ru.tagirov.Sports.School.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.tagirov.Sports.School.Models.Student;
import ru.tagirov.Sports.School.Services.StudentServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController{
    private final StudentServiceImpl studentService;

    @GetMapping
    public String findAllStudents(Model model){
    List<Student> students = studentService.findAllStudents();
    model.addAttribute("students", students);
        return "student-list";
    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return studentService.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        studentService.deleteByEmail(email);
    }
}
