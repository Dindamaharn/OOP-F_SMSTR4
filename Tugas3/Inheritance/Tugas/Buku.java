package Tugas;

public class Buku extends Koleksi{
    //atribute
    String penulis;

    //constructor 1 dengan parameter
    public Buku(String judul, String penulis, String penerbit, int tahun) {
        super(judul, penerbit, tahun); //memanggil constructor kelas koleksi
        this.penulis = penulis;
    }

    //constructor 2 tanpa parameter
    public Buku() {
        super("Judul Tidak Diketahui", "Penerbit Tidak Diketahui", 0); // nilai default
        this.penulis = "Tidak Diketahui"; // nilai default untuk penulis
    }

    // Overriding method toString untuk menampilkan informasi Buku
    public String toString() {
        return super.toString() + "\nPenulis: " + penulis;
    }
}
