package tugas.besar;

import java.util.Scanner;

public class IdentitasRuang {

    Scanner in = new Scanner(System.in);
    InventarisBarang data = new InventarisBarang();

    public void NamaRuang() {
        System.out.println("Nama Ruangan : ");
        data.setNamaRuang(in.next());
        System.out.println("Lokasi ruang : ");
        data.setLokasiRuang(in.next());
    }

    public void ProgStudiFakultas() {

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
        data.setFakultas(in.nextInt());
        
        switch(data.getFakultas()){
            case 1 : System.out.println("1. Fakultas Ekonomi dan Bisnis");
            break;
            case 2 : System.out.println("2. Fakultas Ilmu Sosial dan Ilmu Politik");
            break;
            case 3 : System.out.println("3. Fakultas Agama Islam");
            break;
            case 4 : System.out.println("4. Fakultas Teknik");
            break;
            case 5 : System.out.println("5. Fakultas Hukum");
            break;
            case 6 : System.out.println("6. Fakultas Pertanian dan Peternakan");
            break;
            case 7 : System.out.println("7. Fakultas Keguruan dan Ilmu Pendidikan");
            break;
            case 8 : System.out.println("8. Fakultas Psikologi");
            break;
            case 9 : System.out.println("9. Fakultas Kesehatan");
            break;
            case 10: System.out.println("10. Fakultas Kedokteran");
            break;    
        }
     
    }
    
    public void listinputan(){
        System.out.println(data.getNamaRuang());
        System.out.println(data.getLokasiRuang());
        System.out.println(data.getFakultas());
    }
}