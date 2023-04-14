package controller;

import model.CompteBancaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.CompteService;

@Controller
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

}
