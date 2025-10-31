/**
 * Kelas Pemesanan menangani proses pemesanan tiket film.
 * Menghitung total harga tiket termasuk diskon jika berlaku.
 */
public class Pemesanan {

    public static final int BATAS_DISKON = 100000;
    public static final double DISKON = 0.10;

    private Film film;
    private int jumlahTiket;
    private boolean memberBioskop;

    /**
     * Konstruktor untuk membuat pemesanan tiket.
     *
     * @param film objek Film yang dipesan
     * @param jumlahTiket jumlah tiket yang dibeli
     * @param memberBioskop apakah konsumen memiliki membership
     */
    public Pemesanan(Film film, int jumlahTiket, boolean memberBioskop) {
        this.film = film;
        this.jumlahTiket = jumlahTiket;
        this.memberBioskop = memberBioskop;
    }

    /**
     * Menghitung total biaya pembelian tiket dengan diskon jika syarat terpenuhi.
     *
     * @return total harga yang harus dibayar
     */
    public double hitungTotal() {
        double total = film.getHarga() * jumlahTiket;

        if (total > BATAS_DISKON && memberBioskop) {
            total -= total * DISKON;
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Film : " + film.getJudul());
        System.out.println("Jumlah tiket : " + jumlahTiket);
        System.out.println("Member : " + (memberBioskop ? "Ya" : "Tidak"));
        System.out.println("Total Bayar : Rp " + hitungTotal());

        if ((film.getHarga() * jumlahTiket) > BATAS_DISKON && memberBioskop) {
            System.out.println("Anda mendapatkan diskon 10%");
        }
    }
}