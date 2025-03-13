public class Kubus {
    private int sisi;
    private int volume;

    public void SetSisi(int sisiBaru) {
        this.sisi = sisiBaru;
    }

    public void ComputeAndSetVolume() {
        this.volume = sisi * sisi * sisi;
    }

    public int GetVolume() {
        return this.volume;
    }
}

