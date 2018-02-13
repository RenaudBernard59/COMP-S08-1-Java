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
    static private int ageMini = 0;
    static private int ageMaxi = 0;
    
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
    public String getNom() {return nom;}
    public int getAge() {return age;}
    public static int getAgeMini() {return ageMini;}
    public static int getAgeMaxi() {return ageMaxi;}
    
    //==================================================
    //Muttatteurs SETTER
    public void setNom(String inputNom) {nom = inputNom;}
    public void setAge(int inputAge) {
        age = inputAge;
        //MAJ ageMaxi
        if (age > Personne.ageMaxi) {
            Personne.ageMaxi = age;
        }
        //MAJ ageMini
        if (Personne.ageMini == 0) {
            Personne.ageMini = age;
        }
        if (age < Personne.ageMini) {
            Personne.ageMini = age;
        }
    }
    
    
    
    
    
    
    
}/*END class Personne*/
