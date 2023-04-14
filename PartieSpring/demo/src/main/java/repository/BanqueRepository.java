package repository;

import model.CompteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanqueRepository extends JpaRepository<CompteBancaire,Long> {
}
