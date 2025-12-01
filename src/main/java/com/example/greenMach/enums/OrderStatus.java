package com.example.greenMach.enums;

public enum OrderStatus {
    AGUARDANDO_PAGAMENTO("Aguardando Pagamento"),
    PAGO("Pago"),
    EM_PREPARACAO("Em Preparação"),
    PRONTO_PARA_ENTREGA("Pronto para Entrega"),
    EM_TRANSITO("Em Trânsito"),
    ENTREGUE("Entregue"),
    CANCELADO("Cancelado");

    private final String descricao;

    OrderStatus(String descricao){
        this.descricao = descricao;
    }
}
