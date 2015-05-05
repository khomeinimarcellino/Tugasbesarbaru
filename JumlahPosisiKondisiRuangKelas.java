package tugas.besar;

import java.util.Scanner;

public class JumlahPosisiKondisiRuangKelas extends KondisiRuangKelas {

	Scanner in = new Scanner(System.in);

	public void input() {
		System.out.println("Jumlah Stop kontak/Steker = ");
		setJumlahStopKontak(in.nextInt());
		System.out.println("Pilih kondisi Stopkontak/Steker : ");
		System.out.println("1.Baik \n 2.Rusak ");
		System.out.println("Kondisi StopKontak/Steker : ");
		setKondisiStopKontak(in.nextInt());
		System.out.println("Pilih Posisi Stopkontak/Steker : ");
		System.out.println("1.Dipojok Ruang/Dekat Dosen \n 2.Di Samping/Belakang ruang ");
		System.out.println("Posisi StopKontak/Steker : ");
		setPosisiStopKontak(in.nextInt());
		System.out.println("Jumlah Kabel LCD = ");
		setJumlahKabelLCD(in.nextInt());
		System.out.println("Pilih kondisi Kabel LCD : ");
		System.out.println("1.Berfungsi \n 2.Tidak Berfungsi ");
		System.out.println("Kondisi Kabel LCD : ");
		setKondisiKabelLCD(in.nextInt());
		System.out.println("Pilih Posisi Kabel LCD : ");
		System.out.println("1.Dekat Dosen \n 2.Tidak Dekat dosen ");
		System.out.println("Posisi Kabel LCD : ");
		setPosisiKabelLCD(in.nextInt());
		System.out.println("Jumlah Lampu = ");
		setJumlahLampu(in.nextInt());
		System.out.println("Pilih kondisi Lampu : ");
		System.out.println("1.Baik \n 2.Rusak ");
		System.out.println("Kondisi Lampu : ");
		setKondisiLampu(in.nextInt());
		System.out.println("Pilih Posisi Lampu : ");
		System.out.println("1.Atap Ruangan \n 2.Tidak Di Atap Ruangan ");
		System.out.println("Posisi Lampu : ");
		setPosisiLampu(in.nextInt());
		System.out.println("Jumlah Kipas Angin = ");
		setJumlahKipasAngin(in.nextInt());
		System.out.println("Pilih kondisi Kipas Angin : ");
		System.out.println("1.Baik \n 2.Rusak ");
		System.out.println("Kondisi Kipas Angin : ");
		setKondisiKipasAngin(in.nextInt());
		System.out.println("Pilih Posisi Kipas Angin : ");
		System.out.println("1.Atap Ruangan \n 2.Tidak Di Atap Ruangan ");
		System.out.println("Posisi Kipas Angin : ");
		setPosisiKipasAngin(in.nextInt());
		System.out.println("Jumlah Stop kontak = ");
		setJumlahAC(in.nextInt());
		System.out.println("Pilih kondisi Stopkontak : ");
		System.out.println("1.Baik \n 2.Rusak ");
		System.out.println("Kondisi AC : ");
		setKondisiAC(in.nextInt());
		System.out.println("Pilih Posisi AC : ");
		System.out.println("1.Di Belakang/Samping \n 2.Di Depan");
		System.out.println("Posisi AC : ");
		setPosisiAC(in.nextInt());
		System.out.println("Masukkan SSID : ");
		setSSID(in.next());
		System.out.println("Bandwidhth : ");
		setBandwidth(in.nextInt());
		System.out.println("Jumlah CCTV = ");
		setJumlahCCTV(in.nextInt());
		System.out.println("Pilih kondisi CCTV : ");
		System.out.println("1.Baik \n 2.Rusak ");
		System.out.println("Kondisi CCTV : ");
		setKondisiCCTV(in.nextInt());
		System.out.println("Pilih Posisi CCTV : ");
		System.out.println("1.Depan/Belakang \n 2. Samping ");
		System.out.println("Posisi CCTV : ");
		setPosisiCCTV(in.nextInt());
	}

	public int AnalisisJumlahstopkontak() {

		if (getJumlahStopKontak() >= 4) {
			System.out.println("Sesuai");
			return getJumlahStopKontak();
		} else {
			System.out.println("Tidak Sesuai");
			return getJumlahStopKontak();
		}
	}

	public int Analisiskondisistopkontak() {
		if (getKondisiStopKontak() == 1) {
			System.out.println("Sesuai");
			return getKondisiStopKontak();
		} else {
			System.out.println("Tidak Sesuai");
			return getKondisiStopKontak();
		}
	}

