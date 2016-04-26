
import java.util.Scanner;

public class MainOperasi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Penjumlahan");
        System.out.print("Masukkan bilangan 1: ");
        int bil1 = in.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = in.nextInt();
        Operasi.penjumlahan(bil1, bil2);

        System.out.println("Pengurangan");
        System.out.print("Masukkan bilangan 1: ");
        bil1 = in.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = in.nextInt();
        Operasi.pengurangan(bil1, bil2);

        Operasi op = new Operasi();

        System.out.println("Perkalian");
        System.out.print("Masukkan bilangan 1: ");
        Double nil1 = in.nextDouble();
        System.out.print("Masukkan bilangan 2: ");
        Double nil2 = in.nextDouble();
        op.perkalian(nil1, nil2);

        System.out.println("Pembagian");
        System.out.print("Masukkan bilangan 1: ");
        nil1 = in.nextDouble();
        System.out.print("Masukkan bilangan 2: ");
        nil2 = in.nextDouble();
        op.pembagian(nil1, nil2);

        System.out.println("Penyederhanaan Pecahan");
        System.out.print("Masukkan pembilang: ");
        int pemb = in.nextInt();
        System.out.print("Masukkan penyebut: ");
        int peny = in.nextInt();
        System.out.println("Pecahan sebelum disederhanakan: " + pemb + "/" + peny);
        op.sederhana(pemb, peny);
    }
}
