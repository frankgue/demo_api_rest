package com.gkfcsolution.demo_api_rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "PRODUIT")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 150)
    private String description;
    private Integer prix;
}
