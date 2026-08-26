package br.pucrs.Rafael;

public class Estudante extends ClientePF {
    private String instituicao;

    public Estudante(int umCodigo, String umNome, String umCpf, String umainstituicao) {
        super(umCodigo, umNome, umCpf);
        this.instituicao = umainstituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    @Override
    public String toString() {
        return super.toString() + "Instituição: " + instituicao;
    }
}
