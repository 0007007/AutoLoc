package tn.esprit.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.AgenceServiceImp;

import java.util.List;

@RequestMapping("agence")
@RequiredArgsConstructor
@RestController

public class AgenceRestController {
    private final AgenceServiceImp agenceServiceImp;

    @PostMapping
    public Agence addAgence(@RequestBody Agence agence){
        return agenceServiceImp.ajouterAgence(agence);
    }

    @GetMapping("/{id}")
    public Agence getAgenceById(@PathVariable long id){
        return agenceServiceImp.getAgenceById(id);
    }

    @GetMapping
    public List<Agence> getAllAgence(){
        return agenceServiceImp.getAllAgence();
    }

    @PutMapping
    public Agence updateAgence(@RequestBody Agence agence){
        return agenceServiceImp.modifierAgence(agence);
    }

    @DeleteMapping("/{id}")
    public void deleteAgenceById(@PathVariable long id){
        agenceServiceImp.supprimerAgenceById(id);
    }

}
