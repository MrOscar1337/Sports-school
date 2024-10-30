package ru.tagirov.Sports.School.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.tagirov.Sports.School.Models.Student;
import ru.tagirov.Sports.School.Services.StudentServiceImpl;

import java.time.LocalDate;
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

    @GetMapping("save_student")
    public String addStudent(Model model){
        return "student-save";
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestParam String firstName, @RequestParam String lastName,
    @RequestParam String patronymic, @RequestParam String email, @RequestParam LocalDate birth,
    Model model){
        Student student = new Student(firstName, lastName, patronymic, email, birth);
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/{email}")
    public String studentInfo(@PathVariable String email, Model model){
       Student student = studentService.findByEmail(email);
       model.addAttribute("student",student);
        return "student-info";
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
