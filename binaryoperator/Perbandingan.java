package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int x = 20;
        int y = 50;

        boolean Samadengan = (x == y);//ini kek biasa di c++
        System.out.println("hasilnya : " + Samadengan);

        boolean TidakSamaDengan = (x != y);//ini juga le
        System.out.println("hasilnya : " + TidakSamaDengan);

        boolean LebihDari = (x > y);//ga usah terkejut kali
        System.out.println("hasilnya : " + LebihDari);

        boolean KurangDari = (x < y);//masih aman bos
        System.out.println("hasilnya : " + KurangDari);

        boolean LebihAtauSamaDengan =(x >= y);//tinggal tambah =,jgn lupa ygy
        System.out.println("Hasilnya : " + LebihAtauSamaDengan);

        boolean KurangDariAtauSamaDengan = (x <= y); // sama kek diatas,jgn lupa ditambah =
        System.out.println("hasilnya : " + KurangDariAtauSamaDengan);


    }
}
