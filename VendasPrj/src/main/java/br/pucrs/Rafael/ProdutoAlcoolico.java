package br.pucrs.Rafael;

public class ProdutoAlcoolico extends Produto {

    private static final double TAXA_TRAGO = 2.0;

    public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco) {
        super(umCodigo, umNome, umPreco);
    }

    public double getTAXA() {
        return TAXA_TRAGO;
    }

    @Override
    public double getPreco() {
        return super.getPreco() * TAXA_TRAGO;
    }

    public String toString() {
        return super.toString() + "Taxa para produtos alcoolicos: 200%";
    }
}
