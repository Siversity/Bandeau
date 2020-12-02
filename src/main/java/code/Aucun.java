package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

// Affiche un texte sans effet
public class Aucun extends Effet {

    // Constructeur
    public Aucun(int dureeEffet, Color couleurBackground) {
        super(dureeEffet*1000, couleurBackground);
    }
    
    
    // lancerEffet()
    @Override
    public void lancerEffet(Bandeau monBandeau, InfoMessage infoMess) {
        Font policeMessage = infoMess.getPolice();
        Color couleurMessage = infoMess.getCouleur();
        String monMessage = infoMess.getMessage();
        
        monBandeau.setFont(policeMessage);
        monBandeau.setForeground(couleurMessage);
        monBandeau.setMessage(monMessage);
        monBandeau.setBackground(couleurBackground);
        monBandeau.sleep(dureeEffet);
    }
    
}
