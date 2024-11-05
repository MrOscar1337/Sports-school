package ru.tagirov.Sports.School.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.tagirov.Sports.School.Models.Coach;
import ru.tagirov.Sports.School.Models.Student;
import ru.tagirov.Sports.School.Services.CoachServiceImpl;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/coaches")
@AllArgsConstructor
public class CoachController {
    private final CoachServiceImpl coachService;

    @GetMapping
    public String findAllCoaches(Model model){
        List<Coach> coaches = coachService.findAllCoaches();
        model.addAttribute("coaches", coaches);
        return "coach-list";
    }

    @GetMapping("save_coach")
    public String addCoach(Model model){
        return "coach-save";
    }

    @PostMapping("save_coach")
    public String saveCoach(@RequestParam String firstName, @RequestParam String lastName,
                              @RequestParam String patronymic, @RequestParam String email, @RequestParam int sportId,
                              Model model){
        Coach coach = new Coach(firstName, lastName, patronymic, email, sportId);
        coachService.saveCoach(coach);
        return "redirect:/coaches";
    }

    @GetMapping("/{email}")
    public String coachInfo(@PathVariable String email, Model model){
        Coach coach = coachService.findByEmail(email);
        model.addAttribute("coach",coach);
        return "coach-info";
    }

    @GetMapping("/{email}/update_coach")
    public String updateCoachForm(@PathVariable String email, Model model){
        Coach coach = coachService.findByEmail(email);
        model.addAttribute("coach",coach);
        return "coach-update";
    }

    @PostMapping("/{email}/update_coach")
    public String updateCoach(@RequestParam String firstName, @RequestParam String lastName,
                                @RequestParam String patronymic, @RequestParam(value = "email") String email, @RequestParam int sportId,
                                Model model){
        Coach coach = coachService.findByEmail(email);
        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setPatronymic(patronymic);
        coach.setEmail(email);
        coach.setSportId(sportId);
        coachService.updateCoach(coach);
        return "redirect:/coaches";
    }

   @PostMapping("/{email}/delete")
    public String deleteCoach(@PathVariable String email, Model model){
        Coach coach = coachService.findByEmail(email);
        coachService.deleteByEmail(coach);
        return "redirect:/students";
    }
}
