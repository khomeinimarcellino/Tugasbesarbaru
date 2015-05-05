
package tugas.besar;

import java.util.Scanner;

public class LingkunganRuangKelas extends JumlahPosisiKondisiRuangKelas {
   
    Scanner in = new Scanner (System.in);
    private int bersih3;
    
    public void kondisilingkungan(){
        
        System.out.println("Kondisi lantai : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiLantai(in.nextInt());
        System.out.println("Kondisi dinding : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiDinding(in.nextInt());
        System.out.println("Kondisi atap : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiAtap(in.nextInt());
        System.out.println("Kondisi pintu : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiPintu(in.nextInt());
        System.out.println("Kondisi jendela : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiJendela(in.nextInt());
        
        int bersih = getKondisiLantai()+getKondisiDinding();
        int bersih2 = getKondisiAtap()+getKondisiPintu()+getKondisiJendela();
        bersih3 = bersih+bersih2;
     
    }
    
    public int AnalisisKebersihan(){
        if(bersih3 > 6){
            System.out.println("Tidak Sesuai");
            return bersih3;
        }else{
            System.out.println("Sesuai");
            return bersih3;
        }
    }       
}