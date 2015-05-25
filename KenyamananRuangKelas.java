package tugas.besar;

import java.util.Scanner;

public class KenyamananRuangKelas extends Proses implements View{

    Scanner in = new Scanner(System.in);
    InventarisBarang goods;
    public void InputKenyamanan() {
        int Kebisingan, Bau, Kebocoran, Kerusakan, Keausan;
        int nyaman = 0;
        int bersih3 = 0;
        System.out.println("Kebisingan : ");
        System.out.println("1. Bising\n2. Tidak Bising");
        Kebisingan = in.nextInt();
        System.out.println("Bau : ");
        System.out.println("1. Bau\n2. Tidak Bau");
        Bau = in.nextInt();
        System.out.println("Kebocoran : ");
        System.out.println("1. Bocor\n2. Tidak Bocor");
        Kebocoran = in.nextInt();
        System.out.println("Kerusakan : ");
        System.out.println("1. Rusak\n2. Tidak Rusak");
        Kerusakan = in.nextInt();
        System.out.println("Keausan : ");
        System.out.println("1. Rusak\n2. Tidak Rusak");
        Keausan = in.nextInt();
        goods = new InventarisBarang(Kebisingan, Bau, Kebocoran, Kerusakan, Keausan, nyaman, bersih3);
    }

    @Override
    public int kebisingan() {

        if (goods.getKebisingan() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

    @Override
    public int bau() {

        if (goods.getBau() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

    @Override
    public int kebocoran() {

        if (goods.getKebocoran() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

    @Override
    public int kerusakan() {

        if (goods.getKerusakan() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

    @Override
    public int keausan() {

        if (goods.getKeausan() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }
    
     public void hasil(int kebisingan,int Bau, int Kebocoran,  int Kerusakan, int Keausan){
        if(kebisingan==1){
        System.out.println("Kebisingan = Bising");
        }
        else{
            System.out.println("Kebisingan = Tidak Bising");
        }
        if(Bau==1){
            System.out.println("Aroma = Wangi");
        }
        else{
            System.out.println("Aroma = Tidak Wangi");
    }
        if(Kebocoran==1){
            System.out.println("Kebocoran = Bocor");
        }
        else{
            System.out.println("Kebocoran = Tidak Bocor");
        }
        if(Kerusakan==1){
            System.out.println("Kerusakan = Rusak");
        }
        else{
            System.out.println("Kerusakan = Tidak Rusak");
        }if(Keausan==1){
            System.out.println("Keausan = Aus");
        }
        else{
            System.out.println("Keausan = Tidak Aus");
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
    public void InputJumlahPosisiKondisi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int JumlahStopKontak, int KondisiStopKontak, int PosisiStopKontak, int JumlahKabelLCD, int KondisiKabelLCD, int PosisiKabelLCD, int JumlahLampu, int KondisiLampu, int PosisiLampu, int JumlahKipasAngin, int KondisiKipasAngin, int PosisiKipasAngin, int JumlahAC, int KondisiAC, int PosisiAC, int JumlahCCTV, int KondisiCCTV, int PosisiCCTV, String SSID, int Bandwidth) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
