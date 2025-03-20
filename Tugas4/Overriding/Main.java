public class Main {
    public static void main(String[] args) {
        //membuat 3 objek domba tidak digunakan index karna menggunakan for-each 
        Domba[] dombaArray = {
            new Domba("Domba Garut", 3, 55.0, "Rumput", "Wol Tebal"),
            new Domba("Domba Merino", 2, 45.0, "Rumput", "Wol Halus"),
            new Domba("Domba Texel", 4, 60.0, "Rumput", "Wol Lembut")
        };

        // for each loop (mengakses semya elemen 1 per 1)
        // Loop melalui array dan mencetak objek Domba menggunakan toString()
        for (Domba domba : dombaArray) {
            System.out.println("=====================");
            System.out.println(domba);  // toString() otomatis dipanggil
            System.out.println("---------------------");
            domba.suara();              // overriding method
            domba.makan("Rumput");      // overloading 1 parameter
            domba.makan("Rumput", 3);   // overloading 2 parameter
            System.out.println("=====================\n");
        }
    }
}
