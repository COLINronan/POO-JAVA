package appli;

import java.util.Date;

public abstract class Elem{
    private String nom;
    private String chemin;
    private Date dateModification;

    public Elem(){

    }

    public String getNom(){
        return nom;
    }

    public String getChemin(){
        return chemin;
    }

    public Date getDateModification(){
        return dateModification;
    }

    public abstract long getTaille();

    public abstract List<Image> collecterImages();
}