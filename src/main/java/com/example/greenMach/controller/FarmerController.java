package com.example.greenMach.controller;


import com.example.greenMach.Service.FarmerService;
import com.example.greenMach.dtos.CreateFarmerDTO;
import com.example.greenMach.model.Farmer;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmerController
{
    @Autowired
    FarmerService farmerService;

    @PostMapping("/cadastroFarmer")
    public ResponseEntity<Farmer> saveFarmer(@RequestBody @Valid CreateFarmerDTO createFarmerDTO)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(farmerService.saveFarmer(createFarmerDTO));
    }
}
