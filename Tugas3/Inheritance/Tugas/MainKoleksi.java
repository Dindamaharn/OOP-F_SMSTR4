package Tugas;

public class MainKoleksi {
    public static void main(String[] args) {
        // Membuat beberapa objek Buku, Majalah, dan Skripsi
        Koleksi koleksi1 = new Koleksi("Ensiklopedia Sains", "National Geographic", 2018);
        Koleksi koleksi2 = new Koleksi("Katalog Seni", "Museum Seni Modern", 2020);

        Buku buku1 = new Buku("Pemrograman Java", "Andi", "Erlangga", 2021);
        Buku buku2 = new Buku("Pemrograman Python", "Budi", "Gramedia", 2022);

        Majalah majalah1 = new Majalah("Majalah Teknologi", "Edisi 15", "Gramedia", 2020);
        Majalah majalah2 = new Majalah("Majalah Sains", "Edisi 22", "Tempo", 2019);

        Skripsi skripsi1 = new Skripsi("23081010132", "Sistem Prediksi Kelulusan dengan Naive Bayes", "Dinda", "UPNVJT", 2023);
        Skripsi skripsi2 = new Skripsi("0723040108", "Analisis Pengelasan SMAW pada Sambungan Baja", "Arda", "PPNS", 2024);

        // Cetak Koleksi
        System.out.println("======= Koleksi =======");
        System.out.println(koleksi1.toString() + "\n");
        System.out.println(koleksi2.toString() + "\n");

        // Cetak Buku
        System.out.println("======= Buku =======");
        System.out.println(buku1.toString() + "\n");
        System.out.println(buku2.toString() + "\n");

        // Cetak Majalah
        System.out.println("======= Majalah =======");
        System.out.println(majalah1.toString() + "\n");
        System.out.println(majalah2.toString() + "\n");

        // Cetak Skripsi
        System.out.println("======= Skripsi =======");
        System.out.println(skripsi1.toString() + "\n");
        System.out.println(skripsi2.toString() + "\n");
    }
}
