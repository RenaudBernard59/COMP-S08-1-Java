/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compethance.horloge;

/**
 * @author Formation
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Horloge horloge1 = new Horloge();
        
        horloge1.setHeure(23);
        horloge1.setMinute(59);
        horloge1.setSeconde(59);
        
        horloge1.afficher();
        
        horloge1.ajouterSeconde();
        
        horloge1.afficher();
    }
    
}
