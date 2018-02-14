/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import com.sun.xml.internal.ws.message.stream.StreamAttachment;
import java.math.BigInteger;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renob
 */
public class ListTest {
    
    @Test
    public void addAvecIndiceOK() {
        ArrayList<Integer> nombresPremiers = new ArrayList();
        nombresPremiers.add(2);
        nombresPremiers.add(5);
        nombresPremiers.add(1, 3);
        
        for(int nbp : nombresPremiers) {
            System.out.println(nbp);
        }
    }/*END addAvecIndiceOK*/
    
    
    
    @Test
    public void addOK() {
        ArrayList<String> capitales = new ArrayList<>();
        
        capitales.add("Paris");
        capitales.add("Madrid");
        capitales.add("Rome");
                
        for(String cap : capitales) {
            System.out.println(cap);
        }
            
    }/*END addOK*/
       
    @Test
    public void creerNombresPremiers() {
        ArrayList<Integer> nbList = new ArrayList<>();
        for (int i=2;i <= 100;i++){
            boolean premier = true;
            for (int j=2; j<i;j++) {
                if (i%j ==0) {
                    //NON premier
                    premier = false;
                }
            }
            if (premier == true) {
                nbList.add(i);
            }
        }/*END For i*/
        System.out.println(nbList);
    }/*END creerNombresPremiers*/
  
    @Test
    public void factorielle() {
        int j = 100;
        int facto = 1;
        for (int i = 1;i <= j;i++) {
            facto = facto * i ;
        }
        System.out.println("Facto = " +facto);
    }/*END factorielle*/
    
        @Test
    public void calculBigFacto() {
        int j = 50;
        String strJ = Integer.toString(j);
        BigInteger bigFacto = new BigInteger(strJ);
        for (int i = 1;i <= j;i++) {
            String strI = Integer.toString(i);
            BigInteger bgI = new BigInteger(strI);
            bigFacto = bigFacto.add(bgI);

        }/*END For*/
        System.out.println("BigFacto = " +bigFacto);
    }/*END calculBigFacto*/
          
    
    
    
    
}/*END ListTest*/
