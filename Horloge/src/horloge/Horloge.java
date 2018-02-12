/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horloge;

/**
 *
 * @author renob
 */
public class Horloge {
    //Instanaciation des variables
    private int heure;
    private int minute;
    private int seconde;
    
    //Constructeur
    public void Personne(int heure, int minute, int seconde) {
         
    }
    
    //Méthode afficher
    public void afficher(int heure, int minute, int seconde) {
        System.out.println(heure +":"+ minute +":"+ seconde);
    }
    
    //Méthode ajouterSeconde
    public void ajouterSeconde(int heure, int minute, int seconde) {
        seconde++;
        if (seconde == 60) {
            minute++;
            seconde = 0;
        } else if (minute == 60){
            heure++;
            minute = 0;
        } else if (heure == 24) {
            seconde++;
            heure = 0;
        }
    }
    
       
}
