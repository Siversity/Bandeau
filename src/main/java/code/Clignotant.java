package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

// Fait clignoter un texte
public class Clignotant extends Effet {
    
    // Attributs
    private int nbrClignotements;
    
    
    // Constructeur
    public Clignotant(int dureeEffet, Color couleurBackground, int nbrClignotements) {
        super(dureeEffet*1000, couleurBackground);
        this.nbrClignotements = nbrClignotements;
    }
    
    
    // lancerEffet()
    @Override
    public void lancerEffet(Bandeau monBandeau, InfoMessage infoMess) {
        // Variable
        int dureeTic = dureeEffet/nbrClignotements;
        
        // Info message
        Font policeMessage = infoMess.getPolice();
        Color couleurMessage = infoMess.getCouleur();
        String monMessage = infoMess.getMessage();
        
        // Affichage bandeau
        monBandeau.setFont(policeMessage);
        monBandeau.setForeground(couleurMessage);
        monBandeau.setMessage(monMessage);
        monBandeau.setBackground(couleurBackground);
        
        // Effet clignotement
        for (int i = 0; i < nbrClignotements; i++) {
            System.out.println("    Boucle n°" + i);
            monBandeau.setMessage(monMessage);
            monBandeau.sleep(dureeTic/2);
            monBandeau.setMessage("");
            monBandeau.sleep(dureeTic/2);
        }
    }
    
}
