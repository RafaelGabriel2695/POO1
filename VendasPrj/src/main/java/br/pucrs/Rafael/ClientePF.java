package br.pucrs.Rafael;

public class ClientePF extends Cliente {

    private String cpf;

    public ClientePF(int umCodigo, String umNome, String umCpf){
        super(umCodigo, umNome);
        this.cpf = umCpf;
    }

    public String getCpf(){
        return cpf;
    }

    @Override
    public String toString(){
        return super.toString() + " [cpf = " + cpf + "]";
    }

}
