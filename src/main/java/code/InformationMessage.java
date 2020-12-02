package code;

import java.awt.Font;

public class InformationMessage {
    
    // Attributs
    private Effet monEffet; 
    private String monMessage;
    private Font maPolice;
    
    // Constructeur
    public InformationMessage(Effet monEffet, String monMessage, Font maPolice) {
        this.monEffet = monEffet;
        this.monMessage = monMessage;
        this.maPolice = maPolice;
    }
    
    
    // Getters
    public Effet getEffet() {
        return monEffet;
    }
    
    public String getMessage() {
        return monMessage;
    }
    
    public Font getFont() {
        return maPolice;
    }
    
}
