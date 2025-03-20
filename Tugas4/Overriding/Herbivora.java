public class Herbivora extends Hewan {
    //deklarasi atribute protected hanya bisa diakses oleh subclass (kelas turunan)
    protected String jenisMakanan;//atribute tambahan

    //constructor
    public Herbivora(String nama, int umur, double berat, String jenisMakanan) {
        super(nama, umur, berat); //memanggil constructir dari superclass hewan
        this.jenisMakanan = jenisMakanan;
    }

    //override suara khusus utk hewan herbivora
    @Override
    public void suara() {
        System.out.println(nama + " adalah herbivora dan mengeluarkan suara lembut.");
    }

    public void jenisMakanan() {
        System.out.println(nama + " adalah herbivora yang makan " + jenisMakanan);
    }

    //cetak otomatis informasi, ketambhaan atribute dalam kelas ini jenis makanan
    @Override
    public String toString() {
        return "Herbivora:\n" +
                "Nama         : " + nama + "\n" +
                "Umur         : " + umur + " tahun\n" +
                "Berat        : " + berat + " kg\n" +
                "Jenis Makanan: " + jenisMakanan;
    }
}
