package com.example.greenMach.dtos;

import com.example.greenMach.enums.UnitType;
import com.example.greenMach.exceptions.CreateError;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record CreateProductDTO(
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity,
        Integer minOrderQuantity,
        UnitType unit,
        boolean isOrganic,
        LocalDate harvestDate,
        Long farmerId,
        Long categoryId,
        List<String> imageUrls
) {

    public CreateProductDTO {
        // Validações
        if (name == null || name.isBlank()) {
            throw new CreateError("O nome do produto não pode ser vazio.");
        }

        if (description == null) {
            description = "";
        }

        if (price == null || price.signum() < 0) {
            throw new CreateError("O preço do produto deve ser maior ou igual a zero.");
        }

        if (stockQuantity == null || stockQuantity < 0) {
            throw new CreateError("A quantidade em estoque não pode ser negativa.");
        }

        if (minOrderQuantity == null || minOrderQuantity < 1) {
            minOrderQuantity = 1;
        }

        if (minOrderQuantity > stockQuantity) {
            throw new CreateError("A quantidade mínima de pedido não pode ser maior que a quantidade em estoque.");
        }

        if (unit == null) {
            throw new CreateError("O tipo de unidade (UnitType) deve ser definido.");
        }

        if (harvestDate != null && harvestDate.isAfter(LocalDate.now())) {
            throw new CreateError("A data de colheita não pode ser no futuro.");
        }

        if (farmerId == null) {
            throw new CreateError("O ID do agricultor é obrigatório.");
        }

        if (categoryId == null) {
            throw new CreateError("O ID da categoria é obrigatório.");
        }

        if (imageUrls == null) {
            imageUrls = List.of();
        }

        // Regras de negócio específicas
        if (isOrganic && unit == UnitType.UNIT) {
            throw new CreateError("Produtos orgânicos devem ser vendidos em KG, não em unidades.");
        }

        if (isOrganic && minOrderQuantity % 2 != 0) {
            throw new CreateError("Produtos orgânicos devem ter quantidade mínima par.");
        }
    }
}
