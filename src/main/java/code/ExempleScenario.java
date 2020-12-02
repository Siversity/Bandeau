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
        
        Scenario sc1 = new Scenario();
        Font maPolice = new Font("Dialog", Font.ITALIC, 40);
        
        Aucun e1 = new Aucun(1, Color.RED);
        Zoom e2 = new Zoom(3, Color.CYAN, 2);
        Clignotant e3 = new Clignotant(2, Color.GREEN, 20);
        
        sc1.ajouterEffet(1, e1, "Message 1", maPolice);
        sc1.ajouterEffet(2, e2, "Position 2", maPolice);
        sc1.ajouterEffet(3, e3, "Clignote 3", maPolice);
        
        sc1.lancerScenario();

        
    }
    
}
