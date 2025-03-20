public class Hewan {
    //deklarasi atribute protected hanya bisa diakses oleh subclass (kelas turunan)
    protected String nama;
    protected int umur;
    protected double berat;

    //constructor untuk iniasialisasi nama, umur, dan berat
    public Hewan(String nama, int umur, double berat) {
        this.nama = nama;
        this.umur = umur;
        this.berat = berat;
    }

    //method suara yang akan dicetak oleh semua hewan, bisa di override
    public void suara() {
        System.out.println(nama + " mengeluarkan suara.");
    }

    // Overloading method makan() 1 parameter
    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan);
    }

    // Overloading method makan() 2 parameter
    public void makan(String makanan, int porsi) {
        System.out.println(nama + " sedang makan " + makanan + " sebanyak " + porsi + " porsi.");
    }

    // Mencetak informasi ttg hewan
    public void info() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun, Berat: " + berat + " kg");
    }

    // Method toString() untuk mencetak deskripsi hewan secara otomatis ketika objek dipanggil dalam konteks string
    @Override
    public String toString() {
        return "Hewan:\n" +
                "Nama         : " + nama + "\n" +
                "Umur         : " + umur + " tahun\n" +
                "Berat        : " + berat + " kg";
    }
}
