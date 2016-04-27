
import java.util.Scanner;

public class MainJaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket p1 = new Jaket();
        int a[] = new int[3];
        System.out.println("--------CV.Labkomdas--------");
        p1.tampilkanProduk();
        for (int i = 0; i < 3; i++) {
            System.out.print("Pesan jumlah " + p1.produk[i] + " : ");
            a[i] = in.nextInt();
        }
        p1.pesan(a);
        System.out.println("----------------------------");
        p1.cetakHarga();
        System.out.println("Terima kasih telah belanja di CV.Labkomdas..");
    }
}
