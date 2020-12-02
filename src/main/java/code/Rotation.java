package code;

// Fait tourner un texte sur lui-même

import bandeau.Bandeau;
import java.awt.Color;

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
        
    }
    
}
