package com.example.greenMach.enums;

public enum UnitType {
    KG("Quilograma"),
    UNIT("Unidade"),
    SACO("Saco"),
    MOLHO("Molho"),
    CAIXA("Caixa"),
    LATA("Lata");

    private final String descricao;

    UnitType(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
