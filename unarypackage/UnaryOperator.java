package unarypackage;

public class UnaryOperator {
    public static void main(String[] args) {
        int y = 20;
        boolean benar = true;

        System.out.println(-y);
        System.out.println(+y);
        System.out.println();

        System.out.println("Pre-Increment:Tambah Dulu baru di cetak");
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y);
        System.out.println();

        System.out.println("Post-Increment:Cetak dulu baru di tambah");
        System.out.println(y);
        System.out.println(y++);
        System.out.println(y);
        System.out.println();

        System.out.println("Gabungan ygy");
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y++);
        System.out.println(y);

    }
}
