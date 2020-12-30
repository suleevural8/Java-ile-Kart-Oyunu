
package javaapplication11;



import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import javax.swing.ImageIcon;


public class Test extends javax.swing.JFrame{
       
   
     
    public Test() {
        
        initComponents();
       
    }
     


      
       

         static Random random = new Random();

         static ArrayList<VoleybolTakimi> kartListesi1=new ArrayList<VoleybolTakimi>();
         static ArrayList<BasketbolTakimi> kartListesi2=new ArrayList<BasketbolTakimi>();   
         static Kullanıcı oyuncu1 = new Kullanıcı(1,"Kullanıcı", 0);
         static Bilgisayar oyuncu2 = new Bilgisayar(2,"Bilgisayar", 0);
         static ArrayList<VoleybolTakimi> oyuncu1_voleybol_liste2=new ArrayList<VoleybolTakimi>();
         static ArrayList<BasketbolTakimi> oyuncu1_basketbol_liste2=new ArrayList<BasketbolTakimi>();
         static ArrayList<VoleybolTakimi> oyuncu2_voleybol_liste2=new ArrayList<VoleybolTakimi>();
         static ArrayList<BasketbolTakimi> oyuncu2_basketbol_liste2=new ArrayList<BasketbolTakimi>();
         static int tiklanma_sayisi;


        
      VoleybolTakimi Lauren_Gibbemeyer=new VoleybolTakimi("Lauren Gibbemeyer","Voleybol",70,50,60,"/javaapplication11/resimler/1b.png");
   
      VoleybolTakimi Sonja_Newcombe=new VoleybolTakimi("Sonja Newcombe","Voleybol",70,50,60,"/javaapplication11/resimler/2b.png");
      
      VoleybolTakimi  Kım_Yeon_Koung=new VoleybolTakimi("Kım Yeon Koung","Voleybol",40,60,70,"/javaapplication11/resimler/3b.png");
     
      VoleybolTakimi  Ergul_Eroglu=new VoleybolTakimi("Ergul Eroglu","Voleybol",95,80,70,"/javaapplication11/resimler/4b.png");
     
      VoleybolTakimi   Natalia_Pereira=new VoleybolTakimi("Natalia Pereira","Voleybol",50,55,55,"/javaapplication11/resimler/5b.png");
      
      VoleybolTakimi   Merve_Dalbeler=new VoleybolTakimi("Merve Dalbeler","Voleybol",60,20,50,"/javaapplication11/resimler/6b.png");
     
      VoleybolTakimi   Gamze_Kılıc=new VoleybolTakimi("Gamze Kılıc","Voleybol",75,80,40,"/javaapplication11/resimler/7b.png");
     
      VoleybolTakimi   Carlı_Lloyd=new VoleybolTakimi("Carlı Lloyd","Voleybol",40,70,30,"/javaapplication11/resimler/8b.png");
   
      BasketbolTakimi  AC_Reid=new BasketbolTakimi ("A.C Reid","Basketbol",80,65,65,"/javaapplication11/resimler/9b.png");
    
      BasketbolTakimi  Ryan_Kemrite=new BasketbolTakimi("Ryan Kemrite","Basketbol",80,75,60,"/javaapplication11/resimler/10b.png");
    
      BasketbolTakimi  Lovell_Cabbil=new BasketbolTakimi("Lovell Cabbil","Basketbol",30,60,55,"/javaapplication11/resimler/11b.png");
   
      BasketbolTakimi  Hansel_Atencia=new BasketbolTakimi("Hansel Atencia","Basketbol",30,60,55,"/javaapplication11/resimler/12b.png");
  
      BasketbolTakimi  John_Dawson=new BasketbolTakimi("John Dawson","Basketbol",90,80,85,"/javaapplication11/resimler/13b.png");
   
      BasketbolTakimi  Evan_Maxvell=new BasketbolTakimi("Evan Maxvell","Basketbol",60,75,30,"/javaapplication11/resimler/14b.png");

      BasketbolTakimi  Ezra_Talbert=new BasketbolTakimi("Ezra Talbert","Basketbol",50,70,30,"/javaapplication11/resimler/15b.png");
    
      BasketbolTakimi  Calvin_Hoffman=new BasketbolTakimi("Calvin Hoffman","Basketbol",40,55,70,"/javaapplication11/resimler/16b.png");
         
    
    
        
    
    
      
      
      
 
      public void ListeOlustur1(ArrayList<VoleybolTakimi> kartListesi1){
		  kartListesi1.add(new VoleybolTakimi("Lauren Gibbemeyer","Voleybol",70,50,60,"/javaapplication11/resimler/1b.png"));
		  kartListesi1.add(new VoleybolTakimi("Sonja Newcombe","Voleybol",70,50,60,"/javaapplication11/resimler/2b.png"));
		  kartListesi1.add(new VoleybolTakimi("Kım Yeon Koung","Voleybol",40,60,70,"/javaapplication11/resimler/3b.png"));
		  kartListesi1.add(new VoleybolTakimi("Ergul Eroglu","Voleybol",95,80,70,"/javaapplication11/resimler/4b.png"));
		  kartListesi1.add(new VoleybolTakimi("Natalia Pereira","Voleybol",50,55,55,"/javaapplication11/resimler/5b.png"));
		  kartListesi1.add (new VoleybolTakimi("Merve Dalbeler","Voleybol",60,20,50,"/javaapplication11/resimler/6b.png"));
		  kartListesi1.add(new VoleybolTakimi("Gamze Kılıc","Voleybol",75,80,40,"/javaapplication11/resimler/7b.png"));
		  kartListesi1.add(new VoleybolTakimi("Carlı Lloyd","Voleybol",40,70,30,"/javaapplication11/resimler/8b.png"));
                   
      }
                  
