package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

// Fait clignoter un texte
public class Clignotant extends Effet {
    
    // Attributs
    private int nbrClignotements;
    
    
    // Constructeur
    public Clignotant(int dureeEffet, Color couleurEffet, int nbrClignotements) {
        super(dureeEffet, couleurEffet);
        this.nbrClignotements = nbrClignotements;
    }
    
    
    // lancerEffet()
    @Override
    public void lancerEffet(Bandeau monBandeau, String monMessage, Font maPolice) {
        int dureeTic = (dureeEffet*1000)/nbrClignotements;
        System.out.println("Clignotant");
        monBandeau.setFont(maPolice);
        monBandeau.setForeground(couleurEffet);
        monBandeau.setMessage(monMessage);
        for (int i = 0; i < nbrClignotements; i++) {
            System.out.println("    Boucle n°" + i);
            monBandeau.setMessage(monMessage);
            monBandeau.sleep(dureeTic/2);
            monBandeau.setMessage("");
            monBandeau.sleep(dureeTic/2);
        }
    }
    
}
