package tugas.besar;

import java.util.Scanner;

public class JumlahPosisiKondisiRuangKelas extends InventarisBarang {

    Scanner in = new Scanner(System.in);
    protected int JumlahStopKontak;

    public JumlahPosisiKondisiRuangKelas(int JumlahStopKontak,int KondisiStopKontak,int PosisiStopKontak,int JumlahKabelLCD,int KondisiKabelLCD,int PosisiKabelLCD,int JumlahLampu,int KondisiLampu,int PosisiLampu,int JumlahKipasAngin,int KondisiKipasAngin,int PosisiKipasAngin,int JumlahAC,int KondisiAC,int PosisiAC,int JumlahCCTV,int KondisiCCTV,int PosisiCCTV,String SSID, int Bandwidth){
        super(JumlahStopKontak, KondisiStopKontak, PosisiStopKontak, JumlahKabelLCD, KondisiKabelLCD, PosisiKabelLCD, JumlahLampu, KondisiLampu, PosisiLampu, JumlahKipasAngin, KondisiKipasAngin, PosisiKipasAngin, JumlahAC, KondisiAC, PosisiAC, JumlahCCTV, KondisiCCTV, PosisiCCTV, SSID, Bandwidth);
        System.out.println("Jumlah Stop kontak/Steker = ");
        setJumlahStopKontak(in.nextInt(JumlahStopKontak));
        System.out.println("Pilih kondisi Stopkontak/Steker : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi StopKontak/Steker : ");
        setKondisiStopKontak(in.nextInt());
        System.out.println("Pilih Posisi Stopkontak/Steker : ");
        System.out.println("1.Dipojok Ruang/Dekat Dosen \n 2.Di Samping/Belakang ruang ");
        System.out.println("Posisi StopKontak/Steker : ");
        setPosisiStopKontak(in.nextInt());
        System.out.println("Jumlah Kabel LCD = ");
        setJumlahKabelLCD(in.nextInt(JumlahKabelLCD));
        System.out.println("Pilih kondisi Kabel LCD : ");
        System.out.println("1.Berfungsi \n 2.Tidak Berfungsi ");
        System.out.println("Kondisi Kabel LCD : ");
        setKondisiKabelLCD(in.nextInt());
        System.out.println("Pilih Posisi Kabel LCD : ");
        System.out.println("1.Dekat Dosen \n 2.Tidak Dekat dosen ");
        System.out.println("Posisi Kabel LCD : ");
        setPosisiKabelLCD(in.nextInt());
        System.out.println("Jumlah Lampu = ");
        setJumlahLampu(in.nextInt(JumlahLampu));
        System.out.println("Pilih kondisi Lampu : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi Lampu : ");
        setKondisiLampu(in.nextInt());
        System.out.println("Pilih Posisi Lampu : ");
        System.out.println("1.Atap Ruangan \n 2.Tidak Di Atap Ruangan ");
        System.out.println("Posisi Lampu : ");
        setPosisiLampu(in.nextInt());
        System.out.println("Jumlah Kipas Angin = ");
        setJumlahKipasAngin(in.nextInt(JumlahKipasAngin));
        System.out.println("Pilih kondisi Kipas Angin : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi Kipas Angin : ");
        setKondisiKipasAngin(in.nextInt());
        System.out.println("Pilih Posisi Kipas Angin : ");
        System.out.println("1.Atap Ruangan \n 2.Tidak Di Atap Ruangan ");
        System.out.println("Posisi Kipas Angin : ");
        setPosisiKipasAngin(in.nextInt());
        System.out.println("Jumlah AC = ");
        setJumlahAC(in.nextInt(JumlahAC));
        System.out.println("Pilih kondisi AC : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi AC : ");
        setKondisiAC(in.nextInt());
        System.out.println("Pilih Posisi AC : ");
        System.out.println("1.Di Belakang/Samping \n 2.Di Depan");
        System.out.println("Posisi AC : ");
        setPosisiAC(in.nextInt());
        System.out.println("Masukkan SSID : ");
        setSSID(in.next(SSID));
        System.out.println("Bandwidhth : ");
        setBandwidth(in.nextInt(Bandwidth));
        System.out.println("Jumlah CCTV = ");
        setJumlahCCTV(in.nextInt(JumlahCCTV));
        System.out.println("Pilih kondisi CCTV : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi CCTV : ");
        setKondisiCCTV(in.nextInt());
        System.out.println("Pilih Posisi CCTV : ");
        System.out.println("1.Depan/Belakang \n 2. Samping ");
        System.out.println("Posisi CCTV : ");
        setPosisiCCTV(in.nextInt());
        
    }

    @Override
    public int AnalisisJumlahstopkontak(){
        if (super.getJumlahStopKontak() >= 4) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override    
    public int Analisiskondisistopkontak() {
        if (super.getKondisiStopKontak() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    
    @Override
    public int analisisposisistopkontak() {

        if (super.getPosisiStopKontak() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisLCD() {
        if (super.getJumlahKabelLCD() >= 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int AnalisiskondisiLCD() {
        if (super.getKondisiKabelLCD() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisposisiLCD() {
        if (super.getPosisiKabelLCD() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisLampu() {
        
        if (super.getJumlahLampu() >= 18) {
            System.out.println("Sesuai");
            return 0;
        } else if (super.getKondisiLampu() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else if (super.getPosisiLampu()== 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
        
    }

    @Override
    public int analisisKipasAngin() {
        if (super.getJumlahKipasAngin() >= 2) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisiskondisikipasangin() {
        if (super.getKondisiKipasAngin() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisposisikipasangin() {
        if (super.getPosisiKipasAngin() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisAC() {
        if (super.getJumlahAC() >= 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int anlisiskondisiAC() {
        if (super.getKondisiAC() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisposisiAC() {
        if (super.getPosisiAC() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int analisisInternet() {

        if ("UMM Hotspot".equals(getSSID())) {
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
        if (getJumlahCCTV() >= 2) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int KondisiCCTV() {
        if (getKondisiCCTV() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int posisiCCtv() {
        if (getPosisiCCTV() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }
    
}
