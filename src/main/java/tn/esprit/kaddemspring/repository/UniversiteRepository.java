package tn.esprit.kaddemspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddemspring.model.Etudiant;
import tn.esprit.kaddemspring.model.Universit√©;

@Repository
public interface UniversiteRepository extends JpaRepository<Universit√©, Long> {
}
