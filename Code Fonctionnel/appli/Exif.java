package appli;

import java.util.Date;

public class Exif{
    private String marque;
    private String modele;
    private Date dateCapture;
    private float latitude;
    private float longitude;

    public Exif(){

    }

    public boolean aGPS(){

    }

    public String getMarque(){
        return marque;
    }

    public String getModele(){
        return modele;
    }

    public Date getDateCapture(){
        return dateCapture;
    }

    public float getLatitude(){
        return latitude;
    }

    public float getLongitude(){
        return longitude;
    }

    public String toString(){
        return marque + modele + dateCapture + latitude + longitude;
    }
}