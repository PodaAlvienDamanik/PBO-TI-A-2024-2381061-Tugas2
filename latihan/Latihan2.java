package latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        int[] bilangan = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i< bilangan.length; i++){
            System.out.println("Masukkan Bilangan ke- " + 1 + " :");
            bilangan [1] = input.nextInt();
        }

        int largetNum = bilangan [0];
        for (int i = 1; i < bilangan.length; i++){
            if (largetNum < bilangan[i]){
                largetNum = bilangan[i];
            }
        }
        System.out.println(largetNum);
        //mencari nilai maksimum dari 3 bilangan

    }
}
