package tugas.besar;

import java.util.Scanner;

public class KeamananRuangKelas extends InventarisBarang {

    Scanner in = new Scanner(System.in);

    public KeamananRuangKelas(int Kekokohan, int KunciPintuJendela, int Bahaya) {
        super(Kekokohan, KunciPintuJendela, Bahaya);
        System.out.println("Kekokohan: ");
        System.out.println("1. Kokoh\n2. Tidak Kokoh");
        super.setKekokohan(in.nextInt(Kekokohan));
        System.out.println("Kunci pintu dan jendela : ");
        System.out.println("1. Ada\n2. Tidak Ada");
        super.setKunciPintuJendela(in.nextInt(KunciPintuJendela));
        System.out.println("Bahaya : ");
        System.out.println("1. Aman\n2. Tidak Aman");
        super.setBahaya(in.nextInt(Bahaya));

    }

    @Override
    public int kekokohan() {

        if (super.getKekokohan() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int kuncipintujendela() {

        if (super.getKunciPintuJendela() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int bahaya() {

        if (super.getBahaya() == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

}
