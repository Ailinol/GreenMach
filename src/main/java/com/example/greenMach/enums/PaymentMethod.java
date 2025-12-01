package com.example.greenMach.enums;

public enum PaymentMethod {
    MPESA("M-Pesa"),
    EMOLA("E-Mola"),
    CONTA_MOVEL("Conta Móvel"),
    POS("POS / Cartão"),
    NUMERARIO("Numerário na Entrega");

    private final String descricao;

    PaymentMethod(String descricao){
        this.descricao = descricao;
    }
}
