package com.example.greenMach.model;

import com.example.greenMach.enums.UnitType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DurationFormat;

import javax.lang.model.type.UnionType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private Integer minOrderQuantity = 1;

    @Enumerated(EnumType.STRING)
    private UnitType unit; // KG, UNIT

    private boolean isOrganic;
    private LocalDate harvestDate;
    private boolean isActive = true;

    // Optimistic Locking (Evita sobrescrita concorrente)
    @Version
    private Long version;

    // Relacionamentos
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farmer_id", nullable = false)
    private Farmer farmer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<ProductImage> images = new ArrayList<>();
}