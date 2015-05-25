package tugas.besar;

import java.util.Scanner;

public class KeamananRuangKelas extends Proses implements View{

    Scanner in = new Scanner(System.in);
    InventarisBarang goods;
    public void InputKeamanan() {
        int Kekokohan; int KunciPintuJendela; int Bahaya;
        System.out.println("Kekokohan: ");
        System.out.println("1. Kokoh\n2. Tidak Kokoh");
        Kekokohan = in.nextInt();
        System.out.println("Kunci pintu dan jendela : ");
        System.out.println("1. Ada\n2. Tidak Ada");
        KunciPintuJendela = in.nextInt();
        System.out.println("Bahaya : ");
        System.out.println("1. Aman\n2. Tidak Aman");
        Bahaya = in.nextInt();
        goods = new InventarisBarang(Kekokohan,KunciPintuJendela,Bahaya);
        kekokohan();
        kuncipintujendela();
        bahaya();
        hasil(goods.getKekokohan(),goods.getKunciPintuJendela(),goods.getBahaya());
    }

    @Override
    public int kekokohan() {

        if (goods.getKekokohan() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int kuncipintujendela() {

        if (goods.getKunciPintuJendela() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int bahaya() {

        if (goods.getBahaya() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    public void hasil(int kokoh,int kuncipj,int bahaya){
        if(kokoh==1){
        System.out.println("Kekokohan = Kokoh");
        }
        else{
            System.out.println("Kekokohan = Rapuh");
        }
        if(kuncipj==1){
            System.out.println("Kunci Pintu Jendela = Terkunci");
        }
        else{
            System.out.println("Kunci Pintu Jendela = Tidak Terkunci");
    }
        if(bahaya==1){
            System.out.println("Keamanan = Aman");
        }
        else{
            System.out.println("Keamanan = Tidak Aman");
        }
    }

    @Override
    public void InputKenyamanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int Kebisingan, int Bau, int Kebocoran, int Kerusakan, int Keausan) {
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
