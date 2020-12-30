/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.awt.Graphics;
import java.util.ArrayList;



public class Bilgisayar extends Oyuncu {
    

   
     
     
      
     public Bilgisayar() {
         
          
    }
     public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor){
    super(oyuncuID , oyuncuAdi , skor);
  }

        @Override
       public String kartSec(int durum){
           
       
        if(durum%2==1){
       int secilenKart = Test.random.nextInt(getKartListesi2().size());
        String a=Test.oyuncu2.getKartListesi2().get(secilenKart).getDosyayolu();
       
        getKartListesi2().remove(secilenKart);
        
        return a;
        
       
       }
      
       else{
        int secilenKart = Test.random.nextInt(getKartListesi1().size());
        String a=Test.oyuncu2.getKartListesi1().get(secilenKart).getDosyayolu();
        
        getKartListesi1().remove(secilenKart);
        return a;
      }
            } 

     
    }
  
