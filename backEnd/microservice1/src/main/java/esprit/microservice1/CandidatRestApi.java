package esprit.microservice1;

import esprit.microservice1.entities.Candidat;
import esprit.microservice1.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidat")
public class CandidatRestApi {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
    @Autowired
    private CandidatService candidatService;
    @GetMapping("/list")
    public List<Candidat> getCandidats() {
        return this.candidatService.findAll();
    }
    @PostMapping("/add")
    public Candidat addCandidat(Candidat candidat) {
        return this.candidatService.addCandidat(candidat);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCandidat(@PathVariable Long id) {
        candidatService.deleteCandidat(id);
        return "Candidat supprimer";
    }

    @PutMapping("/update/{id}")
    public Candidat updateCandidat(@PathVariable Long id, @RequestBody Candidat updatedCandidat) {
        return candidatService.updateCandidat(id, updatedCandidat);
    }

}
