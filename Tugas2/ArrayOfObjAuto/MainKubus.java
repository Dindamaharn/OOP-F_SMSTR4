public class MainKubus {
    public static void main(String[] args) {
        // Membuat array of object dengan 5 objek Kubus
        Kubus[] kubusArray = new Kubus[5];

        // Mengisi array dengan objek Kubus menggunakan loop
        for (int i = 0; i < kubusArray.length; i++) {
            double sisi = i + 2; // Memberikan sisi yang berbeda untuk setiap kubus
            kubusArray[i] = new Kubus(sisi);
        }

        // Menghitung total volume dan menampilkan sisi serta volume setiap kubus
        double totalVolume = 0;
        System.out.println("\nSisi dan volume setiap kubus:");
        for (int i = 0; i < kubusArray.length; i++) {
            System.out.println("Kubus ke-" + (i + 1) + ":");
            System.out.println("Sisi: " + kubusArray[i].getSisi());
            System.out.println("Volume: " + kubusArray[i].getVolume());
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
