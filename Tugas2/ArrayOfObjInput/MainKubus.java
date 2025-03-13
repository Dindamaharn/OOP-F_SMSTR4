import java.util.Scanner;

public class MainKubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Membuat array of object dengan 5 objek Kubus
        Kubus[] kubusArray = new Kubus[5];

        // Mengisi array dengan objek Kubus menggunakan loop
        for (int i = 0; i < kubusArray.length; i++) {
            System.out.println("Masukkan sisi untuk kubus ke-" + (i + 1) + ":");
            double sisi = input.nextDouble();

            kubusArray[i] = new Kubus(sisi);
        }

        // Menghitung total volume dan menampilkan volume setiap kubus
        double totalVolume = 0;
        System.out.println("\nVolume setiap kubus:");
        for (int i = 0; i < kubusArray.length; i++) {
            System.out.println("Kubus ke-" + (i + 1) + ": " + kubusArray[i].getVolume());
            System.out.println("----------------------");
        }

        // Menggunakan enhanced loop untuk menghitung total volume
        for (Kubus kubus : kubusArray) {
            totalVolume += kubus.getVolume();
        }

        // Menghitung rata-rata volume
        double rataRataVolume = totalVolume / kubusArray.length;

        // Menampilkan rata-rata volume
        System.out.println("Rata-rata volume dari kubus: " + rataRataVolume);
    }
}