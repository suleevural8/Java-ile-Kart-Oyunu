
package javaapplication11;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class VoleybolTakimi extends Sporcu {
        
    private int smaç=0;
    private int manşet=0;
    private int blok=0;
    private String voleybolcuAdi;
    private String voleybolcuTakim;
    Boolean KartKullanildiMi;
//    private String dosyayolu;
    
    public VoleybolTakimi(){
        super();
    }
    
     public VoleybolTakimi(String voleybolcuAdi,String voleybolcuTakim,int smaç,int manşet,int blok,String dosyayolu){
        super(voleybolcuAdi,voleybolcuTakim,dosyayolu);
        this.smaç=smaç;
        this.blok=blok;
        this.manşet=manşet;
        this.KartKullanildiMi=false;
     
    }

    public Boolean getKartKullanildiMi() {
        return KartKullanildiMi;
    }

    public void setKartKullanildiMi(Boolean KartKullanildiMi) {
        this.KartKullanildiMi = KartKullanildiMi;
    }
   
    
     
     
    public int getSmac(){
     return this.smaç;
    }
    public void setSmac(int smaç){
    this.smaç=smaç;
    }
     public int getManset(){
     return this.manşet;
    }
    public void setManset(int manşet){
    this.manşet=manşet;
    }
     public int getBlok(){
     return this.blok;
    }
    public void setBlok(int blok){
    this.blok=blok;
    }
    
    @Override
    public void sporcuPuaniGöster(){
    System.out.println(this.getSporcuIsim());     
    System.out.println("Smaç: "+this.smaç+" Manşet: "+this.manşet+" Blok: "+this.blok);
    
    }

    

    

    
    
   
    
}
