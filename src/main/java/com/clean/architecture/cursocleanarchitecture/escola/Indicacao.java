package com.clean.architecture.cursocleanarchitecture.escola;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Indicacao {

    private Aluno indicante;
    private Aluno indicado;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicante, Aluno indicado) {
        this.indicante = indicante;
        this.indicado = indicado;
        this.dataIndicacao = LocalDateTime.now();
    }
}
