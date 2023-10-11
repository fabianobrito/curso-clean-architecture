package com.clean.architecture.cursocleanarchitecture.escola;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Email {

    private String endereco;

    public Email(String endereco) {
        if (Objects.isNull(endereco) || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.endereco = endereco;
    }
}
