package com.clean.architecture.cursocleanarchitecture.escola;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Cpf {

    public String numero;

    public Cpf(String numero) {
        if(Objects.isNull(numero) || numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
            throw new IllegalArgumentException("Cpf inválido");
        }
        this.numero = numero;
    }
}
