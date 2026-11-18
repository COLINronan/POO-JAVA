package appli;

import java.awt.image.BufferedImage;

public abstract class Image extends Dossier{
    private int largeur;
    private int hauteur;
    private long taille;
    private boolean aAlpha;

    public Image(){

    }

    public long getTaille(){
        return taille;
    }

    public abstract String getType();

    public abstract Exif extraireExif();

    public BufferedImage charger(){

    }

    public List<Image> collecterImages(){

    }

}