package Tugas;

public class Skripsi extends Buku {
    //atribute
    private String NPM;
    
    //constructor 1 dengan parameter
    public Skripsi(String NPM, String judul, String penulis, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun); //memanggil constructor kelas buku
        this.NPM = NPM;
    }

    // Constructor 2: Tanpa parameter (semua nilai default)
    public Skripsi() {
        super("Judul Tidak Diketahui", "Penulis Tidak Diketahui", "Penerbit Tidak Diketahui", 0); // nilai default
        this.NPM = "NPM Tidak Diketahui"; // nilai default untuk NPM
    }
    
     // Overriding method toString untuk menampilkan informasi Skripsi
    public String toString() {
        return super.toString() + "\nNPM: " + NPM;
    }
}
