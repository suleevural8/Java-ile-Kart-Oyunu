/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class BasketbolTakimi extends Sporcu{
//    private String dosyayolu;    
    private int ikilik=0;
    private int üclük=0;
    private int serbestAtis=0;
    private String basketbolcuAdi;
    private String basketbolcuTakim;

    private Boolean KartKullanildiMi;
    

    public BasketbolTakimi(){
        super();
    }
    
     public BasketbolTakimi(String basketbolcuAdi,String basketbolcuTakim,int ikilik,int üclük,int serbestAtis,String dosyayolu){
         super(basketbolcuAdi,basketbolcuTakim,dosyayolu);
         this.KartKullanildiMi=false;
         this.ikilik=ikilik;
         this.üclük=üclük;
         this.serbestAtis=serbestAtis;
         
    }

    public Boolean getKartKullanildiMi() {
        return KartKullanildiMi;
    }

    public void setKartKullanildiMi(Boolean KartKullanildiMi) {
        this.KartKullanildiMi = KartKullanildiMi;
    }
    
    
    
    public int getÜclük(){
     return this.üclük;
    }
    public void setÜclük(int üclük){
    this.üclük=üclük;
    }
     public int getİkilik(){
     return this.ikilik;
    }
    public void setİkilik(int ikilik){
    this.ikilik=ikilik;
    }
     public int getSerbestAtis(){
     return this.serbestAtis;
    }
    public void setSerbestAtis(int serbestAtis){
    this.serbestAtis=serbestAtis;
    }
    
    @Override
    public void sporcuPuaniGöster(){
     System.out.println(this.getSporcuIsim()); 
     System.out.println("İkilik: "+this.ikilik+" Üçlük: "+this.üclük+" Serbest Atış: "+this.serbestAtis);
    
    }

   

    
    
   
}
