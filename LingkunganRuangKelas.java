
package tugas.besar;

import java.util.Scanner;

public class LingkunganRuangKelas {
   
    InventarisBarang data = new InventarisBarang();
    Scanner in = new Scanner (System.in);
    private int bersih3;
    
    public void kondisilingkungan(){
        
        System.out.println("Kondisi lantai : ");
        System.out.println("1. Bersih \n 2. Kotor");
        data.setKondisiLantai(in.nextInt());
        System.out.println("Kondisi dinding : ");
        System.out.println("1. Bersih \n 2. Kotor");
        data.setKondisiDinding(in.nextInt());
        System.out.println("Kondisi atap : ");
        System.out.println("1. Bersih \n 2. Kotor");
        data.setKondisiAtap(in.nextInt());
        System.out.println("Kondisi pintu : ");
        System.out.println("1. Bersih \n 2. Kotor");
        data.setKondisiPintu(in.nextInt());
        System.out.println("Kondisi jendela : ");
        System.out.println("1. Bersih \n 2. Kotor");
        data.setKondisiJendela(in.nextInt());
        
        int bersih = data.getKondisiLantai()+data.getKondisiDinding();
        int bersih2 = data.getKondisiAtap()+data.getKondisiPintu()+data.getKondisiJendela();
        bersih3 = bersih+bersih2;
     
    }
    
    public void AnalisisKebersihan(){
        if(bersih3 > 6){
            System.out.println("Tidak Sesuai");
        }else{
            System.out.println("Sesuai");
        }
    }       
}