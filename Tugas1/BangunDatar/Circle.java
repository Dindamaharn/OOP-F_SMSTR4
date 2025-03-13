public class Circle {
    private double radius;
    
    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getter untuk radius
    public double getRadius() {
        return radius;
    }
    
    // Metode untuk menghitung luas circle
    public double getLuas() {
        // Rumus luas circle: π * radius * radius
        double luas = 3.14 * this.radius * this.radius;
        return luas;
    }
    
    // Metode untuk menghitung keliling circle
    public double getKeliling() {
        // Rumus keliling circle: 2 * π * radius
        double keliling = 3.14 * (2 * this.radius);
        return keliling;
    }
}
