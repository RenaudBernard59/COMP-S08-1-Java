package atelierjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renob
 */
public class Fermier {
    private String nom;
    private String prenom;
    private String specialite;
    
    
    //Constructeur
    public Fermier() {
    //Coucou
    }
    
    //Getter
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpecialite() {
        return specialite;
    }
    
    //Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    
    
    
    //Méthodes

    @Override
    public String toString() {
        return "Le fermier se nommant " + this.getPrenom() + " " + this.getNom() + " a comme spécialité : " + this.getSpecialite() + ".\n";
    }


}
