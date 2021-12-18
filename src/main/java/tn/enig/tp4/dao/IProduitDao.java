package tn.enig.tp4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.enig.tp4.model.Produit;

import java.util.List;

@Repository
public interface IProduitDao extends JpaRepository<Produit,Integer> {

    @Query("select p from Produit p where p.magasin.id=:id")
    public List<Produit> getAllProductsByMagasinId(@Param("id") Integer id);

}