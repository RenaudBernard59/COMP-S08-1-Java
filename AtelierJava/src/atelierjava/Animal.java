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
public class Animal {
    static int nbAnimaux = 0;
    
    String genre;
    String espece;
//    Animal Parent;
    int tailleEnCm;
    double poidsEnKg;
    
    public void afficher() {
        System.out.println(
        this.espece+ ", " +
        this.poidsEnKg + ", " +
        this.genre + ", " +
        this.tailleEnCm + "." 
        );
    }
       
    
    public Animal() {
        nbAnimaux++;
    }
}
