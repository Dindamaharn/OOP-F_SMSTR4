public class MainSquare {
    public static void main(String[] args) {
        Square kotak1 = new Square();
        kotak1.setSisi(5);
        System.out.println("Sisi Persegi = "+kotak1.getSisi());
        System.out.println("Luas Persegi = "+kotak1.getLuas());
        System.out.println("Keliling Persegi ="+kotak1.getKeliling());

        System.out.println("-----------------------------------");
        Square kotak2 = new Square();
        kotak2.setSisi(3);
        System.out.println("Sisi Persegi = "+kotak2.getSisi());
        System.out.println("Luas Persegi = "+kotak2.getLuas());
        System.out.println("Keliling Persegi ="+kotak2.getKeliling());

        System.out.println("-----------------------------------");
        Square kotak3 = new Square();
        kotak3.setSisi(15);
        System.out.println("Sisi Persegi = "+kotak3.getSisi());
        System.out.println("Luas Persegi = "+kotak3.getLuas());
        System.out.println("Keliling Persegi ="+kotak3.getKeliling());

        System.out.println("-----------------------------------");
        Square kotak4 = new Square();
        kotak4.setSisi(1);
        System.out.println("Sisi Persegi = "+kotak4.getSisi());
        System.out.println("Luas Persegi = "+kotak4.getLuas());
        System.out.println("Keliling Persegi ="+kotak4.getKeliling());

    }
}
