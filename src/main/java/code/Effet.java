package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public abstract class Effet {
    
    // Attributs
    protected int dureeEffet;
    protected Color couleurEffet;
    
    
    // Constructeur
    public Effet(int dureeEffet, Color couleurEffet) {
        this.dureeEffet = dureeEffet;
        this.couleurEffet = couleurEffet;
    }
    
    
    // lancerEffet()
    public abstract void lancerEffet(Bandeau monBandeau, String monMessage, Font maPolice);

}
