package service;

import model.CompteBancaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BanqueRepository;

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

}
