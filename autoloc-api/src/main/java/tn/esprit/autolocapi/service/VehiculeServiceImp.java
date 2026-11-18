package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.AgenceRepository;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServiceImp implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;
    private final AgenceRepository agenceRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {

        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {

        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {

        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> getAllVehicule() {

        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule supprimerVehiculeById(Long id) {
        Vehicule vehicule = getVehiculeById(id);
        if (vehicule != null) {
            vehiculeRepository.deleteById(id);
        }
        return vehicule;
    }

    @Override
    public Vehicule assignVehiculeToAgence(Long idVehicule, Long idAgence){
        Vehicule vehicule = getVehiculeById(idVehicule);
        Agence agence = agenceRepository.findById(idAgence).orElse(null);
        if(vehicule != null &&  agence != null){
            vehicule.setAgence(agence);
        }
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule assignedAgence(Vehicule vehicule, Long idVehicule) {
        Agence agence = agenceRepository.findById(idVehicule).orElse(null);
        vehicule.setAgence(agence);
        return vehiculeRepository.save(vehicule);
    }

}
