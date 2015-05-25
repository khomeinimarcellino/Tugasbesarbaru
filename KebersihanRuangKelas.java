package tugas.besar;

import java.util.Scanner;

public class KebersihanRuangKelas extends Proses implements View {

    Scanner in = new Scanner(System.in);
    InventarisBarang goods;

    public void InputKebersihanRuangKelas() {
        int SirkulasiUdara, NilaiPencahayaan, Kelembaban, Suhu;
        System.out.println("Sirkulasi Udara : ");
        SirkulasiUdara = in.nextInt();
        System.out.println("Apakah sirkulasi udara lancar");
        System.out.println("1. ya \n2. Tidak ");
        NilaiPencahayaan = in.nextInt();
        System.out.println("Nilai Pencahayaan : ");
        NilaiPencahayaan = in.nextInt();
        System.out.println("Kelembapan : ");
        Kelembaban = in.nextInt();
        System.out.println("Suhu (celcius) : ");
        Suhu = in.nextInt();
        goods = new InventarisBarang(SirkulasiUdara, NilaiPencahayaan, Kelembaban, Suhu);
    }

    @Override
    public int Sirkulasiudara(){

        if (goods.getSirkulasiUdara() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int pencahayaan() {
        

        if (goods.getNilaiPencahayaan() >= 250) {
            if (goods.getNilaiPencahayaan() <= 350) {
                System.out.println("Sesuai");
                return 0;
            } else {
                System.out.println("Tidak Sesuai");
                return 1;
            }
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int kelembaban() {
        
        if (goods.getKelembaban() >= 70) {
            if (goods.getKelembaban() <= 80) {
                System.out.println("Sesuai");
                return 0;
            } else {
                System.out.println("Tidak Sesuai");
                return 1;
            }
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int suhu() {
        

        if (goods.getSuhu() >= 25) {
            if (goods.getSuhu() <= 35) {
                System.out.println("Sesuai");
                return 0;
            } else {
                System.out.println("Tidak Sesuai");
                return 1;
            }
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
    public void InputJumlahPosisiKondisi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int JumlahStopKontak, int KondisiStopKontak, int PosisiStopKontak, int JumlahKabelLCD, int KondisiKabelLCD, int PosisiKabelLCD, int JumlahLampu, int KondisiLampu, int PosisiLampu, int JumlahKipasAngin, int KondisiKipasAngin, int PosisiKipasAngin, int JumlahAC, int KondisiAC, int PosisiAC, int JumlahCCTV, int KondisiCCTV, int PosisiCCTV, String SSID, int Bandwidth) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int SirkulasiUdara, int NilaiPencahayaan, int Kelembaban, int Suhu) {
    if(SirkulasiUdara==1){
            System.out.println("Sirkulasi Udara = Lancar");
        }
        else{
            System.out.println("Sirkulasi Udara = Tidak Lancar");
        }
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
