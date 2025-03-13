public class MainBola {
    public static void main(String[] args) {
        // Membuat array of object dengan 5 objek Bola
        Bola[] bolaArray = new Bola[5];

        // Mengisi array dengan objek Bola menggunakan loop
        for (int i = 0; i < bolaArray.length; i++) {
            double radius = i + 1; 
        
            bolaArray[i] = new Bola(radius);
        }
        
        // Menghitung total volume dan menampilkan volume serta radius setiap bola
        double totalVolume = 0;
        System.out.println("\nVolume dan radius setiap bola:");
        for (int i = 0; i < bolaArray.length; i++) {
            System.out.println("Bola ke-" + (i + 1) + ":");
            System.out.println("Radius: " + bolaArray[i].getRadius()); 
            System.out.println("Volume: " + bolaArray[i].getVolume());
            System.out.println("----------------------");
        }

        // Menggunakan enhanced loop untuk menghitung total volume
        for (Bola bola : bolaArray) {
            totalVolume += bola.getVolume();
        }

        // Menghitung rata-rata volume
        double rataRataVolume = totalVolume / bolaArray.length;

        // Menampilkan rata-rata volume
        System.out.println("Rata-rata volume dari bola: " + rataRataVolume);
    }
}
