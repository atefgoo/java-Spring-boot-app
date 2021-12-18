package tn.enig.tp4.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.enig.tp4.dao.*;
import tn.enig.tp4.model.Magasin;
import tn.enig.tp4.model.Produit;

import java.util.List;

@CrossOrigin("*")
@RestController
public class AppRest {

    @Autowired
    IMagasinDao magasinDao;
    @Autowired
    IProduitDao produitDao;

    public void setMagasinDao(IMagasinDao magasinDao) {
        this.magasinDao = magasinDao;
    }

    public void setProduitDao(IProduitDao produitDao) {
        this.produitDao = produitDao;
    }
    @GetMapping("/produits")
    public List<Produit> getAllProducts(){
        return produitDao.findAll();
    }
    @GetMapping("/magasins")
    public List<Magasin> getAllMagasins(){
        return magasinDao.findAll();
    }
    @PostMapping("/addProduit")
    public void add(@RequestBody Produit produit){
        produitDao.save(produit);
    }
    @DeleteMapping("/deleteProduit/{id}")
    public void delete(@PathVariable("id") int id){
        produitDao.deleteById(id);
    }
    @GetMapping("/magasinProduits/{id}")
    public List<Produit> getAllProductsByMagasinId(@PathVariable("id") int id){
        return produitDao.getAllProductsByMagasinId(id);
    }
}