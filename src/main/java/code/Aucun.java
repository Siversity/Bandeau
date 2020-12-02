package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

// Affiche un texte sans effet
public class Aucun extends Effet {

    // Constructeur
    public Aucun(int dureeEffet, Color couleurEffet) {
        super(dureeEffet, couleurEffet);
    }
    
    
    // lancerEffet()
    @Override
    public void lancerEffet(Bandeau monBandeau, String monMessage, Font maPolice) {
        monBandeau.setFont(maPolice);
        monBandeau.setForeground(couleurEffet);
        monBandeau.setMessage(monMessage);
        monBandeau.sleep(1000*dureeEffet);
    }
    
}
