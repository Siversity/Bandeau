package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public abstract class Effet {
    
    // Attributs
    protected int dureeEffet;
    protected Color couleurBackground;
    
    
    // Constructeur
    public Effet(int dureeEffet, Color couleurBackground) {
        this.dureeEffet = dureeEffet;
        this.couleurBackground = couleurBackground;
    }
    
    
    // lancerEffet()
    public abstract void lancerEffet(Bandeau monBandeau, InfoMessage infoMess);

}
