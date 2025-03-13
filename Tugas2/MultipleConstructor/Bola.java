public class Bola {
    private double radius;
    private double volume;

    // Constructor tanpa parameter (nilai default 0 untuk radius)
    public Bola() {
        this.radius = 0;
        this.volume = 0;
    }

    // Constructor dengan parameter radius
    public Bola(double radius) {
        this.radius = radius;
        ComputeAndSetVolume();
    }

    // Method untuk set radius
    public void SetRadius(double radius) {
        this.radius = radius;
        ComputeAndSetVolume();
    }

    // Method untuk menghitung dan set volume
    public void ComputeAndSetVolume() {
        this.volume = (4.0 / 3.0) * 3.14 * radius * radius * radius; // Menghitung volume bola
    }

    // Method untuk mengambil nilai volume
    public double GetVolume() {
        return this.volume;
    }
}