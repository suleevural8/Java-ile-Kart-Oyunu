/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.ArrayList;

/**
 *
 * @author sulevural
 */
public class Oyuncu {
     
    private int oyuncuID;
    private String oyuncuAdi;
    private int Skor;
    private ArrayList<VoleybolTakimi> kartListesi1;
    private ArrayList<BasketbolTakimi> kartListesi2;

    public Oyuncu(){
    
    }
    public Oyuncu(int oyuncuID,String oyuncuAdi,int Skor){
    this.oyuncuID=oyuncuID;
    this.oyuncuAdi=oyuncuAdi;
    this.Skor=Skor;
    this.kartListesi1 = new ArrayList<VoleybolTakimi>();
    this.kartListesi2 = new ArrayList<BasketbolTakimi>();
    }
    
    public int getOyuncuID(){
    return oyuncuID;
    }
    public void setOyuncuID(int oyuncuID){
    this.oyuncuID=oyuncuID;
    }
    public String getOyuncuAdi(){
    return oyuncuAdi;
    }
     public void setOyuncuAdi(String oyuncuAdi){
    this.oyuncuAdi=oyuncuAdi;
    }

    public int getSkor(){
    return this.Skor;
    }
     public void setSkor(int Skor){
    this.Skor=Skor;
    }
    public void SkorGöster(){
      System.out.println(this.oyuncuAdi+" Skor: "+this.Skor);
    }



    public ArrayList<VoleybolTakimi> getKartListesi1() {
        return kartListesi1;
    }

    public void setKartListesi1(ArrayList<VoleybolTakimi> kartListesi1) {
        this.kartListesi1 = kartListesi1;
    }

    public ArrayList<BasketbolTakimi> getKartListesi2() {
        return kartListesi2;
    }

    public void setKartListesi2(ArrayList<BasketbolTakimi> kartListesi2) {
        this.kartListesi2 = kartListesi2;
    }
      public String kartSec(int durum){;
      String a = null;
      return a;}
  }
  

      
   
   
    