                 public void ListeOlustur2(ArrayList<BasketbolTakimi> kartListesi2){    
		  kartListesi2.add(new BasketbolTakimi ("A.C Reid","Basketbol",80,65,65,"/javaapplication11/resimler/9b.png"));
                  kartListesi2.add(new BasketbolTakimi("Ryan Kemrite","Basketbol",80,75,60,"/javaapplication11/resimler/10b.png"));
                  kartListesi2.add(new BasketbolTakimi("Lovell Cabbil","Basketbol",30,60,55,"/javaapplication11/resimler/11b.png"));
                  kartListesi2.add(new BasketbolTakimi("Hansel Atencia","Basketbol",30,60,55,"/javaapplication11/resimler/12b.png"));
                  kartListesi2.add(new BasketbolTakimi("John Dawson","Basketbol",90,80,85,"/javaapplication11/resimler/13b.png"));
                  kartListesi2.add(new BasketbolTakimi("Evan Maxvell","Basketbol",60,75,30,"/javaapplication11/resimler/14b.png"));
                  kartListesi2.add(new BasketbolTakimi("Ezra Talbert","Basketbol",50,70,30,"/javaapplication11/resimler/15b.png"));
                  kartListesi2.add(new BasketbolTakimi("Calvin Hoffman","Basketbol",40,55,70,"/javaapplication11/resimler/16b.png"));}
     
    
       
         
          
   
        public static void KartDagitimi1(Bilgisayar bilgisayar,Kullanıcı kullanici,ArrayList<VoleybolTakimi> voleybolcu,ArrayList<BasketbolTakimi> basketbolcu){
        int ind=7;
        Random r=new Random();
        for (int i = 0; i < 4 ; i++) {
            int ata=r.nextInt(ind);
            kullanici.getKartListesi1().add(voleybolcu.get(ata));
            voleybolcu.remove(ata);
            ind--;
        }
        for (int i = 0; i < 4; i++) {
            bilgisayar.getKartListesi1().add(voleybolcu.get(ind));
            voleybolcu.remove(ind);
            ind--;
        }
        ind=7;
        for (int i = 0; i < 4 ; i++) {
            int ata=r.nextInt(ind);
            kullanici.getKartListesi2().add(basketbolcu.get(ata));
            basketbolcu.remove(ata);
            ind--;
        }
        for (int i = 0; i < 4; i++) {
            bilgisayar.getKartListesi2().add(basketbolcu.get(ind));
            basketbolcu.remove(ind);
            ind--;
        }}

