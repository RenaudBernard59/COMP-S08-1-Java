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
public class PersoMain {
     public static void main(String[] args) {
         
         Personne perso1 = new Personne("Jean", 23);
         Personne perso2 = new Personne("Pierre", 42);
         Personne perso3 = new Personne("Paul", 12);
         Personne perso4 = new Personne();
         
         Personne perso5 = new Personne();
         Personne perso6 = new Personne();
         perso5.setNom("Obama");
         perso5.setAge(56);
         perso6.setNom("Bébé");
         perso6.setAge(3);
         
         
         System.out.println(
          "START\n" +
         "| Nom : "+perso1.getNom()+" | Age : "+perso1.getAge()+" ans |\n" +
         "| Nom : "+perso2.getNom()+" | Age : "+perso2.getAge()+" ans |\n" +
         "| Nom : "+perso3.getNom()+" | Age : "+perso3.getAge()+" ans |\n" +
         "| Nom : "+perso4.getNom()+" | Age : "+perso3.getAge()+" ans |\n" +
         "| Nom : "+perso5.getNom()+" | Age : "+perso5.getAge()+" ans |\n" +
         "| Nom : "+perso6.getNom()+" | Age : "+perso6.getAge()+" ans |\n" +
         "| Age Mini : "+Personne.getAgeMini()+" ans | Age Maxi : "+Personne.getAgeMaxi()+" ans |\n" +
          "END"
         );
     }/*END mainObject*/
}
