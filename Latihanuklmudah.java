/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class Latihanuklmudah {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Tampilkan menu utama
            System.out.println("\n==============================");
            System.out.println("     MENU PROGRAM JAVA");
            System.out.println("==============================");
            System.out.println("1. Hitung Biaya Pengiriman Paket");
            System.out.println("2. Cek Bilangan Ganjil atau Genap");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-2): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    
                    System.out.println("\n=== Hitung Biaya Pengiriman Paket ===");
                    System.out.print("Masukkan berat paket (kg): ");
                    double berat = input.nextDouble();

                    System.out.print("Masukkan jarak pengiriman (km): ");
                    double jarak = input.nextDouble();

                    System.out.print("Masukkan panjang paket (cm): ");
                    double panjang = input.nextDouble();

                    System.out.print("Masukkan lebar paket (cm): ");
                    double lebar = input.nextDouble();

                    System.out.print("Masukkan tinggi paket (cm): ");
                    double tinggi = input.nextDouble();

                    // Hitung volume
                    double volume = panjang * lebar * tinggi;

                    // Tentukan biaya per kg
                    double biayaPerKg = (jarak <= 10) ? 4250 : 6000;

                    // Hitung biaya dasar
                    double biayaTotal = berat * biayaPerKg;

                    // Tambah biaya jika volume melebihi 100 cm³
                    if (volume > 100) {
                        biayaTotal += 50000;
                    }

                    // Tampilkan hasil
                    System.out.println("\n=== Rincian Biaya Pengiriman ===");
                    System.out.println("Volume paket : " + volume + " cm³");
                    System.out.println("Biaya dasar  : Rp " + (berat * biayaPerKg));
                    if (volume > 100) {
                        System.out.println("Biaya tambahan volume: Rp 50000");
                    }
                    System.out.println("Total biaya pengiriman: Rp " + biayaTotal);
                    break;

                case 2:
                                        System.out.println("\n=== Cek Bilangan Ganjil atau Genap ===");
                    System.out.print("Masukkan sebuah bilangan: ");
                    int bilangan = input.nextInt();

                    if (bilangan % 2 == 0) {
                        System.out.println(bilangan + " adalah bilangan GENAP.");
                    } else {
                        System.out.println(bilangan + " adalah bilangan GANJIL.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }
        } while (pilihan != 0);

        input.close();
    }
}

    

