public class MainLimasSegiEmpat {
    public static void main(String[] args) {
        // Membuat array of object dengan 5 objek LimasSegiEmpat
        LimasSegiEmpat[] limasArray = new LimasSegiEmpat[5];

        // Mengisi array dengan objek LimasSegiEmpat menggunakan loop secara otomatis
        for (int i = 0; i < limasArray.length; i++) {
            double sisi = i + 2;  
            double tinggi = i + 3;

            limasArray[i] = new LimasSegiEmpat(sisi, tinggi);
        }

        // Menghitung total volume dan menampilkan sisi, tinggi serta volume setiap limas
        double totalVolume = 0;
        System.out.println("\nSisi, tinggi, dan volume setiap limas segi empat:");
        for (int i = 0; i < limasArray.length; i++) {
            System.out.println("Limas ke-" + (i + 1) + ":");
            System.out.println("Sisi: " + limasArray[i].getSisi());
            System.out.println("Tinggi: " + limasArray[i].getTinggi());
            System.out.println("Volume: " + limasArray[i].getVolume());
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
