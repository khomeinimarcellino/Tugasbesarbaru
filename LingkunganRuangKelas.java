
package tugas.besar;

import java.util.Scanner;

public class LingkunganRuangKelas extends Proses implements View {
   
    Scanner in = new Scanner (System.in);
    InventarisBarang goods;

    public void InputLingkunganRuangKelas() {
        int KondisiLantai,KondisiDinding,KondisiAtap,KondisiPintu,KondisiJendela,bersih3 = 0;
        System.out.println("Kondisi lantai : ");
        System.out.println("1. Bersih \n 2. Kotor");
        KondisiLantai = in.nextInt();
        System.out.println("Kondisi dinding : ");
        System.out.println("1. Bersih \n 2. Kotor");
        KondisiDinding = in.nextInt();
        System.out.println("Kondisi atap : ");
        System.out.println("1. Bersih \n 2. Kotor");
        KondisiAtap = in.nextInt();
        System.out.println("Kondisi pintu : ");
        System.out.println("1. Bersih \n 2. Kotor");
        KondisiPintu = in.nextInt();
        System.out.println("Kondisi jendela : ");
        System.out.println("1. Bersih \n 2. Kotor");
        KondisiJendela = in.nextInt();
        goods = new InventarisBarang(KondisiLantai,KondisiDinding,KondisiAtap,KondisiPintu,KondisiJendela,bersih3 = 0);
                
        int bersih = goods.getKondisiLantai()+ goods.getKondisiDinding();
        int bersih2 = goods.getKondisiAtap()+ goods.getKondisiPintu()+ goods.getKondisiJendela();
        bersih3 = bersih+bersih2;
        
    }
    
    @Override
    public int AnalisisKebersihan(){
        if(goods.bersih3> 6){
            System.out.println("Tidak Sesuai");
            return 1;
        }else{
            System.out.println("Sesuai");
            return 0;
        }
    }       

    @Override
    public void InputKeamanan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int kokoh, int kuncipj, int bahaya) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputKenyamanan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int Kebisingan, int Bau, int Kebocoran, int Kerusakan, int Keausan) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputJumlahPosisiKondisi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int JumlahStopKontak, int KondisiStopKontak, int PosisiStopKontak, int JumlahKabelLCD, int KondisiKabelLCD, int PosisiKabelLCD, int JumlahLampu, int KondisiLampu, int PosisiLampu, int JumlahKipasAngin, int KondisiKipasAngin, int PosisiKipasAngin, int JumlahAC, int KondisiAC, int PosisiAC, int JumlahCCTV, int KondisiCCTV, int PosisiCCTV, String SSID, int Bandwidth) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputKebersihanRuangKelas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int SirkulasiUdara, int NilaiPencahayaan, int Kelembaban, int Suhu) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputLingkunganKelas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int KondisiLantai, int KondisiDinding, int KondisiAtap, int KondisiPintu, int KondisiJendela, int bersih3) {
           if(KondisiLantai==1){
            System.out.println("Kondisi Lantai = Bersih ");
        }
        else{
            System.out.println("Kondisi Lantai  = Kotor");
        }
        if(KondisiDinding==1){
            System.out.println("Kondisi Dinding = Bersih ");
        }
        else{
            System.out.println("Kondisi Dinding = Kotor ");
    }
        if(KondisiAtap==1){
            System.out.println("Kondisi Atap = Bersih");
        }
        else{
            System.out.println("Kondisi Atap = Kotor");
        }
        if(KondisiPintu==1){
            System.out.println("Kondisi Pintu = Bersih ");
        }
        else{
            System.out.println("Kondisi Pintu = Kotor");
        }if(KondisiJendela==1){
            System.out.println("Kondisi Jendela = Bersih");
        }
        else{
            System.out.println("Kondisi Jendela = Kotor");
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
    public void KondisiRuangKelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int PanjangRuang, int LebarRuang, int JumlahKursi, int JumlahPintu, int JumlahJendela, String lengkap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}