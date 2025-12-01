package com.example.greenMach.Service;

import com.example.greenMach.dtos.CreateFarmerDTO;
import com.example.greenMach.model.Farmer;
import com.example.greenMach.repositories.FarmerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmerService
{
    @Autowired
    FarmerRepository farmerRepository;

    public Farmer saveFarmer(CreateFarmerDTO createFarmerDTO)
    {
        var farmer = new Farmer();
        BeanUtils.copyProperties(createFarmerDTO, farmer);
        return farmerRepository.save(farmer);
    }

}
