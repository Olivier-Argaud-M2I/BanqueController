package fr.m2i.compte.services;


import fr.m2i.compte.entities.Compte;
import fr.m2i.compte.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteService {

    @Autowired
    CompteRepository compteRepository;


    public Compte getCompte(Long id){
        return compteRepository.findById(id).get();
    }


    public Compte newCompte(Compte compte){
        return compteRepository.save(compte);
    }

}
