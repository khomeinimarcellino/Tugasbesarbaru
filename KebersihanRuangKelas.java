package tugas.besar;

import java.util.Scanner;

public class KebersihanRuangKelas extends LingkunganRuangKelas {

	Scanner in = new Scanner(System.in);

	public int Sirkulasiudara() {
		System.out.println("Sirkulasi Udara : ");
		setSirkulasiUdara(in.nextInt());
		System.out.println("Apakah sirkulasi udara lancar");
		System.out.println("1. ya \n2. Tidak ");
		int lancar = in.nextInt();

		if (lancar == 1) {
			System.out.println("Sesuai");
			return lancar;
		} else {
			System.out.println("Tidak Sesuai");
			return lancar;
		}	
	}

	public int pencahayaan(){
		System.out.println("Nilai Pencahayaan : ");
		setNilaiPencahayaan(in.nextInt());

		if (getNilaiPencahayaan() >= 250) {
			if (getNilaiPencahayaan() <= 350) {
				System.out.println("Sesuai");
				return getNilaiPencahayaan();
			} else {
				System.out.println("Tidak Sesuai");
				return getNilaiPencahayaan();
			}
		} else {
			System.out.println("Tidak Sesuai");
			return getNilaiPencahayaan();
		}	
	}

	public int kelembapan(){
		System.out.println("Kelembapan : ");
		setKelembaban(in.nextInt());
		
		if (getKelembaban() >= 70) {
			if (getKelembaban() <= 80) {
				System.out.println("Sesuai");
				return getKelembaban();
			}else {
				System.out.println("Tidak Sesuai");
				return getKelembaban();
			}
		} else {
			System.out.println("Tidak Sesuai");
			return getKelembaban();
		}
	}

	public int suhu(){	
		System.out.println("Suhu (celcius) : ");
		setSuhu(in.nextInt());

		if (getSuhu() >= 25) {
			if (getSuhu() <= 35) {
				System.out.println("Sesuai");
				return getSuhu();
			} else {
				System.out.println("Tidak Sesuai");
				return getSuhu();
			}
		} else {
			System.out.println("Tidak Sesuai");
			return getSuhu();
		}
	}
	
}