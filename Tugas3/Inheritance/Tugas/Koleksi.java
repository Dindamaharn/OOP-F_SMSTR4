package Tugas;

public class Koleksi{
    //atribut 
    String judul;
    String penerbit;
    int tahun;

    //constructor 1 dengan parameter
    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    //constructor 2 tanpa parameter
    public Koleksi() {
        this.judul = "Tidak diketahui";
        this.penerbit = "Tidak diketahui";
        this.tahun = 0;
    }

    // Overriding method toString untuk menampilkan informasi Koleksi
    public String toString() {
        return "Judul: " + judul + "\nPenerbit: " + penerbit + "\nTahun: " + tahun;
    }
    
}