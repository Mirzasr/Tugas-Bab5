
public class Operasi {

    public static void penjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil + "\n");
    }

    public static void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil pengurangan: " + hasil + "\n");
    }

    public void perkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian: " + hasil + "\n");
    }

    public void pembagian(double a, double b) {
        double hasil = a / b;
        System.out.println("Hasil pembagian: " + hasil + "\n");
    }

    public void sederhana(int pemb, int peny) {
        int temp, bil1, bil2;
        if (peny == 0) {
            return;
        }
        bil1 = (pemb < peny) ? peny : pemb;
        bil2 = (pemb < peny) ? pemb : peny;

        while (bil2 != 0) {
            temp = bil1 % bil2;
            bil1 = bil2;
            bil2 = temp;
        }
        pemb /= bil1;
        peny /= bil1;
        System.out.println("Pecahahan setelah disederhanakan: " + pemb + "/" + peny);
    }
}
