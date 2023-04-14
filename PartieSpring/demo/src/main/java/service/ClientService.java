package service;

import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientRepository;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> clients() {
        return clientRepository.findAll();
    }

    public Client getClient(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(Long id, Client client) {
        Client existingClient = getClient(id);
        existingClient.setNom(client.getNom());
        existingClient.setPrenom(client.getPrenom());
        existingClient.setAdresse(client.getAdresse());
        existingClient.setTelephone(client.getTelephone());
        return clientRepository.save(existingClient);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
