package br.pucrs.Rafael;

public class ItemVenda {

    private int quantidade;
    private Produto prod;

    public ItemVenda(int umaQuantidade, Produto umProd) {
        this.quantidade = umaQuantidade;
        this.prod = umProd;
    }

    public double getValor() {
        return quantidade * prod.getPreco();
    }

    public String toString() {
        return "Produto: " + prod.getNome() +
                "Quantidade: " + quantidade +
                "Valor: " + getValor();
    }
}
