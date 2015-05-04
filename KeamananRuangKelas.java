package tugas.besar;

import java.util.Scanner;

public class KeamananRuangKelas extends KenyamananRuangKelas {

	Scanner in = new Scanner(System.in);

	public int kekokohan(){

		System.out.println("Kekokohan: ");
		System.out.println("1. Kokoh\n2. Tidak Kokoh");
		setKekokohan(in.nextInt());

		if (getKekokohan() == 1) {
			System.out.println("Sesuai");
			return getKekokohan();
		} else {
			System.out.println("Tidak Sesuai");
			return getKekokohan();
		}
	}

	public int kuncipintujendela() {
		System.out.println("Kunci pintu dan jendela : ");
		System.out.println("1. Ada\n2. Tidak Ada");
		setKunciPintuJendela(in.nextInt());
		if (getKunciPintuJendela() == 1) {
			System.out.println("Sesuai");
			return getKunciPintuJendela();
		} else {
			System.out.println("Tidak Sesuai");
			return getKunciPintuJendela();
		}
	}

	public int bahaya() {
		System.out.println("Bahaya : ");
		System.out.println("1. Aman\n2. Tidak Aman");
		setBahaya(in.nextInt());

		if (getBahaya() == 1) {
			System.out.println("Sesuai");
			return getBahaya();
		} else {
			System.out.println("Tidak Sesuai");
			return getBahaya();
		}
	}

}