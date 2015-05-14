package tugas.besar;

import java.util.Scanner;

public class IdentitasRuang extends InventarisBarang {
    
    Scanner in = new Scanner(System.in);
    
    public IdentitasRuang(String NamaRuang, String LokasiRuang) {
        super(NamaRuang, LokasiRuang);
        System.out.println("Nama Ruangan : ");
        super.setNamaRuang(in.next());
        System.out.println("Lokasi ruang : ");
        super.setLokasiRuang(in.next());
    }
    
    @Override
    public int programstudi() {
        
        System.out.println("Pilih Fakultas : ");
        System.out.println("1. Fakultas Ekonomi dan Bisnis");
        System.out.println("2. Fakultas Ilmu Sosial dan Ilmu Politik");
        System.out.println("3. Fakultas Agama Islam");
        System.out.println("4. Fakultas Teknik");
        System.out.println("5. Fakultas Hukum");
        System.out.println("6. Fakultas Pertanian dan Peternakan");
        System.out.println("7. Fakultas Keguruan dan Ilmu Pendidikan");
        System.out.println("8. Fakultas Psikologi");
        System.out.println("9. Fakultas Kesehatan");
        System.out.println("10. Fakultas Kedokteran");
        super.setFakultas(in.nextInt());
        
        if (getFakultas() == 1) {
            System.out.println("1. Fakultas Ekonomi dan Bisnis");
            return 0;
        } else if (getFakultas() == 2) {
            System.out.println("2. Fakultas Ilmu Sosial dan Ilmu Politik");
            return 0;
        } else if (getFakultas() == 3) {
            System.out.println("3. Fakultas Agama Islam");
            return 0;
        } else if (getFakultas() == 4) {
            System.out.println("4. Fakultas Teknik");
            return 0;
        } else if (getFakultas() == 5) {
            System.out.println("5. Fakultas Hukum");
            return 0;
        } else if (getFakultas() == 6) {            
            System.out.println("6. Fakultas Pertanian dan Peternakan");
            return 0;
        } else if (getFakultas() == 7) {
            System.out.println("7. Fakultas Keguruan dan Ilmu Pendidikan");
            return 0;
        } else if (getFakultas() == 8) {            
            System.out.println("8. Fakultas Psikologi");
            return 0;
        } else if (getFakultas() == 9) {            
            System.out.println("9. Fakultas Kesehatan");
            return 0;
        } else if (getFakultas() == 10) {
            System.out.println("10. Fakultas Kedokteran");
            return 0;
        } else {
            System.out.println("Error");
            return 1;
        }
    }
    
    public void list() {
        System.out.println("\nNama Ruangan   :" + getNamaRuang());
        System.out.println("Lokasi Ruangan :" + getLokasiRuang());
        System.out.println("Fakultas       :" + getFakultas());
        
    }
    
}
