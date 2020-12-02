package code;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;

public class Scenario {
    
    // Attributs
    private Bandeau monBandeau;
    private HashMap<Integer, CoupleEffetMessage> listeCouples;
    
    
    // Constructeur
    public Scenario() {
        listeCouples = new HashMap<>();
    }
    
    
    // Getters
    public Bandeau getBandeau() {
        return monBandeau;
    }
    
    
    // ajouterEffet()
    public void ajouterEffet(int position, Effet effet, InfoMessage infoMess) {
        CoupleEffetMessage couple = new CoupleEffetMessage(effet, infoMess);
        listeCouples.put(position, couple);
    }
    
    
    // lancerScenario()
    public void lancerScenario() {
        monBandeau = new Bandeau();
        int nbrEffets = listeCouples.size();
        
        InfoMessage infoMess = null;
        Effet effet = null;
        
        for (int i = 1; i < nbrEffets + 1; i++) {
            System.out.println("Effet n°" + i);
            CoupleEffetMessage couple = listeCouples.get(i);
            infoMess = couple.getInfoMess();
            effet = couple.getEffet();
            effet.lancerEffet(monBandeau, infoMess);
        }
        monBandeau.close();
        
    }

    
}
