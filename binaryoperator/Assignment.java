package binaryoperator;

public class Assignment {
    public static void main(String[] args) {
        int angka = 10;
        String nama = "Tyesa";

        System.out.println("Nilai Angka :" + angka);
        System.out.println("Nilai Nama : " + nama);

        int x= 5;
        x += 3; //ini x atas ditambah langsung dengan 3 dibawah
        System.out.println("Nilai Setelah += : " + x);

        int y = 20;
        y -= 5; //sama kek diatas cuma dikurang ygy
        System.out.println("Nilai Setelah -= : " + y );

        int z = 30;
        z *= 2; //sama kek di atas juga cuman di dikali makannya jadi 60
        System.out.println("Nilai Setelah *= : " + z);

        int k = 30;
        k /= 2; //ini pun sama,30 dibagi 2 jadi 15 cuy,jgn bingung kali
        System.out.println("Nilai Setelah /= : " + k);

        int q = 30;
        q %= 2; //klo ini module namanya,kurang ngerti sih tapi jadi 0 hasilnya
        System.out.println("Nilai Setelah %= : " + q);

    }
}
