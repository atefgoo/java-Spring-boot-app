package tn.enig.tp4.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nom")
    private String nom ;
    @Column(name="lieu")
    private String lieu;

}
