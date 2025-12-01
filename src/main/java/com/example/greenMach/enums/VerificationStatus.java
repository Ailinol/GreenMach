package com.example.greenMach.enums;

public enum VerificationStatus {
    PENDENTE("Pendente"),
    EM_ANALISE("Em Análise"),
    APROVADO("Aprovado"),
    REJEITADO("Rejeitado"),
    BLOQUEADO("Bloqueado");

    private final String descricao;

    VerificationStatus(String descricao){
        this.descricao = descricao;
    }
}
