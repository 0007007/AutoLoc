package Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.service.EmployeServiceImp;

import java.util.List;

@RequestMapping("employe")
@RequiredArgsConstructor
@RestController

public class EmployeRestController {
    private final EmployeServiceImp employeServiceImp;

    @PostMapping
    public Employe addEmploye(@RequestBody Employe employe){
        return employeServiceImp.ajouterEmploye(employe);
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable long id){
        return employeServiceImp.getEmployeById(id);
    }

    @GetMapping
    public List<Employe> getAllEmploye(){
        return employeServiceImp.getAllEmploye();
    }

    @PutMapping
    public Employe updateEmploye(@RequestBody Employe employe){
        return employeServiceImp.modifierEmploye(employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeById(@PathVariable long id){
        employeServiceImp.supprimerEmployeById(id);
    }

}
