package tugas.besar;

import java.util.Scanner;

public class KenyamananRuangKelas extends KebersihanRuangKelas {

    Scanner in = new Scanner (System.in);
    
    public int kebisingan(){
        System.out.println("Kebisingan : ");
        System.out.println("1. Bising\n2. Tidak Bising");
        setKebisingan(in.nextInt());
        
        if (getKebisingan() == 1){
            System.out.println("Tidak Sesuai");
            return getKebisingan();
        }else{
            System.out.println("Sesuai");
            return getKebisingan();
        }
    }
        
    public int bau(){
        System.out.println("Bau : ");
        System.out.println("1. Bau\n2. Tidak Bau");
        setBau(in.nextInt());
        
        if (getBau()== 1){
            System.out.println("Tidak Sesuai");
            return getBau();
        }else{
            System.out.println("Sesuai");
            return getBau();
        }
        }
        
    public int kebocoran(){
        
    	System.out.println("Kebocoran : ");
        System.out.println("1. Bocor\n2. Tidak Bocor");
        setKebocoran(in.nextInt());
        
        if (getKebocoran()== 1){
            System.out.println("Tidak Sesuai");
            return getKebocoran();
        }else{
            System.out.println("Sesuai");
            return getKebocoran();
        }
    }
        
    public int kerusakan(){
        System.out.println("Kerusakan : ");
        System.out.println("1. Rusak\n2. Tidak Rusak");
        setKerusakan(in.nextInt());
        
        if (getKerusakan()== 1){
            System.out.println("Tidak Sesuai");
            return getKerusakan();
        }else{
            System.out.println("Sesuai");
            return getKerusakan();
        }    
    }
     
    public int keausan(){
        System.out.println("Keausan : ");
        System.out.println("1. Rusak\n2. Tidak Rusak");
        setKeausan(in.nextInt());
        
        if (getKeausan()== 1){
            System.out.println("Tidak Sesuai");
            return getKeausan();
        }else{
            System.out.println("Sesuai");
            return getKeausan();
        }
    }
    
}