package main.java.br.pucrs.Rafael;

public class Geo {

    private double latitude;
    private double longitude;

    public Geo(double umalatidude, double umalongitude){
        this.latitude = umalatidude;
        this.longitude = umalongitude;
    }

    public double getLatidude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLatitude(double novaLatitude){
        latitude = novaLatitude;
    }

    public void setLongitude(double novaLongitude){
        longitude = novaLongitude;
    }
}
