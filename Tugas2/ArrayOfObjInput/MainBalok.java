import java.util.Scanner;

public class MainBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Membuat array of object dengan 5 objek Balok
        Balok[] balokArray = new Balok[5];

        // Mengisi array dengan objek Balok menggunakan loop
        for (int i = 0; i < balokArray.length; i++) {
            System.out.println("Masukkan panjang, lebar, dan tinggi untuk balok ke-" + (i + 1) + ":");
            double panjang = input.nextDouble();
            double lebar = input.nextDouble();
            double tinggi = input.nextDouble();

            balokArray[i] = new Balok(panjang, lebar, tinggi);
        }

        // Menghitung total volume dan menampilkan volume setiap balok menggunakan enhanced loop
        double totalVolume = 0;
        System.out.println("\nVolume setiap balok:");
        for (int i = 0; i < balokArray.length; i++) {
            System.out.println("Balok ke-" + (i + 1) + ": " + balokArray[i].getVolume());
            System.out.println("----------------------"); 
        }

        // Menggunakan enhanced loop untuk menghitung total volume
        for (Balok balok : balokArray) {
            totalVolume += balok.getVolume();
        }

        // Menghitung rata-rata volume
        double rataRataVolume = totalVolume / balokArray.length;

        // Menampilkan rata-rata volume
        System.out.println("Rata-rata volume dari balok: " + rataRataVolume);
    }
}
