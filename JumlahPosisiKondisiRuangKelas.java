package tugas.besar;

import java.util.Scanner;

public class JumlahPosisiKondisiRuangKelas extends Proses implements View {

    Scanner in = new Scanner(System.in);
    InventarisBarang goods;

    public void InputJumlahPosisiKondisi(){
        int JumlahStopKontak, KondisiStopKontak, PosisiStopKontak, JumlahKabelLCD, KondisiKabelLCD, PosisiKabelLCD, JumlahLampu, KondisiLampu, PosisiLampu, JumlahKipasAngin, KondisiKipasAngin, PosisiKipasAngin, JumlahAC, KondisiAC, PosisiAC, JumlahCCTV, KondisiCCTV, PosisiCCTV, Bandwidth;
        String  SSID;
        System.out.println("Jumlah Stop kontak/Steker = ");
        JumlahStopKontak = in.nextInt();
        System.out.println("Pilih kondisi Stopkontak/Steker : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi StopKontak/Steker : ");
        
        KondisiStopKontak = in.nextInt();
        System.out.println("Pilih Posisi Stopkontak/Steker : ");
        System.out.println("1.Dipojok Ruang/Dekat Dosen \n 2.Di Samping/Belakang ruang ");
        System.out.println("Posisi StopKontak/Steker : ");
        PosisiStopKontak = in.nextInt();
        System.out.println("Jumlah Kabel LCD = ");
        JumlahKabelLCD = in.nextInt();
        System.out.println("Pilih kondisi Kabel LCD : ");
        System.out.println("1.Berfungsi \n 2.Tidak Berfungsi ");
        System.out.println("Kondisi Kabel LCD : ");
        KondisiKabelLCD = in.nextInt();
        System.out.println("Pilih Posisi Kabel LCD : ");
        System.out.println("1.Dekat Dosen \n 2.Tidak Dekat dosen ");
        System.out.println("Posisi Kabel LCD : ");
        PosisiKabelLCD = in.nextInt();
        System.out.println("Jumlah Lampu = ");
        JumlahLampu = in.nextInt();
        System.out.println("Pilih kondisi Lampu : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi Lampu : ");
        KondisiLampu = in.nextInt();
        System.out.println("Pilih Posisi Lampu : ");
        System.out.println("1.Atap Ruangan \n 2.Tidak Di Atap Ruangan ");
        System.out.println("Posisi Lampu : ");
        PosisiLampu = in.nextInt();
        System.out.println("Jumlah Kipas Angin = ");
        JumlahKipasAngin = in.nextInt();
        System.out.println("Pilih kondisi Kipas Angin : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi Kipas Angin : ");
        KondisiKipasAngin = in.nextInt();
        System.out.println("Pilih Posisi Kipas Angin : ");
        System.out.println("1.Atap Ruangan \n 2.Tidak Di Atap Ruangan ");
        System.out.println("Posisi Kipas Angin : ");
        PosisiKipasAngin = in.nextInt();
        System.out.println("Jumlah AC = ");
        JumlahAC = in.nextInt();
        System.out.println("Pilih kondisi AC : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi AC : ");
        KondisiAC = in.nextInt();
        System.out.println("Pilih Posisi AC : ");
        System.out.println("1.Di Belakang/Samping \n 2.Di Depan");
        System.out.println("Posisi AC : ");
        PosisiAC = in.nextInt();
        System.out.println("Masukkan SSID : ");
        SSID = in.next();
        System.out.println("Bandwidhth : ");
        Bandwidth = in.nextInt();
        System.out.println("Jumlah CCTV = ");
        JumlahCCTV = in.nextInt();
        System.out.println("Pilih kondisi CCTV : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi CCTV : ");
        KondisiCCTV = in.nextInt();
        System.out.println("Pilih Posisi CCTV : ");
        System.out.println("1.Depan/Belakang \n 2. Samping ");
        System.out.println("Posisi CCTV : ");
        PosisiCCTV = in.nextInt();
        goods = new InventarisBarang(JumlahStopKontak, KondisiStopKontak, PosisiStopKontak, JumlahKabelLCD, KondisiKabelLCD, PosisiKabelLCD, JumlahLampu, KondisiLampu, PosisiLampu, JumlahKipasAngin, KondisiKipasAngin, PosisiKipasAngin, JumlahAC, KondisiAC, PosisiAC, JumlahCCTV, KondisiCCTV, PosisiCCTV, SSID, Bandwidth);
    }

