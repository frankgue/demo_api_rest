package com.gkfcsolution.demo_api_rest.repository;

import com.gkfcsolution.demo_api_rest.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
