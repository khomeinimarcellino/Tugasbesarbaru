
package tugas.besar;

import java.util.Scanner;

public class KondisiRuangKelas extends InventarisBarang {
    
    Scanner in = new Scanner(System.in);
    int luas;

    public KondisiRuangKelas(int PanjangRuang, int LebarRuang, int JumlahKursi, int JumlahPintu, int JumlahJendela) {
        super(PanjangRuang, LebarRuang, JumlahKursi, JumlahPintu, JumlahJendela);
        System.out.println("Panjang Ruangan : ");
        super.setPanjangRuang(PanjangRuang = in.nextInt());
        System.out.println("Lebar Ruangan : ");
        super.setLebarRuang(LebarRuang = in.nextInt());
        System.out.println("Jumlah Kursi : ");
        super.setJumlahKursi(JumlahKursi = in.nextInt());
        System.out.println("Jumlah Pintu : ");
        super.setJumlahPintu(JumlahPintu = in.nextInt());
        System.out.println("Jumlah Jendela : ");
        super.setJumlahJendela(JumlahJendela = in.nextInt());
        
    }
    
    int HitungLuas(){
  
       return super.getPanjangRuang()*super.getLebarRuang();
        
    }
    
    @Override
    public int BentukKelas(){
        
        if (super.getPanjangRuang()== HitungLuas()){
            System.out.println("Sesuai");
            return 0;
        }else{
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    
    double Hitungrasio(){
        
        return HitungLuas()*super.getJumlahKursi();
        
    }
    
    @Override
    public int Rasio(){
    
        if(Hitungrasio() >= 0.5){
            System.out.println("Sesuai");
            return 0;
        }else{
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    
    @Override
    public int Analisisjendela(){
        if(super.getJumlahJendela()>=2){
            System.out.println("Sesuai");
            return 0;
        }else{
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    
    @Override
    public int AnalisisPintu(){
        if(super.getJumlahPintu()>=2){
            System.out.println("Sesuai");
            return 0;
        }else{
            System.out.println("Tidak Sesuai");
            return 1; 
        }
    }
    
    
}
