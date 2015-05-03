
package tugas.besar;

import java.util.Scanner;

public class KondisiRuangKelas {
    
    Scanner in = new Scanner(System.in);
    InventarisBarang data = new InventarisBarang();
    int luas;
    
    public void input(){
        System.out.println("Panjang Ruangan : ");
        data.setPanjangRuang(in.nextInt());
        System.out.println("Lebar Ruangan : ");
        data.setLebarRuang(in.nextInt());
        System.out.println("Jumlah Kursi : ");
        data.setJumlahKursi(in.nextInt());
        System.out.println("Jumlah Pintu : ");
        data.setJumlahPintu(in.nextInt());
        System.out.println("Jumlah Jendela : ");
        data.setJumlahJendela(in.nextInt());
        
    }
    
    int HitungLuas(){
  
       return data.getPanjangRuang()*data.getLebarRuang();
        
    }
    
    public void BentukKelas(){
        
        if (data.getPanjangRuang()== HitungLuas()){
            System.out.println("Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
    }
    
    double Hitungrasio(){
        
        return HitungLuas()*data.getJumlahKursi();
        
    }
    
    public void Rasio(){
    
        if(Hitungrasio() >= 0.5){
            System.out.println("Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
    }
    public void Analisispintudanjendela(){
        if(data.getJumlahPintu()>=2){
            System.out.println("Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
    }
    
    public void listinputan(){
        System.out.println(data.getPanjangRuang());
        System.out.println(data.getLebarRuang());
        System.out.println(HitungLuas());
        System.out.println(data.getJumlahKursi());
        System.out.println(Hitungrasio());
        System.out.println(data.getJumlahPintu());
        System.out.println(data.getJumlahJendela());
        
    }
}
