public class MainElipse {
    public static void main(String[] args) {
        Elipse oval1 = new Elipse(); 
        
        oval1.setsemiMajorAxis(5.0);
        oval1.setsemiMinorAxis(3.0);
        
        System.out.println("Semi Major Axis:" + oval1.getsemiMajorAxis());  
        System.out.println("Semi Minor Axis:" + oval1.getsemiMinorAxis());  
        System.out.println("Luas Elips:" + oval1.getLuas());
        System.out.println("Keliling Elips:" + oval1.getKeliling());

        System.out.println("-----------------------------------");
        Elipse oval2 = new Elipse(); 
        
        oval2.setsemiMajorAxis(4.0);
        oval2.setsemiMinorAxis(2.0);
        
        System.out.println("Semi Major Axis:" + oval2.getsemiMajorAxis());  
        System.out.println("Semi Minor Axis:" + oval2.getsemiMinorAxis());  
        System.out.println("Luas Elips:" + oval2.getLuas());
        System.out.println("Keliling Elips:" + oval2.getKeliling());

        System.out.println("-----------------------------------");
        Elipse oval3 = new Elipse(); 
        
        oval3.setsemiMajorAxis(5.0);
        oval3.setsemiMinorAxis(8.0);
        
        System.out.println("Semi Major Axis:" + oval3.getsemiMajorAxis());  
        System.out.println("Semi Minor Axis:" + oval3.getsemiMinorAxis());  
        System.out.println("Luas Elips:" + oval3.getLuas());
        System.out.println("Keliling Elips:" + oval3.getKeliling());
    }

}