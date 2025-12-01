package com.example.greenMach.dtos;

import jakarta.validation.constraints.NotBlank;

public record CreateCostumerDTO(
        @NotBlank(message = "Email é obrigatório")
        String email,

        @NotBlank(message = "Senha é obrigatória")
        String password,

        @NotBlank(message = "Nome completo é obrigatório")
        String fullName,

        String phoneNumber,

        String preferences
) {
}
