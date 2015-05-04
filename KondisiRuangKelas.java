package tugas.besar;

import java.util.Scanner;

public class KondisiRuangKelas extends IdentitasRuang {

	Scanner in = new Scanner(System.in);
	int luas;

	public void input() {
		System.out.println("Panjang Ruangan : ");
		super.setPanjangRuang(in.nextInt());
		System.out.println("Lebar Ruangan : ");
		super.setLebarRuang(in.nextInt());
		System.out.println("Jumlah Kursi : ");
		super.setJumlahKursi(in.nextInt());
		System.out.println("Jumlah Pintu : ");
		super.setJumlahPintu(in.nextInt());
		System.out.println("Jumlah Jendela : ");
		super.setJumlahJendela(in.nextInt());

	}

	int HitungLuas() {

		return super.getPanjangRuang() * super.getLebarRuang();

	}

	public int BentukKelas() {

		if (super.getPanjangRuang() == HitungLuas()) {
			System.out.println("Sesuai");
			return getPanjangRuang();
		} else {
			System.out.println("Tidak Sesuai");
			return getPanjangRuang();
		}
	}

	double Hitungrasio() {

		return HitungLuas() * super.getJumlahKursi();

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

		if (super.getJumlahPintu() >= 2) {
			System.out.println("Sesuai");
			return super.getJumlahPintu();
		} else {
			System.out.println("Tidak Sesuai");
			return super.getJumlahPintu();
		}

	}

	public int analisisjendela() {

		if (super.getJumlahJendela() >= 1) {
			System.out.println("Sesuai");
			return super.getJumlahJendela();
		} else {
			System.out.println("Tidak Sesuai");
			return super.getJumlahJendela();
		}

	}
}
