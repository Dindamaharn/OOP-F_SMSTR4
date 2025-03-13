public class MainBalok {
    public static void main(String[] args) {
        // Membuat array of object dengan 5 objek Balok
        Balok[] balokArray = new Balok[5];

        // Mengisi array dengan objek Balok menggunakan loop
        for (int i = 0; i < balokArray.length; i++) {
            double panjang = i + 2; 
            double lebar = i + 3;   
            double tinggi = i + 4;  

            balokArray[i] = new Balok(panjang, lebar, tinggi);
        }

        // Menghitung total volume dan menampilkan panjang, lebar, tinggi serta volume setiap balok
        double totalVolume = 0;
        System.out.println("\nPanjang, lebar, tinggi, dan volume setiap balok:");
        for (int i = 0; i < balokArray.length; i++) {
            System.out.println("Balok ke-" + (i + 1) + ":");
            System.out.println("Panjang: " + balokArray[i].getPanjang());
            System.out.println("Lebar: " + balokArray[i].getLebar());
            System.out.println("Tinggi: " + balokArray[i].getTinggi());
            System.out.println("Volume: " + balokArray[i].getVolume());
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
