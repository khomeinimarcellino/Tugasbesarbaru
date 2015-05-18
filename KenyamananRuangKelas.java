package tugas.besar;

import java.util.Scanner;

public class KenyamananRuangKelas extends InventarisBarang {

    Scanner in = new Scanner(System.in);

    public KenyamananRuangKelas(int Kebisingan, int Bau, int Kebocoran, int Kerusakan, int Keausan, int nyaman, int bersih3) {
        super(Kebisingan, Bau, Kebocoran, Kerusakan, Keausan, nyaman, bersih3);
        System.out.println("Kebisingan : ");
        System.out.println("1. Bising\n2. Tidak Bising");
        super.setKebisingan(in.nextInt(Kebisingan));
        System.out.println("Bau : ");
        System.out.println("1. Bau\n2. Tidak Bau");
        super.setBau(in.nextInt(Bau));
        System.out.println("Kebocoran : ");
        System.out.println("1. Bocor\n2. Tidak Bocor");
        super.setKebocoran(in.nextInt(Kebocoran));
        System.out.println("Kerusakan : ");
        System.out.println("1. Rusak\n2. Tidak Rusak");
        super.setKerusakan(in.nextInt(Kerusakan));
        System.out.println("Keausan : ");
        System.out.println("1. Rusak\n2. Tidak Rusak");
        super.setKeausan(in.nextInt(Keausan));
    }

    @Override
    public int kebisingan() {

        if (super.getKebisingan() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

    @Override
    public int bau() {

        if (getBau() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

    @Override
    public int kebocoran() {

        if (super.getKebocoran() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

    @Override
    public int kerusakan() {

        if (getKerusakan() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

    @Override
    public int keausan() {

        if (getKeausan() == 1) {
            System.out.println("Tidak Sesuai");
            return 0;
        } else {
            System.out.println("Sesuai");
            return 1;
        }
    }

}
