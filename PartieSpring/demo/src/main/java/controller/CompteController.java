package controller;

import lombok.Getter;
import model.CompteBancaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.CompteService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "compte")
public class CompteController {

    @Autowired
    CompteService compteService;

    @PostMapping("/virement")
    public ResponseEntity<String> effectuerVirement(@RequestParam Long idCompteDebit, @RequestParam Long idCompteCredit, @RequestParam double montant) {
        try {
            compteService.effectuerVirement(idCompteDebit, idCompteCredit, montant);
            return ResponseEntity.ok("Le virement a été effectué avec succès");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping
    public List<CompteBancaire> getComptes() {
        return compteService.comptes();
    }



    @PostMapping
    public ResponseEntity<CompteBancaire> addCompte(@RequestBody CompteBancaire compte) {
        compte = compteService.creerCompte(compte);
        return ResponseEntity.created(URI.create("/api/comptes/" + compte.getId())).body(compte);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompteBancaire> updateCompte(@PathVariable Long id, @RequestBody CompteBancaire compte) {
        if (!id.equals(compte.getId())) {
            return ResponseEntity.badRequest().build();
        }
        compte = compteService.modifierCompte(compte);
        if (compte == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(compte);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompte(@PathVariable Long id) {
        boolean deleted = compteService.supprimerCompte(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }


}
