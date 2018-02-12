/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personne;

/**
 *
 * @author renob
 */
public class Personne {
    //==================================================
    //Définition des Attributs
    private String nom;
    private int age;
    
    
    //==================================================
    //Constructeur génral
    public Personne() {
        System.out.println("Une nouvelle personne EMPTY !");
        nom = "Noname";
        age = 0;
    }
    
    //Constructeur paramétrer
    public Personne(String inputNom, int inputAge) {
        System.out.println("Une nouvelle personne PAREMETER !");
        nom = inputNom;
        age = inputAge;
    }
    
    //==================================================
    //Accesseur GETTER
    public String getNom() {
        return nom;
    }
    
    public int getAge() {
        return age;
    }
    
    //==================================================
    //Muttatteurs SETTER
    public void setNom(String inputNom) {
        nom = inputNom;
    }
    
    public void setAge(int inputAge) {
        age = inputAge;
    }    
}/*END class Personne*/
