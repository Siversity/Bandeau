package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

// Zoom sur un texte
public class Zoom extends Effet {
    
    // Attribut
    private int puissanceZoom;
    
    
    // Constructeur
    public Zoom(int dureeEffet, Color couleurBackground, int tailleZoom) {
        super(dureeEffet*1000, couleurBackground);
        this.puissanceZoom = tailleZoom;
    }
    
    @Override
    public void lancerEffet(Bandeau monBandeau, InfoMessage infoMess) {
        Font policeMessage = infoMess.getPolice();
        Color couleurMessage = infoMess.getCouleur();
        String monMessage = infoMess.getMessage();
        
        int zoomMax = policeMessage.getSize()*puissanceZoom;
        int dureeZoomAffiche = dureeEffet/zoomMax;
        
        monBandeau.setFont(policeMessage);
        monBandeau.setForeground(couleurMessage);
        monBandeau.setMessage(monMessage);
        monBandeau.setBackground(couleurBackground);
        
        for (int i = 0; i < zoomMax ; i++) {
		monBandeau.setFont(new Font(policeMessage.getFontName(), policeMessage.getStyle(), i));
		monBandeau.sleep(dureeZoomAffiche);
	} 
    }


    
    
}
