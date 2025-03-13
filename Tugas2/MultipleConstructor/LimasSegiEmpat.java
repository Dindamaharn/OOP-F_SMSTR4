public class LimasSegiEmpat {
    private double sisi;
    private double tinggi;
    private double volume;

    // Constructor tanpa parameter (nilai default sisi dan tinggi = 0)
    public LimasSegiEmpat() {
        this.sisi = 0;
        this.tinggi = 0;
        this.volume = 0;
    }

    // Constructor dengan parameter sisi dan tinggi
    public LimasSegiEmpat(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        ComputeAndSetVolume();
    }

    // Method untuk set sisi
    public void SetSisi(double sisi) {
        this.sisi = sisi;
        ComputeAndSetVolume();
    }

    // Method untuk set tinggi
    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
        ComputeAndSetVolume();
    }

    // Method untuk menghitung dan set volume
    public void ComputeAndSetVolume() {
        double luasAlas = sisi * sisi; // Menghitung luas alas
        this.volume = (luasAlas * tinggi) / 3; // Menghitung volume limas
    }

    // Method untuk mengambil nilai volume
    public double GetVolume() {
        return this.volume;
    }
}