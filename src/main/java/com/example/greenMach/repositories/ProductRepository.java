package com.example.greenMach.repositories;

import com.example.greenMach.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    //Busca por nome
    List<Product> findByNameContainingIgnoreCase(String name);

    //Busca pelo menor preco
    List<Product> findByPriceLessThan(Double price);

    //Busca Por categoria
    List<Product> findByCategory_Name(String name);
}
