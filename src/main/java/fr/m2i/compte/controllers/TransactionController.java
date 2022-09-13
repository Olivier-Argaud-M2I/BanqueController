package fr.m2i.compte.controllers;

import fr.m2i.compte.entities.Transaction;
import fr.m2i.compte.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/transactions")
public class TransactionController {


    @Autowired
    TransactionService transactionService;

    @PostMapping(
            path = "/new",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Transaction newTransaction(@RequestBody Transaction transaction){

        return transactionService.newTransaction(transaction);
    }
}
