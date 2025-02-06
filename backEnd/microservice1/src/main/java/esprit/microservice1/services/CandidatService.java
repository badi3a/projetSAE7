package esprit.microservice1.services;

import esprit.microservice1.entities.Candidat;
import esprit.microservice1.repositories.CandidatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepo candidatRepo;
    public List<Candidat> findAll() {
        return candidatRepo.findAll();
    }
}
