package fr.m2i.compte.controllers;

import fr.m2i.compte.entities.Compte;
import fr.m2i.compte.entities.Transaction;
import fr.m2i.compte.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/transactions")
public class TransactionController {


    @Autowired
    TransactionService transactionService;

    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Transaction getTransaction(@PathVariable("id")Long id){

        Transaction transaction = transactionService.getTransactionById(id);
        return transaction;
    }

    @GetMapping(
            path = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Transaction> getAll(){
        return transactionService.getAll();
    }



    @PostMapping(
            path = "/save",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Transaction newTransaction(@RequestBody Transaction transaction){

        return transactionService.newTransaction(transaction);
    }

    @DeleteMapping(
            path = "/delete",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void deleteTransaction(@RequestBody Transaction transaction){

        transactionService.delete(transaction);
    }

}









