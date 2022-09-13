package fr.m2i.compte.services;


import fr.m2i.compte.entities.Transaction;
import fr.m2i.compte.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;


    public Transaction newTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }

}
