package fr.m2i.compte.repositories;


import fr.m2i.compte.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {
}
