package com.clean.architecture.cursocleanarchitecture.escola;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Aluno {
    private Cpf cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(Cpf cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        if (this.telefones.stream().noneMatch(telefone -> telefone.getDdd().equals(ddd) &&
                telefone.getNumero().equals(numero))) {
            this.telefones.add(new Telefone(ddd, numero));
        }
    }
}
