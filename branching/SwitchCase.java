package branching;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int NomorHari=input.nextInt();
        System.out.println("Masukkan Nama Hari: " + NomorHari);
        String NamaHari = "";
        System.out.println("Masukkan Nama Hari: " + NomorHari);
        switch (NomorHari){
            case 1:
                NamaHari = "Minggu";
                break;
            case 2:
                NamaHari = "Senin";
                break;
            case 3:
                NamaHari = "Selasa";
                break;
            case 4:
                NamaHari = "Rabu";
                break;
            case 5:
                NamaHari = "Kamis";
                break;
            case 6:
                NamaHari = "Jumat";
                break;
            case 7:
                NamaHari = "Sabtu";
                break;
            default:
                System.out.println();
        }

    }
}
