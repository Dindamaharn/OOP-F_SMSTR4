public class Main {
    public static void main(String[] args) {
        // Membuat objek vektor
        Vector3 vektor1 = new Vector3(1, 2, 3);
        Vector3 vektor2 = new Vector3(4, 5, 6);

        // Mencetak vektor pertama dan kedua
        System.out.print("Vektor 1: ");
        vektor1.cetakVektor();
        System.out.print("Vektor 2: ");
        vektor2.cetakVektor();

        // Mengalikan vektor1 dengan skalar
        Vector3 hasilKaliSkalar = vektor1.kali(2);
        System.out.print("Vektor 1 * 2: ");
        hasilKaliSkalar.cetakVektor();

        // Mengalikan vektor1 dengan vektor2 (dot product)
        int hasilKaliVektor = vektor1.kali(vektor2);
        System.out.println("Vektor 1 . Vektor 2 (dot product): " + hasilKaliVektor);
    }
}
