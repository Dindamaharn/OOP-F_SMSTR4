public class MainLimasSegiEmpat {
    public static void main(String[] args) {
        // Menggunakan constructor tanpa parameter
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        limas1.SetSisi(5.0);
        limas1.SetTinggi(10.0);
        System.out.println("Volume limas1: " + limas1.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor dengan parameter
        LimasSegiEmpat limas2 = new LimasSegiEmpat(4.0, 8.0);
        System.out.println("Volume limas2: " + limas2.GetVolume());
        System.out.println("----------------------------------");

        // Menggunakan constructor dengan parameter lainnya
        LimasSegiEmpat limas3 = new LimasSegiEmpat(6.5, 12.5);
        System.out.println("Volume limas3: " + limas3.GetVolume());
        System.out.println("----------------------------------");
    }
}
