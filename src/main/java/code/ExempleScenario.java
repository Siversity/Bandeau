/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import bandeau.Bandeau;
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
        InfoMessage m1 = new InfoMessage("Aucun effet", new Font("Dialog", Font.ITALIC, 40), Color.ORANGE);
        // On défini les infos de l'effet (durée et couleur de fond)
        Aucun e1 = new Aucun(2, Color.WHITE);

    // 2EME EFFET
        InfoMessage m2 = new InfoMessage("Zoom x3", new Font("Monospaced", Font.BOLD, 60), Color.GREEN);
        Zoom e2 = new Zoom(2, Color.LIGHT_GRAY, 3);

    // 3EME EFFET
        InfoMessage m3 = new InfoMessage("Clignotements x13", new Font("Serif", Font.PLAIN, 50), Color.ORANGE);
        Clignotant e3 = new Clignotant(2, Color.BLACK, 13);

    // 4EME EFFET
        InfoMessage m4 = new InfoMessage("Rotation trigonométrique", new Font("Sans_Serif", Font.ROMAN_BASELINE, 50), Color.WHITE);
        Rotation e4 = new Rotation(1, Color.BLACK, SensRotation.TRIGONOMETRIQUE);

    // 5EME EFFET
        InfoMessage m5 = new InfoMessage("Teletype par la droite", new Font("Dialog", Font.BOLD, 40), Color.RED);
        Teletype e5 = new Teletype(4, Color.DARK_GRAY, SensAffichage.DROITE);
        
    // 6EME EFFET
        InfoMessage m6 = new InfoMessage("Ce texte est un test", new Font("Serif", Font.ITALIC, 50), Color.BLACK);
        Pendu e6 = new Pendu(4, Color.WHITE);


        // On rajoute les effets dans le scénario
        s1.ajouterEffet(1, e1, m1);
        s1.ajouterEffet(2, e2, m2);
        s1.ajouterEffet(3, e3, m3);
        s1.ajouterEffet(4, e4, m4);
        s1.ajouterEffet(5, e5, m5);
        s1.ajouterEffet(6, e6, m6);

        s1.lancerScenario();
        
    }
    
}
