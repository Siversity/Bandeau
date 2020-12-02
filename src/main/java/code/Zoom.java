package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

// Zoom sur un texte
public class Zoom extends Effet {
    
    // Attribut
    private int tailleZoom;
    
    
    // Constructeur
    public Zoom(int dureeEffet, Color couleurEffet, int tailleZoom) {
        super(dureeEffet, couleurEffet);
        this.tailleZoom = tailleZoom;
    }
    
    @Override
    public void lancerEffet(Bandeau monBandeau, String monMessage, Font maPolice) {
        int zoomMax = maPolice.getSize()*tailleZoom;
        int dureeZoomAffiche = (dureeEffet*1000)/zoomMax;
        
        monBandeau.setFont(maPolice);
        monBandeau.setForeground(couleurEffet);
        monBandeau.setMessage(monMessage);
        
        for (int i = 0; i < zoomMax ; i++) {
		monBandeau.setFont(new Font(maPolice.getFontName(), maPolice.getStyle(), i));
		monBandeau.sleep(dureeZoomAffiche);
	} 
    }


    
    
}
