public class MainBola {
    public static void main(String[] args) {
        // Menggunakan constructor tanpa parameter
        Bola bola1 = new Bola();
        bola1.SetRadius(7.0);
        System.out.println("Volume bola1: " + bola1.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor dengan parameter
        Bola bola2 = new Bola(5.0);
        System.out.println("Volume bola2: " + bola2.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor dengan parameter lainnya
        Bola bola3 = new Bola(6.5);
        System.out.println("Volume bola3: " + bola3.GetVolume());
        System.out.println("----------------------------------");
    }
}
