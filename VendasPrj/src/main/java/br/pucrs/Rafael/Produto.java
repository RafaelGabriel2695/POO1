package br.pucrs.Rafael;

public class Produto {

    private int codigo;
    private String nome;
    private Double preco;

    public Produto(int umCodigo, String umNome, double umPreco) {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.preco = umPreco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString(){
        return "Código:" + codigo +
                "Nome:" + nome +
                "Preço:" + preco;
    }
}
