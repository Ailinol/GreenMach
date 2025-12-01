package com.example.greenMach.model;

import com.example.greenMach.enums.VerificationStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_farmers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Farmer extends User{

    private String farmName;

    @Column(columnDefinition = "TEXT")
    private String bio;

    private String nuit; // Fiscal ID

    @Enumerated(EnumType.STRING)
    private VerificationStatus verificationStatus = VerificationStatus.PENDENTE;

    private String paymentKey; // M-Pesa
    private Double ratingAverage = 0.0;
    private Integer totalSales = 0;

    // Farmer tem produtos
    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Product> products = new ArrayList<>();

    // Farmer recebe pedidos
    @OneToMany(mappedBy = "farmer")
    @ToString.Exclude
    private List<Order> sales = new ArrayList<>();
}
