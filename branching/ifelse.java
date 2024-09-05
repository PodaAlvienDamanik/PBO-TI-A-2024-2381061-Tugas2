package branching;

import com.sun.security.jgss.GSSUtil;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int NomorHari=input.nextInt();
        String NamaHari = "";

        System.out.println("Masukkan Nomor Hari yang ingin dicari : " + NomorHari);
        if (NomorHari == 1){
            NamaHari = "Minggu";
        } else if (NomorHari == 2) {
            NamaHari = "Senin";
        } else if (NomorHari == 3) {
          NamaHari = "Selasa";
        } else if (NomorHari == 4) {
            NamaHari = "Rabu";
        } else if (NomorHari == 5) {
            NamaHari = "Kamis";
        } else if (NomorHari == 6) {
            NamaHari = "Jumat";
        } else if (NomorHari == 7) {
            NamaHari = "Sabtu";
        }else {
            System.out.println("Masukkan nomor antara 1-7:");
            System.exit(0);
        }
        System.out.println("Masukkan nomor antara 1-7:");
        System.out.println("Hari : " + NamaHari);

    }
}