    @Override
    public int AnalisisJumlahstopkontak(){
        if (goods.getJumlahStopKontak() >= 4) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override    
    public int Analisiskondisistopkontak() {
        if (goods.getKondisiStopKontak() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    
    @Override
    public int analisisposisistopkontak() {

        if (goods.getPosisiStopKontak() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisLCD() {
        if (goods.getJumlahKabelLCD() >= 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int AnalisiskondisiLCD() {
        if (goods.getKondisiKabelLCD() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisposisiLCD() {
        if (goods.getPosisiKabelLCD() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisLampu() {
        
        if (goods.getJumlahLampu() >= 18) {
            System.out.println("Sesuai");
            return 0;
        } else if (goods.getKondisiLampu() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else if (goods.getPosisiLampu()== 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
        
    }

    @Override
    public int analisisKipasAngin() {
        if (goods.getJumlahKipasAngin() >= 2) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisiskondisikipasangin() {
        if (goods.getKondisiKipasAngin() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisposisikipasangin() {
        if (goods.getPosisiKipasAngin() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisAC() {
        if (goods.getJumlahAC() >= 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int anlisiskondisiAC() {
        if (goods.getKondisiAC() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisposisiAC() {
        if (goods.getPosisiAC() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisInternet() {

        if ("UMM Hotspot".equals(goods.getSSID())) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak sesuai");
            return 1;
        }
    }

    @Override
    public int analisislogin() {
        System.out.print("Apakah bisa login :");
        System.out.println("1. ya \n 2. Tidak");
        int bisa = in.nextInt();
        if (bisa == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisCCTV() {
        if (goods.getJumlahCCTV() >= 2) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int KondisiCCTV() {
        if (goods.getKondisiCCTV() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int posisiCCtv() {
        if (goods.getPosisiCCTV() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
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
    public void hasil(int JumlahStopKontak, int KondisiStopKontak, int PosisiStopKontak, int JumlahKabelLCD, int KondisiKabelLCD, int PosisiKabelLCD, int JumlahLampu, int KondisiLampu, int PosisiLampu, int JumlahKipasAngin, int KondisiKipasAngin, int PosisiKipasAngin, int JumlahAC, int KondisiAC, int PosisiAC, int JumlahCCTV, int KondisiCCTV, int PosisiCCTV, String SSID, int Bandwidth) {
        
        if(KondisiStopKontak==1){
            System.out.println("Stop Kontak = Baik");
        }
        else{
            System.out.println("Stop Kontak = Tidak baik");
        }
        if(PosisiStopKontak==1){
            System.out.println("Posisi Stop Kontak = Dipojok Ruang/Dekat Dosen");
        }
        else{
            System.out.println("Posisi Stop Kontak = Di Samping/Belakang ruang");
        }
        if(KondisiKabelLCD==1){
            System.out.println(" Kondisi Kabel LCD = Berfungsi ");
        }
        else{
            System.out.println("Kondisi Kabel LCD = Tidak Berfungsi");
        }
        if(PosisiKabelLCD==1){
            System.out.println("Posisi Kabel LCD = Dekat Dosen ");
        }
        else{
            System.out.println("Posisi Kabel LCD = Tidak Dekat dosen");
        }
        if(KondisiLampu==1){
            System.out.println("Kondisi Lampu = Baik");
        }
        else{
            System.out.println("Kondisi Lampu = Rusak");
        }
        if(PosisiLampu==1){
            System.out.println("Posisi Lampu = Di Atap Ruangan");
        }
        else{
            System.out.println("Posisi Lampu = Tidak Di Atap Ruangan");
        }
        if(KondisiKipasAngin==1){
            System.out.println("Kondisi Kipas Angin = Baik");
        }
        else{
            System.out.println("Kondisi Kipas Angin = Rusak");
        }
        if(PosisiKipasAngin==1){
            System.out.println("Posisi Kipas Angin = Atap Ruangan ");
        }
        else{
            System.out.println("Posisi Kipas Angin = Tidak Di Atap Ruangan");
        }
        if(KondisiAC==1){
            System.out.println("Kondisi AC = Baik ");
        }
        else{
            System.out.println("Kondisi AC = Rusak ");
    }
        if(PosisiAC==1){
            System.out.println("Posisi AC = Di Belakang/Samping");
        }
        else{
            System.out.println("Posisi AC = Di Depan");
        }
        if(KondisiCCTV==1){
            System.out.println("Kondisi CCTV = Baik ");
        }
        else{
            System.out.println("Kondisi CCTV = Rusak");
        }if(PosisiCCTV==1){
            System.out.println("Posisi CCTV = Depan/Belakang");
        }
        else{
            System.out.println("Posisi CCTV = Samping");
        }
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
