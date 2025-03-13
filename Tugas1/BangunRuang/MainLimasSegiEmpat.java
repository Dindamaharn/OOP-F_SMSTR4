public class MainLimasSegiEmpat {
    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        limas1.SetSisi(6);
        limas1.SetTinggi(12);
        limas1.ComputeAndSetVolume();

        System.out.println("Volume Limas Segi Empat: " + limas1.GetVolume());
        System.out.println("---------------------------------------------" );

        LimasSegiEmpat limas2 = new LimasSegiEmpat();
        limas2.SetSisi(3);
        limas2.SetTinggi(10);
        limas2.ComputeAndSetVolume();

        System.out.println("Volume Limas Segi Empat: " + limas2.GetVolume());
        System.out.println("---------------------------------------------" );

        LimasSegiEmpat limas3 = new LimasSegiEmpat();
        limas3.SetSisi(3);
        limas3.SetTinggi(15);
        limas3.ComputeAndSetVolume();

        System.out.println("Volume Limas Segi Empat: " + limas3.GetVolume());
    }
}
