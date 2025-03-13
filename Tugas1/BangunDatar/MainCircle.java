public class MainCircle {
    public static void main(String[] args) {
        Circle lingkaran1 = new Circle(); 
            
        lingkaran1.setRadius(5.0);
            
        System.out.println("Radius: " + lingkaran1.getRadius());   
        System.out.println("Luas Lingkaran: " + lingkaran1.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran1.getKeliling());
    
        System.out.println("-----------------------------------");

        Circle lingkaran2 = new Circle(); 
            
        lingkaran2.setRadius(6.0);
            
        System.out.println("Radius: " + lingkaran2.getRadius());   
        System.out.println("Luas Lingkaran: " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran2.getKeliling());
    
        System.out.println("-----------------------------------");

        Circle lingkaran3 = new Circle(); 
            
        lingkaran3.setRadius(8.0);
            
        System.out.println("Radius: " + lingkaran2.getRadius());   
        System.out.println("Luas Lingkaran: " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran2.getKeliling());

    }
}

