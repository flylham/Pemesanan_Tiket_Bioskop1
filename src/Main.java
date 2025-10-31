import java.util.Scanner;
/**
 * Kelas Main sebagai entry point program pemesanan tiket bioskop.
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Pemesanan Tiket Bioskop ===");
        System.out.print("Masukkan judul film: ");
        String judul = input.nextLine();

        System.out.print("Masukkan harga tiket: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = input.nextInt();

        System.out.print("Apakah Anda member? (true/false): ");
        boolean member = input.nextBoolean();

        Film film = new Film(judul, harga);
        Pemesanan pesanan = new Pemesanan(film, jumlah, member);

        System.out.println("Total harga yang harus dibayar: Rp " + pesanan.hitungTotal());
        pesanan.cetakStruk();
    }
}