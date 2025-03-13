public class LimasSegiEmpat {
    private double sisi;
    private double tinggi;
    private double volume;

    // Constructor (menggunakan semua atribut)
    public LimasSegiEmpat(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        computeAndSetVolume();
    }

    // Setter untuk sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
        computeAndSetVolume(); 
    }

    // Getter untuk sisi
    public double getSisi() {
        return sisi;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        computeAndSetVolume();  
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }
    
    // Method untuk menghitung dan set volume
    public void computeAndSetVolume() {
        double luasAlas = sisi * sisi; // Menghitung luas alas
        this.volume = (luasAlas * tinggi) / 3; // Menghitung volume limas
    }

    // Method untuk mengambil nilai volume
    public double getVolume() {
        return volume;
    }
}
