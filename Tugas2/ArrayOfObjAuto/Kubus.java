public class Kubus {
    private double sisi;
    private double volume;

    // Constructor (menggunakan atribut sisi)
    public Kubus(double sisi) {
        this.sisi = sisi;
        computeAndSetVolume();
    }

    // Setter untuk sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
        computeAndSetVolume();
    }

    // Method getter untuk sisi
    public double getSisi() {
        return sisi;
    }

    // Method untuk menghitung dan set volume
    public void computeAndSetVolume() {
        this.volume = sisi * sisi * sisi;
    }

    // Method untuk mengambil nilai volume
    public double getVolume() {
        return volume;
    }
}
