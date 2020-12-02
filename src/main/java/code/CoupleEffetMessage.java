/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Stéphane
 */
public class CoupleEffetMessage {
    
    // Attributs
    private Effet effet;
    private InfoMessage infoMess;
    
    
    // Constructeur
    public CoupleEffetMessage(Effet effet, InfoMessage infoMess) {
        this.effet = effet;
        this.infoMess = infoMess;
    }
    
    
    // Getters
    public Effet getEffet() {
        return effet;
    }
    
    public InfoMessage getInfoMess() {
        return infoMess;
    }
    
}
