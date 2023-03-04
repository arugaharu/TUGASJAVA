/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maingas;
/**
 *
 * @author Gaharu Winanggya B / 123210155
 */

import java.util.Scanner;

public class Maingas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    
    char ulang = 0;
    
    do{
    System.out.println("Hitung Balok & Tabung");
    System.out.println("Menu:");
    System.out.println("1. Balok");
    System.out.println("2. Tabung");
    System.out.println("3. Keluar Klen");
    System.out.print("Pilih menu: ");
    int menu = input.nextInt();
    
        if (menu == 1) {
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();
        System.out.println("--------------");
        
            System.out.println("HASIL");
            Balok balok = new Balok(panjang, lebar,tinggi);
        
        System.out.println("--------------");
        System.out.println("Volume Balok :" + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok :" + balok.hitungLuasPermukaan());
        System.out.println("Luas Persegi Panjang :" + balok.hitungLuasPP());
        System.out.println("Keliling Persegi Panjang :" + balok.hitungKelilingPP());
       
        }else if (menu == 2){
            System.out.print("Masukkan JariJari: ");
            double jariJari = input.nextDouble();
            System.out.print("Masukkan Tinggi: ");
            double tinggi = input.nextDouble();
            System.out.println("--------------");
            
            System.out.println("HASIL");
            Tabung tabung = new Tabung(jariJari, tinggi);
            
            System.out.println("--------------");
            System.out.println("Volume Tabung :" + tabung.hitungVolume());
            System.out.println("Luas Permukaan Tabung :" + tabung.hitungLuasPermukaan());
            System.out.println("Luas Permukaan Lingkaran :" + tabung.hitungLuasL());
            System.out.println("Keliling Lingkaran :" + tabung.hitungKelilingL());
           
        }else{
            break;
        }
        
        System.out.println();
        System.out.println("Mau Pilih Lagi (y/t) ?");
        ulang = input.next().charAt(0);
        System.out.println();
    }
    while (ulang!= 't');
    System.out.println("Maturnuwun");
    
 } 
    
}
