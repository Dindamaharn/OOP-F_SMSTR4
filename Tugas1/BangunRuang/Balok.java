public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int volume;

    public void SetPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void SetLebar(int lebar) {
        this.lebar = lebar;
    }

    public void SetTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void ComputeAndSetVolume() {
        this.volume = panjang * lebar * tinggi;
    }

    public int GetVolume() {
        return this.volume;
    }
}
