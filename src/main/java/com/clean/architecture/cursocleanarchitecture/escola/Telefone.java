package com.clean.architecture.cursocleanarchitecture.escola;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(Objects.isNull(ddd) ||
                Objects.isNull(numero) ||
                !ddd.matches("\\d{2}") ||
                !numero.matches("\\d{8}|\\d{9}")){
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
