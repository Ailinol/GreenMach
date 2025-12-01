package com.example.greenMach.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_product_images")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String imageUrl;

    private boolean isPrimary = false;
    private Integer sortOrder = 0;

    // Relacionamento (Muitas imagens para UM produto)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    @ToString.Exclude
    private Product product;
}