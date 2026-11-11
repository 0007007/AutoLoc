package Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;
import tn.esprit.autolocapi.service.VehiculeServiceImp;

import java.util.List;

@RequestMapping("vehicule")
@RequiredArgsConstructor
@RestController

public class VehiculeRestController {
    private final VehiculeServiceImp vehiculeServiceImp;

    @PostMapping
    public Vehicule addVehicule(@RequestBody Vehicule vehicule){
        return vehiculeServiceImp.ajouterVehicule(vehicule);
    }

    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable long id){
    return vehiculeServiceImp.getVehiculeById(id);
    }

    @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule){
        return  vehiculeServiceImp.modifierVehicule(vehicule);
    }

    @DeleteMapping("/{id")
    public void deleteVehiculeById(@PathVariable long id){
        vehiculeServiceImp.supprimerVehiculeById(id);
    }

}
