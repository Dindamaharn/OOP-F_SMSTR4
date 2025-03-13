import java.util.Scanner;

public class MainTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Membuat array of object dengan 5 objek Tabung
        Tabung[] tabungArray = new Tabung[5];

        // Mengisi array dengan objek Tabung menggunakan loop
        for (int i = 0; i < tabungArray.length; i++) {
            System.out.println("Masukkan radius dan tinggi untuk tabung ke-" + (i + 1) + ":");
            double radius = input.nextDouble();
            double tinggi = input.nextDouble();

            tabungArray[i] = new Tabung(radius, tinggi);
        }

        // Menghitung total volume dan menampilkan volume setiap tabung menggunakan enhanced loop
        double totalVolume = 0;
        System.out.println("\nVolume setiap tabung:");
        for (int i = 0; i < tabungArray.length; i++) {
            System.out.println("Tabung ke-" + (i + 1) + ": " + tabungArray[i].getVolume());
            System.out.println("----------------------");
        }

        // Menggunakan enhanced loop untuk menghitung total volume
        for (Tabung tabung : tabungArray) {
            totalVolume += tabung.getVolume();
        }

        // Menghitung rata-rata volume
        double rataRataVolume = totalVolume / tabungArray.length;

        // Menampilkan rata-rata volume
        System.out.println("Rata-rata volume dari tabung: " + rataRataVolume);
    }
}
