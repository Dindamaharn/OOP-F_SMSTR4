public class MainTabung {
    public static void main(String[] args) {
        Tabung tabung1 = new Tabung();
        tabung1.SetRadius(7);
        tabung1.SetTinggi(10);
        tabung1.ComputeAndSetVolume();

        System.out.println("Volume Tabung: " + tabung1.GetVolume());
        System.out.println("------------------------------------");

        Tabung tabung2 = new Tabung();
        tabung2.SetRadius(5);
        tabung2.SetTinggi(6);
        tabung2.ComputeAndSetVolume();

        System.out.println("Volume Tabung: " + tabung2.GetVolume());
        System.out.println("------------------------------------");

        Tabung tabung3 = new Tabung();
        tabung3.SetRadius(8);
        tabung3.SetTinggi(3);
        tabung3.ComputeAndSetVolume();

        System.out.println("Volume Tabung: " + tabung3.GetVolume());
        System.out.println("------------------------------------");
    }
}
