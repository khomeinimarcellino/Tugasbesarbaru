package tugas.besar;

import java.util.Scanner;

public class KeamananRuangKelas extends KenyamananRuangKelas {

	Scanner in = new Scanner(System.in);

	public int kekokohan(){

		System.out.println("Kekokohan: ");
		System.out.println("1. Kokoh\n2. Tidak Kokoh");
		super.setKekokohan(in.nextInt());

		if (super.getKekokohan() == 1) {
			System.out.println("Sesuai");
			return super.getKekokohan();
		} else {
			System.out.println("Tidak Sesuai");
			return super.getKekokohan();
		}
	}

	public int kuncipintujendela() {
		System.out.println("Kunci pintu dan jendela : ");
		System.out.println("1. Ada\n2. Tidak Ada");
		super.setKunciPintuJendela(in.nextInt());
		if (super.getKunciPintuJendela() == 1) {
			System.out.println("Sesuai");
			return super.getKunciPintuJendela();
		} else {
			System.out.println("Tidak Sesuai");
			return super.getKunciPintuJendela();
		}
	}

	public int bahaya() {
		System.out.println("Bahaya : ");
		System.out.println("1. Aman\n2. Tidak Aman");
		super.setBahaya(in.nextInt());

		if (super.getBahaya() == 1) {
			System.out.println("Sesuai");
			return super.getBahaya();
		} else {
			System.out.println("Tidak Sesuai");
			return super.getBahaya();
		}
	}

}
