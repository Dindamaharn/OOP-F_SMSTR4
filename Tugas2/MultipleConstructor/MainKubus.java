public class MainKubus {

    public static void main(String[] args) {
        // Menggunakan constructor tanpa parameter
        Kubus kubus1 = new Kubus();
        kubus1.SetSisi(3.5);
        System.out.println("Volume kubus1: " + kubus1.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor dengan parameter sisi
        Kubus kubus2 = new Kubus(4.2);
        System.out.println("Volume kubus2: " + kubus2.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor dengan parameter sisi
        Kubus kubus3 = new Kubus(5.7);
        System.out.println("Volume kubus3: " + kubus3.GetVolume());
        System.out.println("----------------------------------");
    }
}