/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compethance.horloge;

/**
 * @author Formation
 */
public class Horloge {

    private int heure;
    private int minute;
    private int seconde;

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {

        this.heure = heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconde() {
        return seconde;
    }

    public void setSeconde(int seconde) {
        this.seconde = seconde;
    }

    /**
     * Incrémente l'objet Hologe actuel (this)
     * d'une seconde.
     * ! Aux cas particuliers
     */
    public void ajouterSeconde(){
        
        
        // Incrémente les secondes
        this.seconde ++;// équivalent à this.seconde = this.seconde + 1;
        
        // Si les secondes dépassent 59
        // => Reset les secondes et incrémente les minutes
        if( this.seconde>59 ){
            this.minute++;
            this.seconde=0;
        }
        
        // Si les minutes dépassent 59
        // => Reset les minutes et incrémente les heures
        if( this.minute>59 ){
            this.minute=0;
            this.heure++;
        }
        
        // Même principe ; )
        if( this.heure>23 ){
            this.heure=0;
        }
    }
    
    void afficher() {

        System.out.println(String.format("%02d:%02d:%02d", heure, 
                this.minute, this.seconde));
    }
}
