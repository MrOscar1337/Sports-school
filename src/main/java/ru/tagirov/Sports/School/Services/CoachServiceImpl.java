package ru.tagirov.Sports.School.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tagirov.Sports.School.Models.Coach;
import ru.tagirov.Sports.School.Repositories.CoachRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CoachServiceImpl implements CoachService{
    private final CoachRepository coachRepository;
    @Override
    public List<Coach> findAllCoaches() {
        return coachRepository.findAll();
    }

    @Override
    public Coach saveCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    @Override
    public Coach updateCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    @Override
    public Coach findByEmail(String email) {
        return coachRepository.findByEmail(email);
    }

    @Override
    public void deleteByEmail(String email) {
        coachRepository.deleteByEmail(email);
    }
}
