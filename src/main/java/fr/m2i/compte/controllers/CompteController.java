package fr.m2i.compte.controllers;

import fr.m2i.compte.entities.Compte;
import fr.m2i.compte.entities.Transaction;
import fr.m2i.compte.services.CompteService;
import fr.m2i.compte.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/comptes")
public class CompteController {


    @Autowired
    CompteService compteService;



    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Compte getCompte(@PathVariable("id")Long id){
        return compteService.getCompte(id);
    }


    @GetMapping(
            path = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Compte> getAll(){
        return compteService.getAll();
    }


    @PostMapping(
            path = "/save",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Compte newCompte(@RequestBody Compte compte){

        return compteService.newCompte(compte);
    }

    @DeleteMapping(
            path = "/delete",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void deletenewCompte(@RequestBody Compte compte){

        compteService.delete(compte);
    }


}
