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
        
        // On initialise un random qui permettra d'afficher aléatoirement les lettres du texte original à afficher
        Random r = new Random();
        int n = 0;
        
        // On initialise des tableaux indexables contenant le message original et le message à afficher
        ArrayList<String> listeCaracteresMessageInitial = new ArrayList<>();
        ArrayList<String> listeCaracteresMessageAffiche = new ArrayList<>();
        
        // On initialise le message à afficher
        String messageAffiche = "";
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
            // On réinitialise le message partiel à afficher à l'état n
            messageAffiche = "";
            // On récupère une lettre aléatoire parmis la liste de lettres du message original
            n = r.nextInt(listeCaracteresMessageInitial.size());
            if (listeCaracteresMessageInitial.get(n).equals(" ") == false) {
                // On transfère la lettre d'un tableau à l'autre
                listeCaracteresMessageAffiche.set(n, listeCaracteresMessageInitial.get(n));
                listeCaracteresMessageInitial.set(n, " ");
                
                // On ré-instance le message partiel avec la lettre récupérée en plus
                for (int j = 0; j < tailleMessage; j++) {
                messageAffiche = messageAffiche + listeCaracteresMessageAffiche.get(j);
                }
                monBandeau.setMessage(messageAffiche);
                monBandeau.sleep(dureeEffet/tailleMessage);
            }
            // Si le caractère récupéré est égale à un espace, on recommence
        }
    }
}
