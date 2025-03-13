public class MainKubus {

    public static void main(String[] args) {
        Kubus kubus1 = new Kubus();
        kubus1.SetSisi(4);
        kubus1.ComputeAndSetVolume();

        System.out.println("Volume Kubus: " + kubus1.GetVolume());
        
        System.out.println("-------------------------");

        Kubus kubus2 = new Kubus();
        kubus2.SetSisi(5);
        kubus2.ComputeAndSetVolume();

        System.out.println("Volume Kubus: " + kubus2.GetVolume());
        
        System.out.println("-------------------------");

        Kubus kubus3 = new Kubus();
        kubus3.SetSisi(6);
        kubus3.ComputeAndSetVolume();

        System.out.println("Volume Kubus: " + kubus3.GetVolume());
        
    }
}