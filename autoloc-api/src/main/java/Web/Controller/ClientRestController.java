package Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.service.ClientServiceImp;

import java.util.List;

@RequestMapping("client")
@RequiredArgsConstructor
@RestController

public class ClientRestController {
    private final ClientServiceImp clientServiceImp;

    @PostMapping
    public Client addClient(@RequestBody Client client){
        return clientServiceImp.ajouterClient(client);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable long id){
        return clientServiceImp.getClientById(id);
    }

    @GetMapping
    public List<Client> getAllClient(){
        return clientServiceImp.getAllClient();
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client){
        return clientServiceImp.modifierClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClientById(@PathVariable long id){
        clientServiceImp.supprimerClientById(id);
    }

}
