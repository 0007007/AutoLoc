package tn.esprit.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.service.EquipementServiceImp;

import java.util.List;

@RequestMapping("equipement")
@RequiredArgsConstructor
@RestController

public class EquipementRestController {
    private final EquipementServiceImp equipementServiceImp;

    @PostMapping
    public Equipement addEquipement(@RequestBody Equipement equipement){
        return equipementServiceImp.ajouterEquipement(equipement);
    }

    @GetMapping("/{id}")
    public Equipement getEquipementById(@PathVariable long id){
        return equipementServiceImp.getEquipementById(id);
    }

    @GetMapping
    public List<Equipement> getAllEquipement(){
        return equipementServiceImp.getAllEquipement();
    }

    @PutMapping
    public Equipement updateEquipement(@RequestBody Equipement equipement){
        return equipementServiceImp.modifierEquipement(equipement);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipementById(@PathVariable long id){
        equipementServiceImp.supprimerEquipementById(id);
    }

}
