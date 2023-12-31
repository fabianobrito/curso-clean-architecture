package com.clean.architecture.cursocleanarchitecture.escola;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno criarAlunoComDadosDosParametros(String nome, String cpf, String email) {
        this.aluno = new Aluno(new Cpf(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }
}
