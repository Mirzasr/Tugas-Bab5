
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
}
