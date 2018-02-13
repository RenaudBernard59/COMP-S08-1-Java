package atelierjava;
 
public class LaFermeMain {
    public static void main(String[] args) {
         
        Fermier farmer1 = new Fermier();
        farmer1.setNom("Robert");
        farmer1.setPrenom("Regis");
        farmer1.setSpecialite("Planter des choux");
        System.out.println(farmer1);
    }
}