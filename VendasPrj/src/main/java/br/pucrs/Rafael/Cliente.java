package br.pucrs.Rafael;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String toString() {
        return String.format("Cliente: %s, CPF: %s", nome, cpf);
    }
}
