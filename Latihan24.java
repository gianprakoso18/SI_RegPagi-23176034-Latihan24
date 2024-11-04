/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan24;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
    import java.util.Scanner;

public class Latihan24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("========Program Perbandingan Nilai========");
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = scanner.next();
        } while (ulangi.equalsIgnoreCase("Ya"));

        System.out.println("BUILD SUCCESSFUL");
    }
}
