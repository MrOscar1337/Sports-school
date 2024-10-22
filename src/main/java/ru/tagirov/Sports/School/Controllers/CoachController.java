package ru.tagirov.Sports.School.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tagirov.Sports.School.Models.Coach;
import ru.tagirov.Sports.School.Services.CoachServiceImpl;

import java.util.List;

@RestController("/api/coaches")
@AllArgsConstructor
public class CoachController {
    private final CoachServiceImpl coachService;

    @GetMapping
    public List<Coach> findAllCoaches(){
        return coachService.findAllCoaches();
    }

    @GetMapping("save_coach")
    public Coach saveCoach(@RequestBody Coach coach){
        return coachService.saveCoach(coach);
    }

    @GetMapping("/{email}")
    public Coach findByEmail(@PathVariable String email){
        return coachService.findByEmail(email);
    }

    @PutMapping("update_coach")
    public Coach updateCoach(Coach coach){
        return coachService.updateCoach(coach);
    }

    @DeleteMapping("delete_coach/{email}")
    public void deleteCoach(@PathVariable String email){
        coachService.deleteByEmail(email);
    }
}
