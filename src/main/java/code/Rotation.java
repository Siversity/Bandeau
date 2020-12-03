package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

// Fait tourner un texte sur lui-même
public class Rotation extends Effet {
    
    // Attributs
    private SensRotation sens;
    
    
    // Constructeur
    public Rotation(int dureeEffet, Color couleurBackground, SensRotation sens) {
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
        
        // Affichage bandeau
        monBandeau.setFont(policeMessage);
        monBandeau.setForeground(couleurMessage);
        monBandeau.setMessage(monMessage);
        monBandeau.setBackground(couleurBackground);
        
        // Effet rotation horraire
        if (sens.equals(SensRotation.HORRAIRE)) {
            for (int i = 0; i <= dureeEffet; i++) {
		monBandeau.setRotation(2*Math.PI*i / dureeEffet);
		monBandeau.sleep(1);
            }
        }
        
        // Effet rotation trigonométrique
        if (sens.equals(SensRotation.TRIGONOMETRIQUE)) {
            for (int i = 0; i <= dureeEffet; i++) {
		monBandeau.setRotation(- 2*Math.PI*i / dureeEffet);
		monBandeau.sleep(1);
            }
        }
    }
    
}
