package code;

// Affichage type pendu

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

public class Pendu extends Effet {
    
    // Attributs
    
    
    // Constructeur
    public Pendu(int dureeEffet, Color couleurBackground) {
        super(dureeEffet*1000, couleurBackground);
    }
    
    
    // lancerEffet()
    @Override
    public void lancerEffet(Bandeau monBandeau, InfoMessage infoMess) {
        // Info message
        Font policeMessage = infoMess.getPolice();
        Color couleurMessage = infoMess.getCouleur();
        String monMessage = infoMess.getMessage();
        
        // Variables
        int tailleMessage = monMessage.length();
        Random r = new Random();
        int n = 0;
        String messageAffiche = "";
        String messageTemoin = "";
        ArrayList<String> listeCaracteresMessageInitial = new ArrayList<>();
        ArrayList<String> listeCaracteresMessageAffiche = new ArrayList<>();
        for (int i = 0; i < tailleMessage; i++) {
            listeCaracteresMessageInitial.add(String.valueOf(monMessage.charAt(i)));
            if (monMessage.charAt(i) == ' ') {
                listeCaracteresMessageAffiche.add(" ");
            }
            else {
                listeCaracteresMessageAffiche.add("_");
            }
        }
        
        // Affichage bandeau
        monBandeau.setFont(policeMessage);
        monBandeau.setForeground(couleurMessage);
        monBandeau.setMessage(monMessage);
        monBandeau.setBackground(couleurBackground);
        
        // Effet pendu
        while (monMessage.equals(messageAffiche) == false) {
            messageAffiche = ""; 
            n = r.nextInt(listeCaracteresMessageInitial.size());
            if (listeCaracteresMessageInitial.get(n).equals(" ") == false) {
                listeCaracteresMessageAffiche.set(n, listeCaracteresMessageInitial.get(n));
                listeCaracteresMessageInitial.set(n, " ");
                
                for (int j = 0; j < tailleMessage; j++) {
                messageAffiche = messageAffiche + listeCaracteresMessageAffiche.get(j);
                }
                messageTemoin = messageAffiche;
                monBandeau.setMessage(messageAffiche);
                monBandeau.sleep(dureeEffet/tailleMessage);
            }
        }
    }
}
