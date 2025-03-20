public class Vector3 {
    private int[] vektor = new int[3]; // Atribut array 3 elemen (x, y, z)

    // Konstruktor default untuk menginisialisasi vektor dengan nilai (0, 0, 0)
    public Vector3() {
        this.vektor[0] = 0;
        this.vektor[1] = 0;
        this.vektor[2] = 0;
    }

    // Konstruktor untuk menginisialisasi atribut dengan nilai spesifik
    public Vector3(int x, int y, int z) {
        this.vektor[0] = x;
        this.vektor[1] = y;
        this.vektor[2] = z;
    }

    // Overload untuk perkalian dengan skalar
    public Vector3 kali(int skalar) {
        return new Vector3(vektor[0] * skalar, vektor[1] * skalar, vektor[2] * skalar);
    }

    // Overload untuk perkalian dengan vektor (dot product)
    public int kali(Vector3 vektorLain) {
        return (this.vektor[0] * vektorLain.vektor[0]) +
               (this.vektor[1] * vektorLain.vektor[1]) +
               (this.vektor[2] * vektorLain.vektor[2]);
    }

    // Method untuk mencetak nilai vektor
    public void cetakVektor() {
        System.out.println("[" + vektor[0] + " " + vektor[1] + " " + vektor[2] + "]");
    }
}
