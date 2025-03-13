import java.util.Scanner;

public class MainLimasSegiEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Membuat array of object dengan 5 objek LimasSegiEmpat
        LimasSegiEmpat[] limasArray = new LimasSegiEmpat[5];

        // Mengisi array dengan objek LimasSegiEmpat menggunakan loop
        for (int i = 0; i < limasArray.length; i++) {
            System.out.println("Masukkan sisi dan tinggi untuk limas segi empat ke-" + (i + 1) + ":");
            double sisi = input.nextDouble();
            double tinggi = input.nextDouble();

            limasArray[i] = new LimasSegiEmpat(sisi, tinggi);
        }

        // Menghitung total volume dan menampilkan volume setiap limas menggunakan enhanced loop
        double totalVolume = 0;
        System.out.println("\nVolume setiap limas segi empat:");
        for (int i = 0; i < limasArray.length; i++) {
            System.out.println("Limas ke-" + (i + 1) + ": " + limasArray[i].getVolume());
            System.out.println("----------------------");
        }

        // Menggunakan enhanced loop untuk menghitung total volume
        for (LimasSegiEmpat limas : limasArray) {
            totalVolume += limas.getVolume();
        }

        // Menghitung rata-rata volume
        double rataRataVolume = totalVolume / limasArray.length;

        // Menampilkan rata-rata volume
        System.out.println("Rata-rata volume dari limas segi empat: " + rataRataVolume);
    }
}
