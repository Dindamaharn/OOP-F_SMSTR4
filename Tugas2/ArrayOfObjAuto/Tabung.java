public class Tabung {
    private double radius;
    private double tinggi;
    private double volume;

    // Constructor dengan parameter radius dan tinggi
    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
        computeAndSetVolume();
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
        computeAndSetVolume();
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        computeAndSetVolume();
    }

    // Method untuk mengambil nilai radius
    public double getRadius() {
        return radius;
    }

    // Method untuk mengambil nilai tinggi
    public double getTinggi() {
        return tinggi;
    }
    
    // Method untuk menghitung dan set volume
    public void computeAndSetVolume() {
        this.volume = 3.14 * radius * radius * tinggi; // Menghitung volume tabung
    }

    // Method untuk mengambil nilai volume
    public double getVolume() {
        return volume;
    }
}