	public int analisisposisistopkontak() {

		if (getPosisiStopKontak() == 1) {
			System.out.println("Sesuai");
			return getPosisiStopKontak();
		} else {
			System.out.println("Tidak Sesuai");
			return getPosisiStopKontak();
		}
	}

	public int analisisLCD() {
		if (getJumlahKabelLCD() >= 1) {
			System.out.println("Sesuai");
			return getJumlahKabelLCD();
		} else {
			System.out.println("Tidak Sesuai");
			return getJumlahKabelLCD();
		}
	}

	public int AnalisiskondisiLCD() {
		if (getKondisiKabelLCD() == 1) {
			System.out.println("Sesuai");
			return getKondisiKabelLCD();
		} else {
			System.out.println("Tidak Sesuai");
			return getKondisiKabelLCD();
		}
	}

	public int analisisposisiLCD() {
		if (getPosisiKabelLCD() == 1) {
			System.out.println("Sesuai");
			return getPosisiKabelLCD();
		} else {
			System.out.println("Tidak Sesuai");
			return getPosisiKabelLCD();
		}
	}

	public void analisisLampu() {
		if (getJumlahLampu() >= 18) {
			System.out.println("Sesuai");
		} else {
			System.out.println("Tidak Sesuai");
		}
		if (getKondisiLampu() == 1) {
			System.out.println("Sesuai");
		} else {
			System.out.println("Tidak Sesuai");
		}
		if (getPosisiLampu() == 1) {
			System.out.println("Sesuai");
		} else {
			System.out.println("Tidak Sesuai");
		}
	}

	public int analisisKipasAngin() {
		if (getJumlahKipasAngin() >= 2) {
			System.out.println("Sesuai");
			return getJumlahKipasAngin();
		} else {
			System.out.println("Tidak Sesuai");
			return getJumlahKipasAngin();
		}
	}
	
	public int analisiskondisikipasangin(){
		if (getKondisiKipasAngin() == 1) {
			System.out.println("Sesuai");
			return getKondisiKipasAngin();
		} else {
			System.out.println("Tidak Sesuai");
			return getKondisiKipasAngin();
		}
	}
	
	public int analisisposisikipasangin(){
		if (getPosisiKipasAngin() == 1) {
			System.out.println("Sesuai");
			return getPosisiKipasAngin();
		} else {
			System.out.println("Tidak Sesuai");
			return getPosisiKipasAngin();
		}
	}

	public int analisisAC() {
		if (getJumlahAC() >= 1) {
			System.out.println("Sesuai");
			return getJumlahAC();
		} else {
			System.out.println("Tidak Sesuai");
			return getJumlahAC();
		}
	}
		
	public int anlisiskondisiAC(){
		if (getKondisiAC() == 1) {
			System.out.println("Sesuai");
			return getKondisiAC();
		} else {
			System.out.println("Tidak Sesuai");
			return getKondisiAC();
		}
	}
	
	public int analisisposisiAC(){
		if (getPosisiAC() == 1) {
			System.out.println("Sesuai");
			return getPosisiAC();
		} else {
			System.out.println("Tidak Sesuai");
			return getPosisiAC();
		}
	}

	public String analisisInternet() {
		
		if ("UMM Hotspot".equals(getSSID())) {
			System.out.println("Sesuai");
			return getSSID();
		} else {
			System.out.println("Tidak sesuai");
			return getSSID();
		}
	}
	
	public int analisislogin(){
		System.out.print("Apakah bisa login :");
		System.out.println("1. ya \n 2. Tidak");
		int bisa = in.nextInt();
		if (bisa == 1) {
			System.out.println("Sesuai");
			return bisa;
		} else {
			System.out.println("Tidak Sesuai");
			return bisa;
		}
	}

	public int analisisCCTV() {
		if (getJumlahCCTV() >= 2) {
			System.out.println("Sesuai");
			return getJumlahCCTV();
		} else {
			System.out.println("Tidak Sesuai");
			return getJumlahCCTV();
		}
	}
	
	public int KondisiCCTV(){
	if (getKondisiCCTV() == 1) {
			System.out.println("Sesuai");
			return getKondisiCCTV();
	} else {
			System.out.println("Tidak Sesuai");
			return getKondisiCCTV();
		}
	}
	
	public int posisiCCtv(){
		if (getPosisiCCTV() == 1) {
			System.out.println("Sesuai");
			return getPosisiCCTV();
		} else {
			System.out.println("Tidak Sesuai");
			return getPosisiCCTV();
		}
	}
}