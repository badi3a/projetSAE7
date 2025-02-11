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

    public Candidat addCandidat(Candidat candidat) {
        return candidatRepo.save(candidat);
    }

    public void deleteCandidat(Long id) {
        candidatRepo.deleteById(id);
    }

    public Candidat updateCandidat(Long id, Candidat updatedCandidat) {
        Candidat candidat = candidatRepo.findById(id).orElseThrow(() -> new RuntimeException("Candidat not found"));
        candidat.setFirstname(updatedCandidat.getFirstname());
        candidat.setFirstname(updatedCandidat.getFirstname());
        candidat.setEmail(updatedCandidat.getEmail());
        return candidatRepo.save(candidat);
    }
}
