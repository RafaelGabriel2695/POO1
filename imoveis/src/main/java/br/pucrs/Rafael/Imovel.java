package main.java.br.pucrs.Rafael;

public class Imovel {

    private String proprietario;
    private int areaConstruida;

    public Imovel(String umProprietario, int umaAreaConstruida) {
        this.proprietario = umProprietario;
        this.areaConstruida = umaAreaConstruida;
    }

    public String getProprietario() {
        return proprietario;
    }

}
