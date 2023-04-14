package controller;

import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ClientService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ClientContoller {



    @Autowired
    private ClientService clientService;

    @GetMapping("")
    public List<Client> getAllClients() {
        return clientService.clients();
    }



    @PostMapping("")
    public Client createClient( @RequestBody Client client) {
        return clientService.createClient(client);
    }



    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long clientId) {
        Client client = clientService.getClient(clientId);

        if (client == null) {
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.FALSE);
            return response;
        }

        clientService.deleteClient(client.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
