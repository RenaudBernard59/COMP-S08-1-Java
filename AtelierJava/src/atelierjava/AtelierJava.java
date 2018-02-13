/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

/**
 *
 * @author renob
 */
public class AtelierJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal cochon = new Animal();
//        Animal cochon = null;
        System.out.println(cochon);
        
        Animal cochon2 = new Animal();
        Animal girafe = new Animal();
        
        cochon2.espece = "Cochon";
        girafe.espece = "Girafe";
        cochon2.poidsEnKg = 12;
        girafe.poidsEnKg = 15;
        
        cochon2.afficher();
        
        
        
        
        
        
        
        /*
        System.out.println(
        cochon.espece + " | " + cochon.poidsEnKg + "kg | \n" +
        cochon2.espece + " | " + cochon2.poidsEnKg + "kg | \n" +
        girafe.espece + " | " + girafe.poidsEnKg + "kg | \n" + "END"
        
        );*/
        
    }
    
    
    
}
