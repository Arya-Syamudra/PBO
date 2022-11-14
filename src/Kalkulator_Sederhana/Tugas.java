package Kalkulator_Sederhana;

import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) {
//      deklarasi variabel
        String pilih_operasi;
        int nilai1 = 0;
        int nilai2 = 0;
        double hasil;

        Scanner input_pilihan = new Scanner(System.in);
        System.out.println("__________________________");
        System.out.println("Kalkulator");
        System.out.println("----------------------------");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Penguragan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Perpangkatan");
        System.out.println("________________________________");
        System.out.println("masukkan Pilihan : ");
        pilih_operasi = input_pilihan.nextLine();

//       logika 
        if (pilih_operasi.equals("1")) {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = input_pilihan.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = input_pilihan.nextInt();
//operasi penjumlahan
            hasil = nilai1 + nilai2;
            System.out.println("Hasil Penjumlahan adalah : " + hasil);

        } else if (pilih_operasi.equals("2")) {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = input_pilihan.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = input_pilihan.nextInt();
//operasi pengurangan
            hasil = nilai1 - nilai2;
            System.out.println("Hasil Pengurangan adalah : " + hasil);

        } else if (pilih_operasi.equals("3")) {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = input_pilihan.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = input_pilihan.nextInt();
//            operasi perkalian
            hasil = nilai1 * nilai2;
            System.out.println("Hasil Perkalian adalah : " + hasil);

        } else if (pilih_operasi.equals("4")) {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = input_pilihan.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = input_pilihan.nextInt();
//oprasi pembagian
            hasil = nilai1 / nilai2;
            System.out.println("Hasil Pembagian adalah : " + hasil);

        } else if (pilih_operasi.equals("5")) {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = input_pilihan.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = input_pilihan.nextInt();
//opersi perpangkatan 
//menggunakan fungsi Math.pow di gunakan utuk perpangkatan bilangan
            hasil = Math.pow(nilai1, nilai2);
            System.out.println("Hasil perpangkatan adalah : " + hasil);
        } else {
            System.out.println("Pilihan tidak ada!");
        }
    }
}
