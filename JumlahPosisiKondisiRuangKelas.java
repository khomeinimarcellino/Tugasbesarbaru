package tugas.besar;

import java.util.Scanner;

public class JumlahPosisiKondisiRuangKelas {

    Scanner in = new Scanner(System.in);
    InventarisBarang data = new InventarisBarang();

    public void input() {
        System.out.println("Jumlah Stop kontak/Steker = ");
        data.setJumlahStopKontak(in.nextInt());
        System.out.println("Pilih kondisi Stopkontak/Steker : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi StopKontak/Steker : ");
        data.setKondisiStopKontak(in.nextInt());
        System.out.println("Pilih Posisi Stopkontak/Steker : ");
        System.out.println("1.Dipojok Ruang/Dekat Dosen \n 2.Di Samping/Belakang ruang ");
        System.out.println("Posisi StopKontak/Steker : ");
        data.setPosisiStopKontak(in.nextInt());
        System.out.println("Jumlah Kabel LCD = ");
        data.setJumlahKabelLCD(in.nextInt());
        System.out.println("Pilih kondisi Kabel LCD : ");
        System.out.println("1.Berfungsi \n 2.Tidak Berfungsi ");
        System.out.println("Kondisi Kabel LCD : ");
        data.setKondisiKabelLCD(in.nextInt());
        System.out.println("Pilih Posisi Kabel LCD : ");
        System.out.println("1.Dekat Dosen \n 2.Tidak Dekat dosen ");
        System.out.println("Posisi Kabel LCD : ");
        data.setPosisiKabelLCD(in.nextInt());
        System.out.println("Jumlah Lampu = ");
        data.setJumlahLampu(in.nextInt());
        System.out.println("Pilih kondisi Lampu : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi Lampu : ");
        data.setKondisiLampu(in.nextInt());
        System.out.println("Pilih Posisi Lampu : ");
        System.out.println("1.Atap Ruangan \n 2.Tidak Di Atap Ruangan ");
        System.out.println("Posisi Lampu : ");
        data.setPosisiLampu(in.nextInt());
        System.out.println("Jumlah Kipas Angin = ");
        data.setJumlahKipasAngin(in.nextInt());
        System.out.println("Pilih kondisi Kipas Angin : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi Kipas Angin : ");
        data.setKondisiKipasAngin(in.nextInt());
        System.out.println("Pilih Posisi Kipas Angin : ");
        System.out.println("1.Atap Ruangan \n 2.Tidak Di Atap Ruangan ");
        System.out.println("Posisi Kipas Angin : ");
        data.setPosisiKipasAngin(in.nextInt());
        System.out.println("Jumlah Stop kontak = ");
        data.setJumlahAC(in.nextInt());
        System.out.println("Pilih kondisi Stopkontak : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi AC : ");
        data.setKondisiAC(in.nextInt());
        System.out.println("Pilih Posisi AC : ");
        System.out.println("1.Di Belakang/Samping \n 2.Di Depan");
        System.out.println("Posisi AC : ");
        data.setPosisiAC(in.nextInt());
        System.out.println("Masukkan SSID : ");
        data.setSSID(in.next());
        System.out.println("Bandwidhth : ");
        data.setBandwidth(in.nextInt());
        System.out.println("Jumlah CCTV = ");
        data.setJumlahCCTV(in.nextInt());
        System.out.println("Pilih kondisi CCTV : ");
        System.out.println("1.Baik \n 2.Rusak ");
        System.out.println("Kondisi CCTV : ");
        data.setKondisiCCTV(in.nextInt());
        System.out.println("Pilih Posisi CCTV : ");
        System.out.println("1.Depan/Belakang \n 2. Samping ");
        System.out.println("Posisi CCTV : ");
        data.setPosisiCCTV(in.nextInt());
    }

    public void Analisiskelistrikan() {
        if (data.getJumlahStopKontak() >= 4) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getKondisiStopKontak() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getPosisiStopKontak() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisLCD() {
        if (data.getJumlahKabelLCD() >= 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getKondisiKabelLCD() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getPosisiKabelLCD() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisLampu() {
        if (data.getJumlahLampu() >= 18) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getKondisiLampu() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getPosisiLampu() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisKipasAngin() {
        if (data.getJumlahKipasAngin() >= 2) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getKondisiKipasAngin() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getPosisiKipasAngin() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisAC() {
        if (data.getJumlahAC() >= 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getKondisiAC() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getPosisiAC() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisInternet() {
        if ("UMM Hotspot".equals(data.getSSID())) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak sesuai");
        }

        System.out.print("Apakah bisa login :");
        System.out.println("1. ya \n 2. Tidak");
        int bisa = in.nextInt();

        if (bisa == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisCCTV() {
        if (data.getJumlahCCTV() >= 2) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getKondisiCCTV() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (data.getPosisiCCTV() == 1) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }
}