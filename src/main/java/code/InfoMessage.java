package code;

import java.awt.Color;
import java.awt.Font;

public class InfoMessage {
    
    // Attributs
    private String monMessage;
    private Font policeMessage;
    private Color couleurMessage;
    
    // Constructeur
    public InfoMessage(String monMessage, Font policeMessage, Color couleurMessage) {
        this.monMessage = monMessage;
        this.policeMessage = policeMessage;
        this.couleurMessage = couleurMessage;
    }
    
    
    // Getters
    public String getMessage() {
        return monMessage;
    }
    
    public Font getPolice() {
        return policeMessage;
    }
    
    public Color getCouleur() {
        return couleurMessage;
    }
    
}
