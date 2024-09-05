package latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
    int[] bilangan = new int[2];
        Scanner input =  new Scanner(System.in);
        System.out.println("Masukkan Nilai Bilangan 1: ");
        bilangan[0] = input.nextInt();

        System.out.println("Masukkan Nilai Bilangan 2: ");
        bilangan[1] = input.nextInt();

        if (bilangan[0] > bilangan[1]){
            System.out.println("Bilangan yang terbesar adalah : " + bilangan[0]);
        }else {
            System.out.println("Bilangan yang terbesar adalah : " + bilangan[1]);
        }
        input.close();
        //Mencari nilai terbesar dari dua bilangan

    }
}
