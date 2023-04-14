package service;

import model.CompteBancaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BanqueRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompteService {


    @Autowired
    BanqueRepository compteRepository;


    public void effectuerVirement(Long idCompteDebit, Long idCompteCredit, double montant) throws Exception {
        CompteBancaire compteDebit = compteRepository.findById(idCompteDebit).orElseThrow(() -> new Exception("Le compte à debiter est inexistante"));
        CompteBancaire compteCredit = compteRepository.findById(idCompteCredit).orElseThrow(() -> new Exception("Le compte à créditer  est inexistante"));

        if (compteDebit.getSolde() < montant) {
            throw new Exception("Solde insuffisant");
        }

        compteDebit.setSolde(compteDebit.getSolde() - montant);
        compteCredit.setSolde(compteCredit.getSolde() + montant);

        compteRepository.save(compteDebit);
        compteRepository.save(compteCredit);
    }


    public List<CompteBancaire> comptes(){

        return compteRepository.findAll();
    }

    public CompteBancaire creerCompte(CompteBancaire compte) {
        return compteRepository.save(compte);
    }

    public Optional<CompteBancaire> getCompteById(Long id) {
        return compteRepository.findById(id);
    }

    public CompteBancaire modifierCompte(CompteBancaire compte) {
        return compteRepository.save(compte);
    }

    public boolean supprimerCompte(Long id) {
        compteRepository.deleteById(id);
        return false;
    }

}
