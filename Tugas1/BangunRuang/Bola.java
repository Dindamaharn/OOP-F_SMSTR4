public class Bola {
    private double radius;
    private double volume;

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public void ComputeAndSetVolume() {
        this.volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }

    public double GetVolume() {
        return this.volume;
    }
}