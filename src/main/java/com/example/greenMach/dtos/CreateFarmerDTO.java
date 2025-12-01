package com.example.greenMach.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateFarmerDTO(
        @NotBlank(message = "Email é obrigatório")
        String email,

        @NotBlank(message = "Senha é obrigatória")
        @Size(min = 6, max = 50)
        String password,

        @NotBlank(message = "Nome completo é obrigatório")
        String fullName,

        String phoneNumber,

        @NotBlank(message = "Nome da fazenda é obrigatório")
        String farmName,

        String bio,

        @NotBlank(message = "Nuit é obrigatório")
        String nuit,

        String paymentKey
) {
}
