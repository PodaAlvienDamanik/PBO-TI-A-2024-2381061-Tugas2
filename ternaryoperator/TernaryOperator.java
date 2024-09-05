package ternaryoperator;

import com.sun.security.jgss.GSSUtil;

public class TernaryOperator {
    public static void main(String[] args) {
        int nilai = 80;
        String hasil = (nilai >=75) ? "Lulus" : "Tidak Lulus";
        System.out.println(hasil);

        if (nilai > 75){
            System.out.println("Kamu lulus");
        }else {
            System.out.println("Tidak Lulus");
        }
    }
}
