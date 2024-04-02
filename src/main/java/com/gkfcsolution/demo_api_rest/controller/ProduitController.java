package com.gkfcsolution.demo_api_rest.controller;

import com.gkfcsolution.demo_api_rest.model.Produit;
import com.gkfcsolution.demo_api_rest.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit) {
        return produitService.creer(produit);
    }

    @GetMapping("/read")
    public List<Produit> read(){
        return produitService.lire();
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit newProduit) {
        return produitService.modifier(id, newProduit);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        return produitService.supprimer(id);
    }

}
