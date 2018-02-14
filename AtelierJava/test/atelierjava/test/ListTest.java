/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import com.sun.xml.internal.ws.message.stream.StreamAttachment;
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
        int i = 2;
        while (i <= 50){
         
            
        }/*END While i*/
        System.out.println(nbList);
    }/*END creerNombresPremiers*/
  
    
}/*END ListTest*/
