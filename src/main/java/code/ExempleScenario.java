/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Stéphane
 */
public class ExempleScenario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // On créee un nouveau scénario
        Scenario s1 = new Scenario();
        
    // 1ER EFFET
        // On défini les information du message (message, police et couleur)
        InfoMessage m1 = new InfoMessage("J'ai faim, et toi ?", new Font("Dialog", Font.ITALIC, 40), Color.ORANGE);
        // On défini les infos de l'effet (durée et couleur de fond)
        Aucun e1 = new Aucun(2, Color.WHITE);
        
    // 2EME EFFET
        InfoMessage m2 = new InfoMessage("Oui, moi aussi !", new Font("Monospaced", Font.BOLD, 30), Color.GREEN);
        Zoom e2 = new Zoom(3, Color.LIGHT_GRAY, 2);

    // 3EME EFFET
        InfoMessage m3 = new InfoMessage("Allons au restaurant !", new Font("Serif", Font.PLAIN, 50), Color.ORANGE);
        Clignotant e3 = new Clignotant(2, Color.BLACK, 10);
    
    // 4EME EFFET
    
        // On rajoute les effets dans le scénario
        s1.ajouterEffet(1, e1, m1);
        s1.ajouterEffet(2, e2, m2);
        s1.ajouterEffet(3, e3, m3);
        
        s1.lancerScenario();
    }
    
}
