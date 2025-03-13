public class LimasSegiEmpat {
    private double sisi;
    private double tinggi;
    private double volume;

    public void SetSisi(double sisi) {
        this.sisi = sisi;
    }

    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void ComputeAndSetVolume() {
        double luasAlas = sisi * sisi;
        this.volume = (luasAlas * tinggi) / 3;
    }

    public double GetVolume() {
        return this.volume;
    }
}
