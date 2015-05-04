package tugas.besar;

import java.util.Scanner;

public class KondisiRuangKelas extends IdentitasRuang {

	Scanner in = new Scanner(System.in);
	int luas;

	public void input() {
		System.out.println("Panjang Ruangan : ");
		setPanjangRuang(in.nextInt());
		System.out.println("Lebar Ruangan : ");
		setLebarRuang(in.nextInt());
		System.out.println("Jumlah Kursi : ");
		setJumlahKursi(in.nextInt());
		System.out.println("Jumlah Pintu : ");
		setJumlahPintu(in.nextInt());
		System.out.println("Jumlah Jendela : ");
		setJumlahJendela(in.nextInt());

	}

	int HitungLuas() {

		return getPanjangRuang() * getLebarRuang();

	}

	public int BentukKelas() {

		if (getPanjangRuang() == HitungLuas()) {
			System.out.println("Sesuai");
			return getPanjangRuang();
		} else {
			System.out.println("Tidak Sesuai");
			return getPanjangRuang();
		}
	}

	double Hitungrasio() {

		return HitungLuas() * getJumlahKursi();

	}

	public double Rasio() {

		if (Hitungrasio() >= 0.5) {
			System.out.println("Sesuai");
			return Hitungrasio();
		} else {
			System.out.println("Tidak Sesuai");
			return Hitungrasio();
		}
	}

	public int Analisispintu() {

		if (getJumlahPintu() >= 2) {
			System.out.println("Sesuai");
			return getJumlahPintu();
		} else {
			System.out.println("Tidak Sesuai");
			return getJumlahPintu();
		}

	}

	public int analisisjendela() {

		if (getJumlahJendela() >= 1) {
			System.out.println("Sesuai");
			return getJumlahJendela();
		} else {
			System.out.println("Tidak Sesuai");
			return getJumlahJendela();
		}

	}
}
