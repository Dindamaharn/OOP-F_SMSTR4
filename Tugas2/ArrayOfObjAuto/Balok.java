public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double volume;

    // Constructor (menggunakan semua atribut)
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        computeAndSetVolume();
    }

    // Setter untuk panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
        computeAndSetVolume(); 
    }

    // Setter untuk lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
        computeAndSetVolume();  
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        computeAndSetVolume();  
    }

    // Method untuk mengambil nilai panjang
    public double getPanjang() {
        return panjang;  // Mengembalikan panjang, bukan volume
    }

    // Method untuk mengambil nilai lebar
    public double getLebar() {
        return lebar;  // Mengembalikan lebar, bukan volume
    }

    // Method untuk mengambil nilai tinggi
    public double getTinggi() {
        return tinggi;  // Mengembalikan tinggi, bukan volume
    }

    // Method untuk menghitung dan set volume
    public void computeAndSetVolume() {
        this.volume = panjang * lebar * tinggi;
    }

    // Method untuk mengambil nilai volume
    public double getVolume() {
        return volume;
    }
}
