public class Elipse {
    private double semiMajorAxis, semiMinorAxis;

    // Setter untuk semiMajorAxis
    public void setsemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    // Setter untuk semiMinorAxis
    public void setsemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    // Getter untuk semiMajorAxis
    public double getsemiMajorAxis() {
        return semiMajorAxis;
    }

    // Getter untuk semiMinorAxis
    public double getsemiMinorAxis() {
        return semiMinorAxis;
    }

    // Metode untuk menghitung luas elips
    public double getLuas() {
        // Rumus luas elips: π * semiMajorAxis * semiMinorAxis
        double luas = 3.14 * this.semiMajorAxis * this.semiMinorAxis;
        return luas;
    }

    public double getKeliling() {
        // keliling ≈ π [ 3(semiMajorAxis + semiMinorAxis) - sqrt((3semiMajorAxis + semiMinorAxis)(semiMajorAxis + 3semiMinorAxis)) ]
        double keliling = 3.14 * (3 * (semiMajorAxis + semiMinorAxis) - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
        return keliling;
    }
}
