package tugas.besar;

import java.util.Scanner;

public class IdentitasRuang implements View{
   
    Scanner in = new Scanner(System.in);
    InventarisBarang goods;
    
    public void identitasruang() {
        String NamaRuang;
        String LokasiRuang;
        int Fakultas;
        System.out.println("Nama Ruangan : ");
        NamaRuang = (in.next());
        System.out.println("Lokasi ruang : ");
        LokasiRuang = (in.next());
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
        Fakultas = (in.nextInt());
        goods = new InventarisBarang(NamaRuang, LokasiRuang, Fakultas);
        programStudi();
        hasil(goods.getNamaRuang(), goods.getLokasiRuang(), goods.getFakultas());
        
    }
    
    public int programStudi(){
     if (goods.getFakultas() == 1) {
            System.out.println("1. Fakultas Ekonomi dan Bisnis");
            return 0;
        } else if (goods.getFakultas() == 2) {
            System.out.println("2. Fakultas Ilmu Sosial dan Ilmu Politik");
            return 0;
        } else if (goods.getFakultas() == 3) {
            System.out.println("3. Fakultas Agama Islam");
            return 0;
        } else if (goods.getFakultas() == 4) {
            System.out.println("4. Fakultas Teknik");
            return 0;
        } else if (goods.getFakultas() == 5) {
            System.out.println("5. Fakultas Hukum");
            return 0;
        } else if (goods.getFakultas() == 6) {            
            System.out.println("6. Fakultas Pertanian dan Peternakan");
            return 0;
        } else if (goods.getFakultas() == 7) {
            System.out.println("7. Fakultas Keguruan dan Ilmu Pendidikan");
            return 0;
        } else if (goods.getFakultas() == 8) {            
            System.out.println("8. Fakultas Psikologi");
            return 0;
        } else if (goods.getFakultas() == 9) {            
            System.out.println("9. Fakultas Kesehatan");
            return 0;
        } else if (goods.getFakultas() == 10) {
            System.out.println("10. Fakultas Kedokteran");
            return 0;
        } else {
            System.out.println("Error");
            return 1;
        }   
    }    
        
    @Override
    public void InputKeamanan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int kokoh, int kuncipj, int bahaya) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputKenyamanan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int Kebisingan, int Bau, int Kebocoran, int Kerusakan, int Keausan) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputJumlahPosisiKondisi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int JumlahStopKontak, int KondisiStopKontak, int PosisiStopKontak, int JumlahKabelLCD, int KondisiKabelLCD, int PosisiKabelLCD, int JumlahLampu, int KondisiLampu, int PosisiLampu, int JumlahKipasAngin, int KondisiKipasAngin, int PosisiKipasAngin, int JumlahAC, int KondisiAC, int PosisiAC, int JumlahCCTV, int KondisiCCTV, int PosisiCCTV, String SSID, int Bandwidth) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputKebersihanRuangKelas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int SirkulasiUdara, int NilaiPencahayaan, int Kelembaban, int Suhu) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InputLingkunganKelas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int KondisiLantai, int KondisiDinding, int KondisiAtap, int KondisiPintu, int KondisiJendela, int bersih3) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(String NamaRuang, String LokasiRuang, int Fakultas) {
        
    }

    @Override
    public void KondisiRuangKelas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hasil(int PanjangRuang, int LebarRuang, int JumlahKursi, int JumlahPintu, int JumlahJendela, String lengkap) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
