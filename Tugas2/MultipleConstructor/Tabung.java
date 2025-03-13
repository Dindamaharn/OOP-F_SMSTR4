public class Tabung {
    private double radius;
    private double tinggi;
    private double volume;

    // Constructor tanpa parameter (nilai default 0 untuk radius dan tinggi)
    public Tabung() {
        this.radius = 0;
        this.tinggi = 0;
        this.volume = 0;
    }

    // Constructor dengan parameter radius dan tinggi
    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
        ComputeAndSetVolume();
    }

    // Method untuk set radius
    public void SetRadius(double radius) {
        this.radius = radius;
        ComputeAndSetVolume();
    }

    // Method untuk set tinggi
    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
        ComputeAndSetVolume();
    }

    // Method untuk menghitung dan set volume
    public void ComputeAndSetVolume() {
        this.volume = 3.14 * radius * radius * tinggi; // Menghitung volume tabung
    }

    // Method untuk mengambil nilai volume
    public double GetVolume() {
        return this.volume;
    }
}