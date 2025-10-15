/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User-18
 */
public class Chamelia_Q_N_M_241101033 {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) {
        // TODO code application logic here
        
        penjumlahan jumlah = new penjumlahan (5,10);
        pengurangan kurang = new pengurangan (10,5);
        perkalian   dikali = new perkalian   (5,10);
        pembagian   dibagi = new pembagian   (10,5);
        sisa_bagi   modulus = new sisa_bagi  (10,4);
        Kuadrat     kuadrat = new Kuadrat       (5);
        Pengakaran  akar    = new Pengakaran    (25);
    }
    
    private static class penjumlahan {
    
        public penjumlahan (int a, int b ){ 
            System.out.println("Hasil dari penjumlahan = ");
            
            int c ;
            c = a+b;
            System.out.println(c);
        }
    }
    
    private static class pengurangan {
        public pengurangan (int a, int b){
            System.out.println("Hasil dari pengurangan = ");
            
            int d ;
            d = a-b ;
            System.out.println(d);
        }
    
    }
    
    private static class perkalian {
        public perkalian (int a, int b){
            System.out.println("Hasil dari perkalian = ");
            
            int e ;
            e = a*b ;
            System.out.println(e);
        }
    
    }
    
     private static class pembagian {
        public pembagian (int a, int b){
            System.out.println("Hasil dari pembagian = ");
            
            int f ;
            f = a/b ;
            System.out.println(f);
        }
    
    }
     
      private static class sisa_bagi {
        public sisa_bagi (int a, int b){
            System.out.println("Hasil dari Modulus = ");
            
            int g ;
            g = a%b ;
            System.out.println(g);
        }
    
    }
      
       private static class Kuadrat {
        public Kuadrat (int a){
            System.out.println("Hasil dari kuadrat = ");
            
            int h ;
            h = a*a;
            System.out.println(h);
        }
    
    }
       
          private static class Pengakaran {
        public Pengakaran (int a){
            System.out.println("Hasil dari Akar = " );
            
           double i = Math.sqrt(a);
            System.out.println(i);
        }
    
    }
}

    