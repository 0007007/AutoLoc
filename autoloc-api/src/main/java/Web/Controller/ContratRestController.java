package Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.service.ContratServiceImp;

import java.util.List;

@RequestMapping("contrat")
@RequiredArgsConstructor
@RestController

public class ContratRestController {
    private final ContratServiceImp contratServiceImp;

    @PostMapping
    public Contrat addContrat(@RequestBody Contrat contrat){
        return contratServiceImp.ajouterContrat(contrat);
    }

    @GetMapping("/{id}")
    public Contrat getContratById(@PathVariable long id){
        return contratServiceImp.getContratById(id);
    }

    @GetMapping
    public List<Contrat> getAllContrat(){
        return contratServiceImp.getAllContrat();
    }

    @PutMapping
    public Contrat updateContrat(@RequestBody Contrat contrat){
        return contratServiceImp.modifierContrat(contrat);
    }

    @DeleteMapping("/{id}")
    public void deleteContratById(@PathVariable long id){
        contratServiceImp.supprimerContratById(id);
    }

}
