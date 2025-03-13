public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double volume;

    // Constructor 1 (menggunakan semua atribut)
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        ComputeAndSetVolume();
    }

    // Constructor 2 (tanpa parameter, nilai default 0)
    public Balok() {
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
        this.volume = 0;
    }

    // Method untuk set panjang
    public void SetPanjang(double panjang) {
        this.panjang = panjang;
        ComputeAndSetVolume();
    }

    // Method untuk set lebar
    public void SetLebar(double lebar) {
        this.lebar = lebar;
        ComputeAndSetVolume();
    }

    // Method untuk set tinggi
    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
        ComputeAndSetVolume();
    }

    // Method untuk menghitung dan set volume
    public void ComputeAndSetVolume() {
        this.volume = panjang * lebar * tinggi;
    }

    // Method untuk mengambil nilai volume
    public double GetVolume() {
        return volume;
    }
}
