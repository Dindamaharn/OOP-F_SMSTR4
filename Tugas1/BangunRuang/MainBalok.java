public class MainBalok {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        balok1.SetPanjang(2);
        balok1.SetLebar(3);
        balok1.SetTinggi(4);
        balok1.ComputeAndSetVolume();

        System.out.println("Volume Balok: " + balok1.GetVolume());
        System.out.println("----------------------------------");

        Balok balok2 = new Balok();
        balok2.SetPanjang(4);
        balok2.SetLebar(4);
        balok2.SetTinggi(6);
        balok2.ComputeAndSetVolume();

        System.out.println("Volume Balok: " + balok2.GetVolume());
        System.out.println("----------------------------------");

        Balok balok3 = new Balok();
        balok3.SetPanjang(4);
        balok3.SetLebar(5);
        balok3.SetTinggi(6);
        balok3.ComputeAndSetVolume();

        System.out.println("Volume Balok: " + balok3.GetVolume());
    }

}
