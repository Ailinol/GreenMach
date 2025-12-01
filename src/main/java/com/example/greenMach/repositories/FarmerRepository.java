package com.example.greenMach.repositories;

import com.example.greenMach.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {

    //Busca por nome
    Optional<Farmer> findByFarmName(String name);

    //Busca por Id
    Optional<Farmer>  findByEmail(String email);
}
