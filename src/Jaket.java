
public class Jaket {

    public String produk[] = {"Jaket A", "Jaket B", "Jaket C"};
    public final int hargaSatuan[] = {100000, 125000, 175000};
    public final int diskon[] = {5000, 5000, 15000};
    public int jumlah[];
    public int harga[] = new int[3];
    public int total = 0;

    public void pesan(int n[]) {
        jumlah = n;
        for (int i = 0; i < 3; i++) {
            if (n[i] > 100) {
                harga[i] = (hargaSatuan[i] * n[i]) - (diskon[i] * n[i]);
            } else {
                harga[i] = (hargaSatuan[i] * n[i]);
            }
            total += harga[i];
        }
    }

    public void tampilkanProduk() {
        System.out.println("Daftar Harga Jaket");
        System.out.println("Nama\tHarga");
        for (int i = 0; i < 3; i++) {
            System.out.println(produk[i] + "\tIDR " + hargaSatuan[i]);
        }
        System.out.println("Pesan > 100 dapat diskon%");
        System.out.println("----------------------------");
    }

    public void cetakHarga() {
        System.out.println("------Struk Pembelian-------");
        System.out.println("Nama\t Jml\tHarga(IDR)");
        for (int i = 0; i < 3; i++) {
            System.out.println(produk[i] + "\t " + jumlah[i] + "\t" + harga[i]);
        }
        System.out.println("----------------------------");
        System.out.println("Total Harga: IDR " + total);
    }
}
