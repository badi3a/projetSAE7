package esprit.microservice1;

import esprit.microservice1.entities.Candidat;
import esprit.microservice1.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidat")
public class CandidatRestApi {
   @Autowired
   private CandidatService candidatService;
    @GetMapping("/list")
    public List<Candidat> getCandidates(){
       return this.candidatService.findAll();
    }
}
