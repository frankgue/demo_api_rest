package com.gkfcsolution.demo_api_rest.service;

import com.gkfcsolution.demo_api_rest.model.Produit;

import java.util.List;

public interface ProduitService {
    Produit creer(Produit produit);
    List<Produit> lire();
    Produit modifier(Long id, Produit produit);

    String supprimer(Long id);
}
