package latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        //membuat kalkulator sederhana dengan dalamnya (+,-,*,/,%)
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka ke-1 : ");
        double angka1 = input.nextDouble();

        System.out.println("Masukkan angka ke-2 : ");
        double angka2 = input.nextDouble();

        System.out.println();
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Modulus");
        System.out.println("pilih operasi yang ingin digunakan");
        int hasil = input.nextInt();

        switch (hasil){
            case 1:
                System.out.println("Hasil dari penjumlahan nya adalah: " + (angka1 + angka2));
                break;
            case 2:
                System.out.println("Hasil dari pengurangan nya adalah: " + (angka1 - angka2));
                break;
            case 3:
                System.out.println("Hasil dari perkalian nya adalah: " + (angka1 * angka2));
                break;
            case 4:
                System.out.println("Hasil dari pembagian nya adalah: " + (angka1 / angka2));
                break;
            case 5:
                System.out.println("Hasil dari Modulus nya adalah: " + (angka1 % angka2));
                break;
            default:
                System.out.println("Masukkan angka yang betol");
                break;

        }

    }
}
