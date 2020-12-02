package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;

public class Scenario {
    
    // Attributs
    private Bandeau monBandeau;
    private HashMap<Integer, InformationMessage> listeEffets;
    
    
    // Constructeur
    public Scenario() {
        listeEffets = new HashMap<>();
    }
    
    
    // Getters
    public Bandeau getBandeau() {
        return monBandeau;
    }
    
    
    // ajouterEffet()
    public void ajouterEffet(int position, Effet monEffet, String monMessage, Font maPolice) {
        InformationMessage infoMess = new InformationMessage(monEffet, monMessage, maPolice);
        listeEffets.put(position, infoMess);
    }
    
    
    // lancerScenario()
    public void lancerScenario() {
        monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        int nbrEffets = listeEffets.size();
        InformationMessage infoMess = null;
        for (int i = 1; i < nbrEffets + 1; i++) {
            System.out.println("Effet n°" + i);
            infoMess = listeEffets.get(i);
            Effet effet = infoMess.getEffet();
            String message = infoMess.getMessage();
            Font police = infoMess.getFont();
            effet.lancerEffet(monBandeau, message, police);
        }
        monBandeau.close();
        
    }

    
}
