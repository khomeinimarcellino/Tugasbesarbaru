package tugas.besar;

import java.util.Scanner;

public class KebersihanRuangKelas extends InventarisBarang {

    Scanner in = new Scanner(System.in);

    protected int lancar;

    public KebersihanRuangKelas(int SirkulasiUdara, int NilaiPencahayaan, int Kelembaban, int Suhu) {
        super(SirkulasiUdara, NilaiPencahayaan, Kelembaban, Suhu);
        System.out.println("Sirkulasi Udara : ");
        setSirkulasiUdara(in.nextInt(SirkulasiUdara));
        System.out.println("Apakah sirkulasi udara lancar");
        System.out.println("1. ya \n2. Tidak ");
        lancar = in.nextInt();
        System.out.println("Nilai Pencahayaan : ");
        setNilaiPencahayaan(in.nextInt(NilaiPencahayaan));
        System.out.println("Kelembapan : ");
        setKelembaban(in.nextInt(Kelembaban));
        System.out.println("Suhu (celcius) : ");
        setSuhu(in.nextInt(Suhu));
        
    }

    @Override
    public int Sirkulasiudara() {

        if (lancar == 1) {
            System.out.println("Sesuai");
            return 0;
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int pencahayaan() {
        

        if (getNilaiPencahayaan() >= 250) {
            if (getNilaiPencahayaan() <= 350) {
                System.out.println("Sesuai");
                return 0;
            } else {
                System.out.println("Tidak Sesuai");
                return 1;
            }
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int kelembaban() {
        
        if (getKelembaban() >= 70) {
            if (getKelembaban() <= 80) {
                System.out.println("Sesuai");
                return 0;
            } else {
                System.out.println("Tidak Sesuai");
                return 1;
            }
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

    @Override
    public int suhu() {
        

        if (getSuhu() >= 25) {
            if (getSuhu() <= 35) {
                System.out.println("Sesuai");
                return 0;
            } else {
                System.out.println("Tidak Sesuai");
                return 1;
            }
        } else {
            System.out.println("Tidak Sesuai");
            return 1;
        }
    }

}
