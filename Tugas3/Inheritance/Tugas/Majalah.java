package Tugas;

public class Majalah extends Koleksi {
    //atribute
    String edisi;

    //constructor 1 dengan parameter
    public Majalah(String judul, String edisi, String penerbit, int tahun) {
        super(judul, penerbit, tahun); //memanggil constructor kelas koleksi
        this.edisi = edisi;
    }

    // Constructor 2: Tanpa parameter (semua nilai default)
    public Majalah() {
        super("Judul Tidak Diketahui", "Penerbit Tidak Diketahui", 0); // nilai default
        this.edisi = "Edisi Tidak Diketahui"; // nilai default untuk edisi
    }
    
    // Overriding method toString untuk menampilkan informasi Majalah
    public String toString() {
        return super.toString() + "\nEdisi: " + edisi;
    }
}
