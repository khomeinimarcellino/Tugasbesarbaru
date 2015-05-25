
package tugas.besar;

import java.util.Scanner;

public class KondisiRuangKelas extends Proses implements View {
    
    Scanner in = new Scanner(System.in);
    InventarisBarang goods;
   
    public void KondisiRuangKelas() {
        int PanjangRuang;
        int LebarRuang;
        int JumlahKursi;
        int JumlahPintu;
        int JumlahJendela;
        String lengkap = null;
        System.out.println("Panjang Ruangan : ");
        PanjangRuang = (in.nextInt());
        System.out.println("Lebar Ruangan : ");
        LebarRuang = (in.nextInt());
        System.out.println("Jumlah Kursi : ");
        JumlahKursi = (in.nextInt());
        System.out.println("Jumlah Pintu : ");
        JumlahPintu = (in.nextInt());
        System.out.println("Jumlah Jendela : ");
        JumlahJendela = (in.nextInt());
        goods = new InventarisBarang(PanjangRuang, LebarRuang, JumlahKursi, JumlahPintu, JumlahJendela, lengkap);
        HitungLuas();
        BentukKelas();
        Hitungrasio();
        Rasio();
        AnalisisPintu();
        Analisisjendela();
        hasil(goods.getPanjangRuang(), goods.getLebarRuang(), goods.getJumlahKursi(), goods.getJumlahPintu(), goods.getJumlahPintu());
        
        
    }
    
    int HitungLuas(){
  
       return goods.getPanjangRuang()*goods.getLebarRuang();
        
    }
    
    @Override
    int BentukKelas(){
        
        if (goods.getPanjangRuang()== HitungLuas()){
            System.out.println("Sesuai");
           return 0;
        }else{
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    
    double Hitungrasio(){
        
        return HitungLuas()*goods.getJumlahKursi();
        
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
        if(goods.getJumlahJendela()>=2){
            System.out.println("Sesuai");
            return 0;
        }else{
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    
    @Override
    public int AnalisisPintu(){
        if(goods.getJumlahPintu()>=2){
            System.out.println("Sesuai");
            return 0;
        }else{
            System.out.println("Tidak Sesuai");
            return 1; 
        }
    }

    @Override
    public void identitasruang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(String NamaRuang, String LokasiRuang, int Fakultas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int PanjangRuang, int LebarRuang, int JumlahKursi, int JumlahPintu, int JumlahJendela, String lengkap) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputJumlahPosisiKondisi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int JumlahStopKontak, int KondisiStopKontak, int PosisiStopKontak, int JumlahKabelLCD, int KondisiKabelLCD, int PosisiKabelLCD, int JumlahLampu, int KondisiLampu, int PosisiLampu, int JumlahKipasAngin, int KondisiKipasAngin, int PosisiKipasAngin, int JumlahAC, int KondisiAC, int PosisiAC, int JumlahCCTV, int KondisiCCTV, int PosisiCCTV, String SSID, int Bandwidth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputKebersihanRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int SirkulasiUdara, int NilaiPencahayaan, int Kelembaban, int Suhu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputLingkunganKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int KondisiLantai, int KondisiDinding, int KondisiAtap, int KondisiPintu, int KondisiJendela, int bersih3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputKenyamanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int Kebisingan, int Bau, int Kebocoran, int Kerusakan, int Keausan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputKeamanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int kokoh, int kuncipj, int bahaya) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
