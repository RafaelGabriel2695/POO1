package br.pucrs.Rafael;

public class ClientePJ extends Cliente {

    private String cnpj;

    public ClientePJ(int umCodigo, String umNome, String umCnpj) {
        super(umCodigo, umNome);
        this.cnpj = umCnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "CNPJ: " + cnpj;
    }
}