        public void Karsilasma(ArrayList<BasketbolTakimi> oyuncu2_basketbol_liste2,ArrayList<BasketbolTakimi> oyuncu1_basketbol_liste2,ArrayList<VoleybolTakimi> oyuncu2_voleybol_liste2,ArrayList<VoleybolTakimi> oyuncu1_voleybol_liste2,int durum,int indis){
            jLabel16.setVisible(false);
            Random r =new Random();
        int pozisyon=r.nextInt(3);
           BasketbolTakimi oyuncu2_basketbol=oyuncu2_basketbol_liste2.get(indis);
             BasketbolTakimi oyuncu1_basketbol=oyuncu1_basketbol_liste2.get(indis);
             VoleybolTakimi oyuncu2_voleybol=oyuncu2_voleybol_liste2.get(indis);
           VoleybolTakimi oyuncu1_voleybol=oyuncu1_voleybol_liste2.get(indis);
           
        if (durum%2 == 0) {
                oyuncu2_voleybol.sporcuPuaniGöster();
                oyuncu1_voleybol.sporcuPuaniGöster();
            if (pozisyon == 0) {
                    
                    jLabel3.setText("SEÇİLEN POZİSYON SMAÇ");
                if (oyuncu2_voleybol.getSmac() > oyuncu1_voleybol.getSmac()) {
                    jLabel3.setVisible(true);
                      jLabel16.setVisible(true);
                     jLabel18.setVisible(false);
                    oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    
                     oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();
                    System.out.println("İkinci oyuncu smaç:"+oyuncu2_voleybol.getSmac());
                    System.out.println("Birinci oyuncu smaç:"+oyuncu1_voleybol.getSmac());

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                  

                }
                else if (oyuncu2_voleybol.getSmac() < oyuncu1_voleybol.getSmac()) {
                     
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                     jLabel18.setVisible(false);
                    System.out.println("İkinci oyuncu smaç:"+oyuncu2_voleybol.getSmac());
                    System.out.println("Birinci oyuncu smaç:"+oyuncu1_voleybol.getSmac());
                    oyuncu1.setSkor(oyuncu1.getSkor()+10);
                     oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                     oyuncu2_basketbol=null;
                    oyuncu1_basketbol=null;

                }
                 else if (oyuncu2_voleybol.getSmac() == oyuncu1_voleybol.getSmac()) {
                          jLabel18.setVisible(true);
                          jLabel3.setVisible(false);
                          jLabel16.setVisible(false);
                          jLabel18.setText("SEÇİLEN SMAÇ POZİSYON DEĞERLERİ EŞİTTİR.BİR TANE BASKETBOLCU SEÇİNİZ.");
                          
                        
                               
                       
                 }
                
                else{
                 
                }
               
            }
            else if (pozisyon == 1) {
              
                   
                jLabel3.setText("SEÇİLEN POZİSYON MANŞET");
                if (oyuncu2_voleybol.getManset() > oyuncu1_voleybol.getManset()) {
                   
                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                    System.out.println("İkinci oyuncu manşet:"+oyuncu2_voleybol.getManset());
                    System.out.println("Birinci oyuncu manşet:"+oyuncu1_voleybol.getManset());
                    oyuncu2.setSkor(oyuncu2.getSkor()+10);
                     oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                     

                }
                else if (oyuncu2_voleybol.getManset() < oyuncu1_voleybol.getManset()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                       System.out.println("İkinci oyuncu manşet:"+oyuncu2_voleybol.getManset());
                    System.out.println("Birinci oyuncu manşet:"+oyuncu1_voleybol.getManset());

                      oyuncu1.setSkor(oyuncu1.getSkor()+10);
                      oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                     oyuncu2_basketbol=null;
                    oyuncu1_basketbol=null;

                }
                 else if (oyuncu2_voleybol.getManset() == oyuncu1_voleybol.getManset()) {
                          jLabel18.setVisible(true);
                          jLabel3.setVisible(false);
                          jLabel16.setVisible(false);
                          jLabel18.setText("SEÇİLEN MANŞET POZİSYON DEĞERLERİ EŞİTTİR.BİR TANE BASKETBOLCU SEÇİNİZ.");  
                          
               
                       
                 }
            }
            else {

                jLabel3.setText("SEÇİLEN POZİSYON BLOK");
                if (oyuncu2_voleybol.getBlok() > oyuncu1_voleybol.getBlok()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                       System.out.println("İkinci oyuncu blok:"+oyuncu2_voleybol.getBlok());
                    System.out.println("Birinci oyuncu blok:"+oyuncu1_voleybol.getBlok());
                    oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                 

                }
                else if (oyuncu2_voleybol.getBlok() < oyuncu1_voleybol.getBlok()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                      System.out.println("İkinci oyuncu blok:"+oyuncu2_voleybol.getBlok());
                    System.out.println("Birinci oyuncu blok:"+oyuncu1_voleybol.getBlok());
                    oyuncu1.setSkor(oyuncu1.getSkor()+10);
                     oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                     oyuncu2_basketbol=null;
                    oyuncu1_basketbol=null;

                }
                 else if (oyuncu2_voleybol.getBlok() == oyuncu1_voleybol.getBlok()) {
                          jLabel18.setVisible(true);
                          jLabel3.setVisible(false);
                          jLabel16.setVisible(false);
                          jLabel18.setText("SEÇİLEN BLOK POZİSYON DEĞERLERİ EŞİTTİR.BİR TANE BASKETBOLCU SEÇİNİZ.");
                        

                          
                 }
            }
        }
        else{
                oyuncu2_basketbol.sporcuPuaniGöster();
                oyuncu1_basketbol.sporcuPuaniGöster();
            if (pozisyon == 0) {
                
                jLabel3.setText("SEÇİLEN POZİSYON İKİLİK");
                if (oyuncu2_basketbol.getİkilik()>oyuncu1_basketbol.getİkilik()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                      System.out.println("İkinci oyuncu ikilik:"+oyuncu2_basketbol.getİkilik());
                    System.out.println("Birinci oyuncu ikilik:"+oyuncu1_basketbol.getİkilik());
                    oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                   

                }
                else if (oyuncu2_basketbol.getİkilik()<oyuncu1_basketbol.getİkilik()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                    System.out.println("İkinci oyuncu ikilik:"+oyuncu2_basketbol.getİkilik());
                    System.out.println("Birinci oyuncu ikilik:"+oyuncu1_basketbol.getİkilik());
                    oyuncu1.setSkor(oyuncu1.getSkor()+10);
                    oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                     oyuncu2_basketbol=null;
                    oyuncu1_basketbol=null;

                }
                 else if (oyuncu2_basketbol.getİkilik() == oyuncu1_basketbol.getİkilik()) {
                         jLabel18.setVisible(true);
                          jLabel3.setVisible(false);
                          jLabel16.setVisible(false);
                          jLabel18.setText("SEÇİLEN İKİLİK POZİSYON DEĞERLERİ EŞİTTİR.BİR TANE VOLEYBOLCU SEÇİNİZ.");  
                          

                     
                 }
            }
            else if (pozisyon == 1) {
                
                jLabel3.setText("SEÇİLEN POZİSYON ÜÇLÜK");
                if (oyuncu2_basketbol.getÜclük() > oyuncu1_basketbol.getÜclük()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                    System.out.println("İkinci oyuncu üçlük:"+oyuncu2_basketbol.getÜclük());
                    System.out.println("Birinci oyuncu üçlük:"+oyuncu1_basketbol.getÜclük());
                    oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                    

                }
                else if (oyuncu2_basketbol.getÜclük() < oyuncu1_basketbol.getÜclük()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                     System.out.println("İkinci oyuncu üçlük:"+oyuncu2_basketbol.getÜclük());
                    System.out.println("Birinci oyuncu üçlük:"+oyuncu1_basketbol.getÜclük());
                    oyuncu1.setSkor(oyuncu1.getSkor()+10);
                     oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                     oyuncu2_basketbol=null;
                    oyuncu1_basketbol=null;

                }
                else if (oyuncu2_basketbol.getÜclük() == oyuncu1_basketbol.getÜclük()) {
                          jLabel18.setVisible(true);
                          jLabel3.setVisible(false);
                          jLabel16.setVisible(false);
                          jLabel18.setText("SEÇİLEN ÜÇLÜK POZİSYON DEĞERLERİ EŞİTTİR.BİR TANE VOLEYBOLCU SEÇİNİZ.");  
                         

                    
                 }
            }
            else {
      
                jLabel3.setText("SEÇİLEN POZİSYON SERBEST ATIŞ");
                if (oyuncu2_basketbol.getSerbestAtis() >oyuncu1_basketbol.getSerbestAtis()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                     System.out.println("İkinci oyuncu serbest atış:"+oyuncu2_basketbol.getSerbestAtis());
                    System.out.println("Birinci oyuncu serbest atış:"+oyuncu1_basketbol.getSerbestAtis());
                   oyuncu2.setSkor(oyuncu2.getSkor()+10);
                     oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);

                }
                else if (oyuncu2_basketbol.getSerbestAtis() < oyuncu1_basketbol.getSerbestAtis()) {

                    jLabel18.setVisible(false);
                    jLabel3.setVisible(true);
                     jLabel16.setVisible(true);
                     System.out.println("İkinci oyuncu serbest atış:"+oyuncu2_basketbol.getSerbestAtis());
                    System.out.println("Birinci oyuncu serbest atış:"+oyuncu1_basketbol.getSerbestAtis());
                    oyuncu1.setSkor(oyuncu1.getSkor()+10);
                    oyuncu1.SkorGöster();
                     oyuncu2.SkorGöster();

                   System.out.println("\n");
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                     oyuncu2_basketbol=null;
                    oyuncu1_basketbol=null;

                }
                else if (oyuncu2_basketbol.getSerbestAtis() == oyuncu1_basketbol.getSerbestAtis()) {
                    jLabel18.setVisible(true);
                    jLabel3.setVisible(false);
                     jLabel16.setVisible(false);
                    jLabel18.setText("SEÇİLEN SERBEST ATIŞ POZİSYON DEĞERLERİ EŞİTTİR.BİR TANE VOLEYBOLCU SEÇİNİZ.");  
                  

                
                 }
            }
        }
    }
            
      
            
        public void Karsilasma_sonkart(ArrayList<BasketbolTakimi> oyuncu2_basketbol_liste2,ArrayList<BasketbolTakimi> oyuncu1_basketbol_liste2,ArrayList<VoleybolTakimi> oyuncu2_voleybol_liste2,ArrayList<VoleybolTakimi> oyuncu1_voleybol_liste2,int durum,int indis){
             BasketbolTakimi oyuncu2_basketbol=oyuncu2_basketbol_liste2.get(indis);
             BasketbolTakimi oyuncu1_basketbol=oyuncu1_basketbol_liste2.get(indis);
            VoleybolTakimi oyuncu2_voleybol=oyuncu2_voleybol_liste2.get(indis);
             VoleybolTakimi oyuncu1_voleybol=oyuncu1_voleybol_liste2.get(indis);
             jLabel19.setVisible(true);
       

            if(oyuncu2_voleybol.getSmac()==oyuncu1_voleybol.getSmac())//SMAÇ
            {      
                   jLabel18.setVisible(true);
                   jLabel3.setVisible(true);
                  jLabel18.setText("SEÇİLEN SMAÇ POZİSYON DEĞERLERİ EŞİTTİR.YENİ BİR POZİSYON SEÇİLİYOR...");
                  Random r=new Random();
                  int pozisyon3=r.nextInt(2);
                  if(pozisyon3==0){
                       jLabel3.setText("SEÇİLEN POZİSYON MANŞET");
                        
                      if(oyuncu2_voleybol.getManset()==oyuncu1_voleybol.getManset()){
                     if(oyuncu2_voleybol.getBlok()==oyuncu1_voleybol.getBlok()){
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                                jLabel16.setVisible(false);
                        jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN BİLGİSAYAR");}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                                       jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getBlok()<oyuncu1_voleybol.getBlok()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                       jLabel3.setText("SEÇİLEN MANŞET DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON BLOK");
                       
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                             if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                               jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                                       jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getBlok()>oyuncu1_voleybol.getBlok()){
                         oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    jLabel3.setText("SEÇİLEN MANŞET DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON BLOK");
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                            jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          } 
                        
                     }
                }
                      else if(oyuncu2_voleybol.getManset()>oyuncu1_voleybol.getManset()){
                        oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                           if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                             jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }  
                      }
                      else if(oyuncu2_voleybol.getManset()<oyuncu1_voleybol.getManset()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                   
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                         if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          } 
                      }
                  }
                    if(pozisyon3==1){
                        jLabel3.setText("SEÇİLEN POZİSYON BLOK");
                       
                      if(oyuncu2_voleybol.getBlok()==oyuncu1_voleybol.getBlok()){
                     if(oyuncu2_voleybol.getManset()==oyuncu1_voleybol.getManset()){
                        if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                              jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT OYUN BERABERE BİTTİ");
                              jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getManset()<oyuncu1_voleybol.getManset()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                    jLabel3.setText("SEÇİLEN BLOK DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON MANŞET");
                      jLabel16.setVisible(false);
                  
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                            if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                              jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getManset()>oyuncu1_voleybol.getManset()){
                         oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    jLabel3.setText("SEÇİLEN BLOK DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON MANŞET");
                     
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                            jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                        
                     }
                }
                      else if(oyuncu2_voleybol.getBlok()>oyuncu1_voleybol.getBlok()){
                        oyuncu2.setSkor(oyuncu2.getSkor()+10);
                   
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                           if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                             jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          } 
                      }
                      else if(oyuncu2_voleybol.getBlok()<oyuncu1_voleybol.getBlok()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                   
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                         if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          } 
                      }
                  }
               
            }
            if(oyuncu2_voleybol.getManset()==oyuncu1_voleybol.getManset()){
                jLabel18.setVisible(true);
                 jLabel19.setVisible(true);
                   jLabel3.setVisible(true);
                  jLabel18.setText("SEÇİLEN MANŞET POZİSYON DEĞERLERİ EŞİTTİR.YENİ BİR POZİSYON SEÇİLİYOR...");
                  Random r=new Random();
                  int pozisyon3=r.nextInt(2);
                 if(pozisyon3==0){
                       jLabel3.setText("SEÇİLEN POZİSYON SMAÇ");
                     
                      if(oyuncu2_voleybol.getSmac()==oyuncu1_voleybol.getSmac()){
                     if(oyuncu2_voleybol.getBlok()==oyuncu1_voleybol.getBlok()){
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                            jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getBlok()<oyuncu1_voleybol.getBlok()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                       jLabel3.setText("SEÇİLEN SMAÇ DEĞERLERİ EŞİTTİR YENİ SEÇİLEN POZİSYON BLOK");
                      
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                            if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                              jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getBlok()>oyuncu1_voleybol.getBlok()){
                         oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    jLabel3.setText("SEÇİLEN SMAÇ DEĞERLERİ EŞİTTİR YENİ SEÇİLEN POZİSYON BLOK");
                    
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                            jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                        
                     }
                }
                      else if(oyuncu2_voleybol.getSmac()>oyuncu1_voleybol.getSmac()){
                        oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                           if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                             jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                      }
                      else if(oyuncu2_voleybol.getSmac()<oyuncu1_voleybol.getSmac()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                    
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                         if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          } 
                      }
                  }
                    if(pozisyon3==1){
                        jLabel3.setText("SEÇİLEN POZİSYON BLOK");
              
                      if(oyuncu2_voleybol.getBlok()==oyuncu1_voleybol.getBlok()){
                     if(oyuncu2_voleybol.getSmac()==oyuncu1_voleybol.getSmac()){
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                              jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT OYUN BERABERE BİTTİ");
                              jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getSmac()<oyuncu1_voleybol.getSmac()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                    jLabel3.setText("SEÇİLEN BLOK DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON SMAÇ");
                  
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                            if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                              jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getSmac()>oyuncu1_voleybol.getSmac()){
                         oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    jLabel3.setText("SEÇİLEN BLOK DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON SMAÇ");
              
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                            jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          } 
                        
                     }
                }
                      else if(oyuncu2_voleybol.getBlok()>oyuncu1_voleybol.getBlok()){
                        oyuncu2.setSkor(oyuncu2.getSkor()+10);
                   
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                           if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                             jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                      }
                      else if(oyuncu2_voleybol.getBlok()<oyuncu1_voleybol.getBlok()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                      
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                         if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                      }
                  }
                
            }
            if(oyuncu2_voleybol.getBlok()==oyuncu1_voleybol.getBlok()){
                  jLabel18.setVisible(true);
                   jLabel19.setVisible(true);
                   jLabel3.setVisible(true);
                  jLabel18.setText("SEÇİLEN BLOK POZİSYON DEĞERLERİ EŞİTTİR.YENİ BİR POZİSYON SEÇİLİYOR...");
                  Random r=new Random();
                  int pozisyon3=r.nextInt(2);
                 if(pozisyon3==0){
                       jLabel3.setText("SEÇİLEN POZİSYON SMAÇ");
                      
                      if(oyuncu2_voleybol.getSmac()==oyuncu1_voleybol.getSmac()){
                     if(oyuncu2_voleybol.getManset()==oyuncu1_voleybol.getManset()){
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                            jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("TÜM POZİSYONLAR.OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getManset()<oyuncu1_voleybol.getManset()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                       jLabel3.setText("SEÇİLEN SMAÇ DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON MANŞET");
                       
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                             if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                               jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getManset()>oyuncu1_voleybol.getManset()){
                         oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    jLabel3.setText("SEÇİLEN SMAÇ DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON MANŞET");
                    
                  
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                            jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          } 
                        
                     }
                }
                      else if(oyuncu2_voleybol.getSmac()>oyuncu1_voleybol.getSmac()){
                        oyuncu2.setSkor(oyuncu2.getSkor()+10);
                     
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                           if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                             jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                      }
                      else if(oyuncu2_voleybol.getSmac()<oyuncu1_voleybol.getSmac()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                    
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                         if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                      }
                  }
                    if(pozisyon3==1){
                        jLabel3.setText("SEÇİLEN POZİSYON MANŞET");
                    
                      if(oyuncu2_voleybol.getManset()==oyuncu1_voleybol.getManset()){
                     if(oyuncu2_voleybol.getSmac()==oyuncu1_voleybol.getSmac()){
                         if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT.OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                              jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("TÜM POZİSYONLAR EŞİT OYUN BERABERE BİTTİ");
                              jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getSmac()<oyuncu1_voleybol.getSmac()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
                    jLabel3.setText("SEÇİLEN MANŞET DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON SMAÇ");
                   
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                             if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                               jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                     }
                     else if(oyuncu2_voleybol.getSmac()>oyuncu1_voleybol.getSmac()){
                         oyuncu2.setSkor(oyuncu2.getSkor()+10);
                    jLabel3.setText("SEÇİLEN MANŞET DEĞERLERİ DE EŞİTTİR YENİ SEÇİLEN POZİSYON SMAÇ");
                
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                          if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                            jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                        
                     }
                }
                      else if(oyuncu2_voleybol.getManset()>oyuncu1_voleybol.getManset()){
                        oyuncu2.setSkor(oyuncu2.getSkor()+10);
              
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                           if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                             jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                               jLabel16.setVisible(false);
                          }
                      }
                      else if(oyuncu2_voleybol.getManset()<oyuncu1_voleybol.getManset()){
                         oyuncu1.setSkor(oyuncu1.getSkor()+10);
              
                     
                    String str2 = Integer.toString(oyuncu2.getSkor()); 
                    String str1 = Integer.toString(oyuncu1.getSkor());
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
                         if(oyuncu1.getSkor()<oyuncu2.getSkor()){
                        jLabel19.setText("OYUN BİTTİ.KAZANAN BİLGİSAYAR");
                           jLabel16.setVisible(false);}
                          else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
                             jLabel19.setText("OYUN BİTTİ.KAZANAN "+oyuncu1.getOyuncuAdi());
                               jLabel16.setVisible(false);
                         }  
                          else{
                             jLabel19.setText("OYUN BERABERE BİTTİ");
                              jLabel16.setVisible(false);
                          } 
                      }
                  }
                
            }
             
             
             
             
             
        }
        
        
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textField_oyuncuAdi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ArkaPlanResmi = new javax.swing.JLabel();
        jPanel_AcilisEkrani = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_ikinciekran = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 1600, 952));
        setMinimumSize(new java.awt.Dimension(1600, 952));
        setSize(new java.awt.Dimension(1600, 952));
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/kartoyunlogoo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 0, 590, 240);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        jLabel2.setText("KULLANICI ADINI GİRİNİZ:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 410, 340, 60);
        getContentPane().add(textField_oyuncuAdi);
        textField_oyuncuAdi.setBounds(510, 420, 390, 40);

        jButton1.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/MPlayerX-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(920, 410, 50, 50);

        ArkaPlanResmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/Ekran Resmi 2020-11-26 14.36.26.png"))); // NOI18N
        ArkaPlanResmi.setText("jLabel1");
        ArkaPlanResmi.setMaximumSize(new java.awt.Dimension(1600, 965));
        ArkaPlanResmi.setMinimumSize(new java.awt.Dimension(1600, 965));
        getContentPane().add(ArkaPlanResmi);
        ArkaPlanResmi.setBounds(-30, -10, 1590, 980);

        jPanel_AcilisEkrani.setMinimumSize(new java.awt.Dimension(1600, 952));

        javax.swing.GroupLayout jPanel_AcilisEkraniLayout = new javax.swing.GroupLayout(jPanel_AcilisEkrani);
        jPanel_AcilisEkrani.setLayout(jPanel_AcilisEkraniLayout);
        jPanel_AcilisEkraniLayout.setHorizontalGroup(
            jPanel_AcilisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        jPanel_AcilisEkraniLayout.setVerticalGroup(
            jPanel_AcilisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel_AcilisEkrani);
        jPanel_AcilisEkrani.setBounds(-30, -20, 1600, 990);

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(1220, 610, 150, 260);

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(1050, 610, 160, 260);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/v462-n-130-textureidea_1.jpg"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(1080, 330, 160, 260);
        getContentPane().add(jButton4);
        jButton4.setBounds(1080, 330, 160, 260);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/v462-n-130-textureidea_1.jpg"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(10, 330, 160, 260);
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 330, 160, 260);

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(880, 610, 160, 260);

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(710, 610, 160, 260);

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(530, 610, 170, 260);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(360, 610, 160, 260);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(180, 610, 170, 260);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(10, 610, 160, 260);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/voleybolkartarka.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(610, 30, 140, 230);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/basketbolkartarka.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 30, 140, 230);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/basketbolkartarka.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 30, 140, 230);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/voleybolkartarka.png"))); // NOI18N
        jLabel8.setText("jLabel7");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(910, 30, 140, 230);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/basketbolkartarka.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 20, 140, 250);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/basketbolkartarka.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 30, 140, 230);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/voleybolkartarka.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(760, 30, 140, 230);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/voleybolkartarka.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1060, 30, 140, 230);

        jLabel14.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BİLGİSAYAR");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(880, 320, 190, 60);

        jLabel15.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("KULLANICI");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(190, 330, 190, 50);

        jLabel16.setFont(new java.awt.Font("Phosphate", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("İLK KARTI BASKETBOLCU KARTI SEÇİNİZ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(330, 250, 800, 50);

        jLabel17.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(190, 390, 180, 30);

        jLabel18.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(370, 270, 670, 50);

        jLabel3.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 390, 410, 50);

        jLabel1.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(880, 380, 190, 50);

        jLabel19.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(430, 400, 530, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication11/resimler/arkaplan2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1600, 960));
        jLabel5.setMinimumSize(new java.awt.Dimension(1600, 960));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 2520, 960);

        javax.swing.GroupLayout jPanel_ikinciekranLayout = new javax.swing.GroupLayout(jPanel_ikinciekran);
        jPanel_ikinciekran.setLayout(jPanel_ikinciekranLayout);
        jPanel_ikinciekranLayout.setHorizontalGroup(
            jPanel_ikinciekranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1570, Short.MAX_VALUE)
        );
        jPanel_ikinciekranLayout.setVerticalGroup(
            jPanel_ikinciekranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel_ikinciekran);
        jPanel_ikinciekran.setBounds(0, 0, 1570, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         jButton3.setVisible(false);
        
                          jButton4.setVisible(false);
        oyuncu1.setOyuncuAdi(textField_oyuncuAdi.getText());
         jLabel15.setText(oyuncu1.getOyuncuAdi());
         textField_oyuncuAdi.setEnabled(false);
         jPanel_AcilisEkrani.setEnabled(false);
         textField_oyuncuAdi.setVisible(false);
         jButton1.setVisible(false);
         jLabel2.setVisible(false);
         
         jLabel4.setVisible(false);
         jPanel_AcilisEkrani.setVisible(false);
         ArkaPlanResmi.setVisible(false);
         ListeOlustur1(kartListesi1);
         ListeOlustur2(kartListesi2);
         KartDagitimi1(oyuncu2,oyuncu1,kartListesi1,kartListesi2);

          String str2 = Integer.toString(0); 
                    String str1 = Integer.toString(0);
                    jLabel17.setText("SKOR:"+str1);
                    jLabel1.setText("SKOR:"+str2);
         
     for(int i=0;i<4;i++){
         
        oyuncu1_voleybol_liste2.add(oyuncu1.getKartListesi1().get(i));
        
         }
          System.out.println("\n");
         for(int i=0;i<4;i++){
        
         oyuncu1_basketbol_liste2.add(oyuncu1.getKartListesi2().get(i));
        
         }    
            System.out.println("\n");
         for(int i=0;i<4;i++){
         
         oyuncu2_voleybol_liste2.add(oyuncu2.getKartListesi1().get(i));
       
         }
            System.out.println("\n");
         for(int i=0;i<4;i++){
      
         oyuncu2_basketbol_liste2.add(oyuncu2.getKartListesi2().get(i));
     
         }   


    jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi2().get(0).getDosyayolu())));
    
    jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi2().get(1).getDosyayolu())));
 
    jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi2().get(2).getDosyayolu())));
    
    jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi2().get(3).getDosyayolu())));
    
    jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi1().get(0).getDosyayolu())));
   
    jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi1().get(1).getDosyayolu())));
    
    jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi1().get(2).getDosyayolu())));
    
    jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi1().get(3).getDosyayolu())));
    
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
    
    
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
       
        jButton10.setVisible(false);
        jLabel7.setVisible(false);
        jLabel16.setText("SIRADAKİ KARTI VOLEYBOLCU KARTI SEÇİNİZ");
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu2.getKartListesi2().get(0).getDosyayolu())));
    tiklanma_sayisi++;
    
    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi2().get(0).getDosyayolu())));
    Karsilasma(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,1,0);
    
     
    if(tiklanma_sayisi==8){
      
        Karsilasma_sonkart(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,1,0);
  
        if(oyuncu1.getSkor()<oyuncu2.getSkor()){
         System.out.println("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");
        jLabel16.setText("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");}
        else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
        jLabel16.setText("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");
        System.out.println("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");}
        else if(oyuncu1.getSkor()==oyuncu2.getSkor()){
            jLabel16.setText("OYUN BERABERE BİTMİŞTİR.");
            System.out.println("OYUN BERABERE BİTMİŞTİR.");
        }
     }
                  
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);  
        jButton10.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton11.setVisible(false);
      jLabel9.setVisible(false);   
      jLabel16.setText("SIRADAKİ KARTI VOLEYBOLCU KARTI SEÇİNİZ");
     jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu2.getKartListesi2().get(1).getDosyayolu())));     
    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi2().get(1).getDosyayolu())));
    tiklanma_sayisi++;
    Karsilasma(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,3,1);
    
  
    if(tiklanma_sayisi==8){
        
        Karsilasma_sonkart(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,3,1);

        if(oyuncu1.getSkor()<oyuncu2.getSkor()){
         System.out.println("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");
        jLabel16.setText("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");}
        else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
        jLabel16.setText("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");
        System.out.println("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");}
        else if(oyuncu1.getSkor()==oyuncu2.getSkor()){
            jLabel16.setText("OYUN BERABERE BİTMİŞTİR.");
            System.out.println("OYUN BERABERE BİTMİŞTİR.");
        }
     }
    
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton13.setEnabled(false);
          jButton12.setVisible(false);
       
    jLabel6.setVisible(false);    
    jLabel16.setText("SIRADAKİ KARTI VOLEYBOLCU KARTI SEÇİNİZ");
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu2.getKartListesi2().get(2).getDosyayolu())));    
    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi2().get(2).getDosyayolu())));
    tiklanma_sayisi++;
    Karsilasma(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,5,2);
 
    
    if(tiklanma_sayisi==8){
       
        Karsilasma_sonkart(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,5,2);
      
        if(oyuncu1.getSkor()<oyuncu2.getSkor()){
         System.out.println("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");
        jLabel16.setText("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");}
        else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
        jLabel16.setText("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");
        System.out.println("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");}
        else if(oyuncu1.getSkor()==oyuncu2.getSkor()){
            jLabel16.setText("OYUN BERABERE BİTMİŞTİR.");
            System.out.println("OYUN BERABERE BİTMİŞTİR.");
        }
     }
    
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
          jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setVisible(false);
         jLabel10.setVisible(false);
    jLabel16.setText("SIRADAKİ KARTI VOLEYBOLCU KARTI SEÇİNİZ");
    
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu2.getKartListesi2().get(3).getDosyayolu())));     
    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi2().get(3).getDosyayolu())));
    tiklanma_sayisi++;
    Karsilasma(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,7,3);
   
  
    if(tiklanma_sayisi==8){
      
        Karsilasma_sonkart(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,7,3);
  
        if(oyuncu1.getSkor()<oyuncu2.getSkor()){
         System.out.println("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");
        jLabel16.setText("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");}
        else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
        jLabel16.setText("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");
        System.out.println("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");}
        else if(oyuncu1.getSkor()==oyuncu2.getSkor()){
            jLabel16.setText("OYUN BERABERE BİTMİŞTİR.");
            System.out.println("OYUN BERABERE BİTMİŞTİR.");
        }
     }
    
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton14.setVisible(false);
          jLabel11.setVisible(false);
          jLabel16.setText("SIRADAKİ KARTI BASKETBOLCU KARTI SEÇİNİZ");
     jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu2.getKartListesi1().get(0).getDosyayolu())));       
    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi1().get(0).getDosyayolu())));
    tiklanma_sayisi++;
    Karsilasma(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,2,0);
     
     if(tiklanma_sayisi==8){
        Karsilasma_sonkart(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,2,0);
       
      if(oyuncu1.getSkor()<oyuncu2.getSkor()){
         System.out.println("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");
        jLabel16.setText("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");}
        else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
        jLabel16.setText("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");
        System.out.println("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");}
        else if(oyuncu1.getSkor()==oyuncu2.getSkor()){
            jLabel16.setText("OYUN BERABERE BİTMİŞTİR.");
            System.out.println("OYUN BERABERE BİTMİŞTİR.");
        }
     }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton15.setVisible(false);
      jLabel13.setVisible(false);   
    jLabel16.setText("SIRADAKİ KARTI BASKETBOLCU KARTI SEÇİNİZ");
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu2.getKartListesi1().get(1).getDosyayolu()))); 
    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi1().get(1).getDosyayolu())));
    tiklanma_sayisi++;
    Karsilasma(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,4,1);
    
     if(tiklanma_sayisi==8){
        Karsilasma_sonkart(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,4,1);
    
        if(oyuncu1.getSkor()<oyuncu2.getSkor()){
         System.out.println("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");
        jLabel16.setText("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");}
        else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
        jLabel16.setText("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");
        System.out.println("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");}
        else if(oyuncu1.getSkor()==oyuncu2.getSkor()){
            jLabel16.setText("OYUN BERABERE BİTMİŞTİR.");
            System.out.println("OYUN BERABERE BİTMİŞTİR.");
        }
     }

         
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton17.setEnabled(false); 
        jButton16.setVisible(false);
           jLabel8.setVisible(false);
           jLabel16.setText("SIRADAKİ KARTI BASKETBOLCU KARTI SEÇİNİZ");
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu2.getKartListesi1().get(2).getDosyayolu())));  
    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi1().get(2).getDosyayolu())));
    tiklanma_sayisi++;
    Karsilasma(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,6,2);

     if(tiklanma_sayisi==8){
        Karsilasma_sonkart(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,6,2);
 
        if(oyuncu1.getSkor()<oyuncu2.getSkor()){
         System.out.println("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");
        jLabel16.setText("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");}
        else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
        jLabel16.setText("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");
        System.out.println("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");}
        else if(oyuncu1.getSkor()==oyuncu2.getSkor()){
            jLabel16.setText("OYUN BERABERE BİTMİŞTİR.");
            System.out.println("OYUN BERABERE BİTMİŞTİR.");
        }
     }

        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
           jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setVisible(false);
           jLabel12.setVisible(false);
           jLabel16.setText("SIRADAKİ KARTI BASKETBOLCU KARTI SEÇİNİZ");
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu2.getKartListesi1().get(3).getDosyayolu())));      
    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(oyuncu1.getKartListesi1().get(3).getDosyayolu())));
     tiklanma_sayisi++;
    Karsilasma(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,8,3);
   
     
     if(tiklanma_sayisi==8){
        
        Karsilasma_sonkart(oyuncu2_basketbol_liste2,oyuncu1_basketbol_liste2,oyuncu2_voleybol_liste2,oyuncu1_voleybol_liste2,8,3);
        
        if(oyuncu1.getSkor()<oyuncu2.getSkor()){
         System.out.println("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");
        jLabel16.setText("OYUN BİTMİŞTİR.KAZANAN BİLGİSAYAR");}
        else if(oyuncu1.getSkor()>oyuncu2.getSkor()){
        jLabel16.setText("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");
        System.out.println("OYUN BİTMİŞTİR."+oyuncu1.getOyuncuAdi()+" KAZANDI.");}
        else if(oyuncu1.getSkor()==oyuncu2.getSkor()){
            jLabel16.setText("OYUN BERABERE BİTMİŞTİR.");
            System.out.println("OYUN BERABERE BİTMİŞTİR.");
        }
     }
    

        
    }//GEN-LAST:event_jButton17ActionPerformed


    public static void main(String args[]) {
        
        
        

        Test test1=new Test(); 


         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArkaPlanResmi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_AcilisEkrani;
    private javax.swing.JPanel jPanel_ikinciekran;
    private javax.swing.JTextField textField_oyuncuAdi;
    // End of variables declaration//GEN-END:variables

   
    

    
    }

