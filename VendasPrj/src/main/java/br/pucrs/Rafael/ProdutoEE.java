package br.pucrs.Rafael;

import java.time.LocalDate;

public class ProdutoEE extends Produto {

    private int diasGarantia;
    private LocalDate diacompra;

    public ProdutoEE(int umCodigo, String umNome, double umPreco, int diaGarantia) {
        super(umCodigo, umNome, umPreco);
        this.diasGarantia = diaGarantia;
        diacompra = LocalDate.now();
    }

    public LocalDate getDiasGarantia() {
        return diacompra.plusDays(diasGarantia);
    }

    @Override
    public String toString() {
        return super.toString() + "Garantia: " + diasGarantia;
    }
}
