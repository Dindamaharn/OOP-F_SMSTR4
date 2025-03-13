public class MainTabung {
    public static void main(String[] args) {
        // Menggunakan constructor tanpa parameter
        Tabung tabung1 = new Tabung();
        tabung1.SetRadius(7.0);
        tabung1.SetTinggi(14.0);
        System.out.println("Volume tabung1: " + tabung1.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor dengan parameter
        Tabung tabung2 = new Tabung(5.0, 10.0);
        System.out.println("Volume tabung2: " + tabung2.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor dengan parameter lainnya
        Tabung tabung3 = new Tabung(6.5, 12.5);
        System.out.println("Volume tabung3: " + tabung3.GetVolume());
        System.out.println("----------------------------------");
    }
}
