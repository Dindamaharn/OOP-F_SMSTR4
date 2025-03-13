public class MainBola {
    public static void main(String[] args) {
        Bola bola1 = new Bola();
        bola1.SetRadius(5);
        bola1.ComputeAndSetVolume();

        System.out.println("Volume Bola: " + bola1.GetVolume());
        System.out.println("---------------------------------");

        Bola bola2 = new Bola();
        bola2.SetRadius(9);
        bola2.ComputeAndSetVolume();

        System.out.println("Volume Bola: " + bola2.GetVolume());
        System.out.println("---------------------------------");

        Bola bola3 = new Bola();
        bola3.SetRadius(12);
        bola3.ComputeAndSetVolume();

        System.out.println("Volume Bola: " + bola3.GetVolume());
    }
}
