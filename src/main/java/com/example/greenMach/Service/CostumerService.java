package com.example.greenMach.Service;

import com.example.greenMach.dtos.CreateCostumerDTO;
import com.example.greenMach.model.Customer;
import com.example.greenMach.repositories.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerService
{
    @Autowired
    CustomerRepository customerRepository;

    public Customer saveCostumer(CreateCostumerDTO createCostumerDTO)
    {
        var customer = new Customer();
        BeanUtils.copyProperties(createCostumerDTO, customer);
        return customerRepository.save(customer);
    }
}
