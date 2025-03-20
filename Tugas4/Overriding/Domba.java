public class Domba extends Herbivora {
    private String jenisWol; //atribute yg hanya diakses private pada kelas domba

    public Domba(String nama, int umur, double berat, String jenisMakanan, String jenisWol) {
        super(nama, umur, berat, jenisMakanan);//memanggil constructor dari superclass herbivora
        this.jenisWol = jenisWol;
    }

    //override suara khusus domba "mbee"
    @Override
    public void suara() {
        System.out.println(nama + " mengembik dengan suara 'Mbeee...'");
    }

    //method khusus cetak informasi jenis wol domba
    public void produksiWol() {
        System.out.println(nama + " menghasilkan wol jenis " + jenisWol);
    }

    //cetak otomatis ketambahan atribute jenis wol
    @Override
    public String toString() {
        return "Domba:\n" +
                "Nama         : " + nama + "\n" +
                "Umur         : " + umur + " tahun\n" +
                "Berat        : " + berat + " kg\n" +
                "Jenis Makanan: " + jenisMakanan + "\n" +
                "Jenis Wol    : " + jenisWol;
    }
}
