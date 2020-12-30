/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class Sporcu {
    private String dosyayolu;
    
    private String sporcuIsim;
    private String sporcuTakim;
  
    
    public Sporcu(){
   
    }
     
    public Sporcu(String sporcuIsim,String sporcuTakim,String dosyayolu){
      
        this.sporcuIsim=sporcuIsim;
        this.sporcuTakim=sporcuTakim;
    
        this.dosyayolu=dosyayolu;
             
    }
    
  
  
   
    
    public String getSporcuIsim(){
    return this.sporcuIsim;
    }
    public void setSporcuIsim(String sporcuIsim){
    this.sporcuIsim=sporcuIsim;
    }
    public String getSporcuTakim(){
    return this.sporcuTakim;
    }
    public void setSporcuTakim(String sporcuTakim){
    this.sporcuTakim=sporcuTakim;
    }
    
    public String getDosyayolu(){
    return dosyayolu;
    }
    public void setDosyayolu(String dosyayolu){
    this.dosyayolu=dosyayolu;
    }
    
    
    

    
    
    public void sporcuPuaniGöster(){
     
    }

    
}
