package code;

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
