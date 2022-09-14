package fr.m2i.compte.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Long montant;

    private Boolean reccuring;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="compte_id")
    private Compte compte;





}
