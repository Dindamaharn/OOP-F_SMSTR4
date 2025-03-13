public class Kubus {
    private double sisi;
    private double volume;

    // Constructor tanpa parameter (nilai default sisi = 0)
    public Kubus() {
        this.sisi = 0;
        this.volume = 0;
    }

    // Constructor dengan parameter sisi
    public Kubus(double sisi) {
        this.sisi = sisi;
        ComputeAndSetVolume();
    }

    // Method untuk set sisi
    public void SetSisi(double sisiBaru) {
        this.sisi = sisiBaru;
        ComputeAndSetVolume();
    }

    // Method untuk menghitung dan set volume
    public void ComputeAndSetVolume() {
        this.volume = Math.pow(sisi, 3);
    }

    // Method untuk mengambil nilai volume
    public double GetVolume() {
        return this.volume;
    }
}