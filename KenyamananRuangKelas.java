package tugas.besar;

import java.util.Scanner;

public class KenyamananRuangKelas extends KebersihanRuangKelas {

    Scanner in = new Scanner (System.in);
    
    public int kebisingan(){
        System.out.println("Kebisingan : ");
        System.out.println("1. Bising\n2. Tidak Bising");
        super.setKebisingan(in.nextInt());
        
        if (super.getKebisingan() == 1){
            System.out.println("Tidak Sesuai");
            return super.getKebisingan();
        }else{
            System.out.println("Sesuai");
            return super.getKebisingan();
        }
    }
        
    public int bau(){
        System.out.println("Bau : ");
        System.out.println("1. Bau\n2. Tidak Bau");
        super.setBau(in.nextInt());
        
        if (getBau()== 1){
            System.out.println("Tidak Sesuai");
            return super.getBau();
        }else{
            System.out.println("Sesuai");
            return super.getBau();
        }
        }
        
    public int kebocoran(){
        
    	System.out.println("Kebocoran : ");
        System.out.println("1. Bocor\n2. Tidak Bocor");
        super.setKebocoran(in.nextInt());
        
        if (super.getKebocoran()== 1){
            System.out.println("Tidak Sesuai");
            return super.getKebocoran();
        }else{
            System.out.println("Sesuai");
            return super.getKebocoran();
        }
    }
        
    public int kerusakan(){
        System.out.println("Kerusakan : ");
        System.out.println("1. Rusak\n2. Tidak Rusak");
        super.setKerusakan(in.nextInt());
        
        if (getKerusakan()== 1){
            System.out.println("Tidak Sesuai");
            return super.getKerusakan();
        }else{
            System.out.println("Sesuai");
            return super.getKerusakan();
        }    
    }
     
    public int keausan(){
        System.out.println("Keausan : ");
        System.out.println("1. Rusak\n2. Tidak Rusak");
        super.setKeausan(in.nextInt());
        
        if (getKeausan()== 1){
            System.out.println("Tidak Sesuai");
            return super.getKeausan();
        }else{
            System.out.println("Sesuai");
            return super.getKeausan();
        }
    }
    
}
