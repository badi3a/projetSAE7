package esprit.microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatRestApi {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
