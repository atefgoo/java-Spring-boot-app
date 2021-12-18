package tn.enig.tp4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.enig.tp4.model.Magasin;

@Repository
public interface IMagasinDao extends JpaRepository<Magasin,Integer> {
}