public class Tabung {
    private double radius;
    private double tinggi;
    private double volume;

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void ComputeAndSetVolume() {
        this.volume = 3.14 * radius * radius * tinggi;
    }

    public double GetVolume() {
        return this.volume;
    }
}
