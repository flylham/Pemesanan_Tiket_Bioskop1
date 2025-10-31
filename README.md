# Program Pemesanan Tiket Bioskop

Program ini dibuat untuk memenuhi Tugas Praktikum Java.  
Program memungkinkan pengguna melakukan pemesanan tiket bioskop, menghitung total biaya, dan mencetak struk pembayaran.

## 📝 Deskripsi Program
Program ini menerima input dari pengguna berupa:
- Judul film
- Harga tiket
- Jumlah tiket
- Status member bioskop

Program akan menghitung total pembayaran.  
Jika total pembelian tiket lebih dari **Rp 100.000** dan pengguna adalah **member**, maka diberikan **diskon 10%**.

Selain itu, terdapat fitur tambahan berupa **cetak struk pembelian**.

## 📂 Struktur File
| File | Deskripsi |
|------|----------|
| `Film.java` | Menyimpan data film |
| `Pemesanan.java` | Menghitung total biaya + fitur cetak struk |
| `Main.java` | Input user & menjalankan program |

## ✨ Fitur Program
| Fitur | Deskripsi |
|-------|----------|
| Input data film | User memasukkan informasi film |
| Hitung total harga | Menghitung total tiket dengan diskon |
| Cek member | Diskon jika memenuhi syarat |
| ✅ Cetak Struk *(Fitur Baru)* | Menampilkan struk pembelian |