package tn.esprit.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.service.MaintenanceServiceImp;

import java.util.List;

@RequestMapping("maintenance")
@RequiredArgsConstructor
@RestController

public class MaintenanceRestController {
    private final MaintenanceServiceImp maintenanceServiceImp;

    @PostMapping
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceServiceImp.ajouterMaintenance(maintenance);
    }

    @GetMapping("/{id}")
    public Maintenance getMaintenanceById(@PathVariable long id){
        return maintenanceServiceImp.getMaintenanceById(id);
    }

    @GetMapping
    public List<Maintenance> getAllMaintenance(){
        return maintenanceServiceImp.getAllMaintenance();
    }

    @PutMapping
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceServiceImp.modifierMaintenance(maintenance);
    }

    @DeleteMapping("/{id}")
    public void deleteMaintenanceById(@PathVariable long id){
        maintenanceServiceImp.supprimerMaintenanceById(id);
    }

}
