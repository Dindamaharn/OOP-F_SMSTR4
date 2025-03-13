public class MainRectangle {
    
    public static void main(String[] args) {
        Rectangle persegiPanjang1 = new Rectangle(); 
            
        persegiPanjang1.setPanjang(5);
        persegiPanjang1.setLebar(3);
            
        System.out.println("Panjang: " + persegiPanjang1.getPanjang());  
        System.out.println("Lebar: " + persegiPanjang1.getLebar());  
        System.out.println("Luas Rectangle: " + persegiPanjang1.getLuas());
        System.out.println("Keliling Rectangle: " + persegiPanjang1.getKeliling());
    
        System.out.println("-----------------------------------");

        Rectangle persegiPanjang2 = new Rectangle(); 
            
        persegiPanjang2.setPanjang(4);
        persegiPanjang2.setLebar(3);
            
        System.out.println("Panjang: " + persegiPanjang2.getPanjang());  
        System.out.println("Lebar: " + persegiPanjang2.getLebar());  
        System.out.println("Luas Rectangle: " + persegiPanjang2.getLuas());
        System.out.println("Keliling Rectangle: " + persegiPanjang2.getKeliling());
    
        System.out.println("-----------------------------------");

        Rectangle persegiPanjang3 = new Rectangle(); 
            
        persegiPanjang3.setPanjang(6);
        persegiPanjang3.setLebar(3);
            
        System.out.println("Panjang: " + persegiPanjang3.getPanjang());  
        System.out.println("Lebar: " + persegiPanjang3.getLebar());  
        System.out.println("Luas Rectangle: " + persegiPanjang3.getLuas());
        System.out.println("Keliling Rectangle: " + persegiPanjang3.getKeliling());
    
        System.out.println("-----------------------------------");
    }
}
