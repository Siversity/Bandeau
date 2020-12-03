package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

// Affiche le message lettre par lettre
public class Teletype extends Effet {
    
    // Attributs
    private SensAffichage sens;
    
    
    // Constructeur
    public Teletype(int dureeEffet, Color couleurBackground, SensAffichage sens) {
        super(dureeEffet*1000, couleurBackground);
        this.sens = sens;
    }
    
    
    // lancerEffet()
    @Override
    public void lancerEffet(Bandeau monBandeau, InfoMessage infoMess) {
        // Info message
        Font policeMessage = infoMess.getPolice();
        Color couleurMessage = infoMess.getCouleur();
        String monMessage = infoMess.getMessage();
        
        // Variable
        String messageAffiche = "";
        int tailleMessage = monMessage.length();
        
        // Affichage bandeau
        monBandeau.setFont(policeMessage);
        monBandeau.setForeground(couleurMessage);
        monBandeau.setMessage(messageAffiche);
        monBandeau.setBackground(couleurBackground);
        
        // Effet teletype gauche
        if (sens.equals(SensAffichage.GAUCHE)) {
            for (int i = 0; i < tailleMessage; i++) {
            messageAffiche = messageAffiche + monMessage.charAt(i);
            monBandeau.setMessage(messageAffiche);
            monBandeau.sleep(dureeEffet/tailleMessage);
            }
        }
        
        // Effet teletype droite
        if (sens.equals(SensAffichage.DROITE)) {
            for (int i = 0; i < tailleMessage; i++) {
            messageAffiche = monMessage.charAt(tailleMessage - 1 - i) + messageAffiche;
            monBandeau.setMessage(messageAffiche);
            monBandeau.sleep(dureeEffet/tailleMessage);
            }
        }
        
    }
    
}
