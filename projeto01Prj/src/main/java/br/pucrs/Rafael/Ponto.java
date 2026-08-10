package br.pucrs.Rafael;

public class Ponto {
    private double coorX;
    private double coorY;

    public Ponto(double x, double y){
        this.coorX = x;
        this.coorY = y;
    }

    public String toString(){
        return String.format("(%.2f,%.2f)", coorX, coorY);
    }

}
