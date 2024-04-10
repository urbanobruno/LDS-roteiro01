package com.labdessoft.roteiro01.entity;

public enum TaskPriorityEnum {

    ALTA("Alta"),
    MEDIA("Média"),
    BAIXA("Baixa");

    private final String descricao;

    TaskPriorityEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
