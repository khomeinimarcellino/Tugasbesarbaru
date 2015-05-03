package tugas.besar;

import java.util.Scanner;


public class KebersihanRuangKelas {
    
    Scanner in = new Scanner (System.in);
    InventarisBarang data = new InventarisBarang();
    
    public void Kebersihanruang(){
        
        System.out.println("Sirkulasi Udara : ");
        data.setSirkulasiUdara(in.nextInt());
        System.out.println("Apakah sirkulasi udara lancar");
        System.out.println("1. ya \n2. Tidak ");
        int lancar = in.nextInt();
        
        if (lancar == 1){
            System.out.println("Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
        
        System.out.println("Nilai Pencahayaan : ");
        data.setNilaiPencahayaan(in.nextInt());
        
        if (data.getNilaiPencahayaan()>= 250){
            if (data.getNilaiPencahayaan()<=350){
                System.out.println("Sesuai");
            }else{
                System.out.println("Tidak Sesuai");
            }
        }else{
            System.out.println("Tidak Sesuai");
        }
        
        System.out.println("Kelembapan : ");
        data.setKelembaban(in.nextInt());
        
        if (data.getKelembaban()>= 70){
            if (data.getKelembaban()<=80){
                System.out.println("Sesuai");
            }else{
                System.out.println("Tidak Sesuai");
            }
        }else{
            System.out.println("Tidak Sesuai");
        }
        
        System.out.println("Suhu (celcius) : ");
        data.setSuhu(in.nextInt());
        
        if (data.getSuhu()>= 25){
            if (data.getSuhu()<=35){
                System.out.println("Sesuai");
            }else{
                System.out.println("Tidak Sesuai");
            }
        }else{
            System.out.println("Tidak Sesuai");
        }   
    }
}