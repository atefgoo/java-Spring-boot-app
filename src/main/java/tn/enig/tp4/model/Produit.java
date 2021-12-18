package tn.enig.tp4.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="description")
    private String description ;
    @Column(name="prixAchat")
    private float prixAchat;
    @Column(name="prixVente")
    private float prixVente;
    @Column(name="stock")
    private int stock;
    @ManyToOne
    @JoinColumn(name = "id_magasin")
    private Magasin magasin;
}
