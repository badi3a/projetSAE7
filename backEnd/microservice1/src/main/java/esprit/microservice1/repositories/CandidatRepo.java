package esprit.microservice1.repositories;

import esprit.microservice1.entities.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepo extends JpaRepository<Candidat, Integer> {
}
