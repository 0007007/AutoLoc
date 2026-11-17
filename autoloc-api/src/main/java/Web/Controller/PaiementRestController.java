package Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.service.PaiementServiceImp;

import java.util.List;

@RequestMapping("paiement")
@RequiredArgsConstructor
@RestController

public class PaiementRestController {
    private final PaiementServiceImp paiementServiceImp;

    @PostMapping
    public Paiement addPaiement(@RequestBody Paiement paiement){
        return paiementServiceImp.ajouterPaiement(paiement);
    }

    @GetMapping("/{id}")
    public Paiement getPaiementById(@PathVariable long id){
        return paiementServiceImp.getPaiementById(id);
    }

    @GetMapping
    public List<Paiement> getAllPaiement(){
        return paiementServiceImp.getAllPaiement();
    }

    @PutMapping
    public Paiement updatePaiement(@RequestBody Paiement paiement){
        return paiementServiceImp.modifierPaiement(paiement);
    }

    @DeleteMapping("/{id}")
    public void deletePaiementById(@PathVariable long id){
        paiementServiceImp.supprimerPaiementById(id);
    }

}
