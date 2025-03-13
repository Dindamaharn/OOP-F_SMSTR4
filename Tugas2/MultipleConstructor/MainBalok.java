public class MainBalok {
    public static void main(String[] args) {
        // Menggunakan constructor dengan parameter
        Balok balok1 = new Balok(3, 4, 5);
        System.out.println("Volume balok1: " + balok1.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor tanpa parameter
        Balok balok2 = new Balok();
        balok2.SetPanjang(2);
        balok2.SetLebar(3);
        balok2.SetTinggi(4);
        System.out.println("Volume balok2: " + balok2.GetVolume());
        System.out.println("----------------------------------");

        // Menambahkan balok ke-3
        Balok balok3 = new Balok();
        balok3.SetPanjang(5.5);
        balok3.SetLebar(6.3);
        balok3.SetTinggi(7.2);
        System.out.println("Volume balok3: " + balok3.GetVolume());
        System.out.println("----------------------------------");
    }
}
