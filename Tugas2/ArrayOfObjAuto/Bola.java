public class Bola {
    private double radius;
    private double volume;

    // Constructor dengan satu atribut (radius)
    public Bola(double radius) {
        this.radius = radius;
        computeAndSetVolume();
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
        computeAndSetVolume();
    }

     // Method untuk mengambil nilai radius
    public double getRadius() {
        return this.radius;
    }    

    // Method untuk menghitung dan set volume bola
    public void computeAndSetVolume() {
        this.volume = (4.0 / 3.0) * 3.14 * (radius * radius * radius);  
    }

    // Method untuk mengambil nilai volume
    public double getVolume() {
        return this.volume;
    }
}
