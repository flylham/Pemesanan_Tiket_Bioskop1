/**
 * Kelas Film merepresentasikan data sebuah film di bioskop.
 * Menyimpan judul film dan harga tiketnya.
 */
public class Film {
    private String judul;
    private double harga;

    /**
     * Konstruktor untuk membuat objek Film.
     *
     * @param judul judul film
     * @param harga harga tiket film
     */
    public Film(String judul, double harga) {
        this.judul = judul;
        this.harga = harga;
    }

    /**
     * Mengambil judul film.
     * @return judul film
     */
    public String getJudul() {
        return judul;
    }

    /**
     * Setter untuk mengganti judul film.
     * @param judul judul film baru
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * Mengambil harga tiket film.
     * @return harga tiket
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Setter untuk mengganti harga tiket film.
     * @param harga harga baru
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
}