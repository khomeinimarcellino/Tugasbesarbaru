
package tugas.besar;

import java.util.Scanner;

public class LingkunganRuangKelas extends InventarisBarang {
   
    Scanner in = new Scanner (System.in);
    protected int bersih;
    protected int bersih2;

    public LingkunganRuangKelas(int KondisiLantai, int KondisiDinding, int KondisiAtap, int KondisiPintu, int KondisiJendela, int bersih3) {
        super(KondisiLantai, KondisiDinding, KondisiAtap, KondisiPintu, KondisiJendela, bersih3);
        System.out.println("Kondisi lantai : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiLantai(in.nextInt(KondisiLantai));
        System.out.println("Kondisi dinding : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiDinding(in.nextInt(KondisiDinding));
        System.out.println("Kondisi atap : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiAtap(in.nextInt(KondisiAtap));
        System.out.println("Kondisi pintu : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiPintu(in.nextInt(KondisiPintu));
        System.out.println("Kondisi jendela : ");
        System.out.println("1. Bersih \n 2. Kotor");
        setKondisiJendela(in.nextInt(KondisiJendela));
        
        bersih = getKondisiLantai()+getKondisiDinding();
        bersih2 = getKondisiAtap()+getKondisiPintu()+getKondisiJendela();
        bersih3 = bersih+bersih2;
    }
    
    @Override
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