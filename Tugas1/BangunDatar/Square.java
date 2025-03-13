public class Square {
    // identifikasi atribute
    private int sisi;
    
    // identifikasi sisi
    public void setSisi(int sisi){
        this.sisi = sisi; // this.sisi mengacu pada atribut kelasnya 
    }

    // mengambil nilai
    public int getSisi(){
        return sisi;
    }

    public int getLuas(){
        int luas = this.sisi * this.sisi;
        return luas;
    }

    public int getKeliling(){
        int keliling = 4 * this.sisi;
        return keliling;
    }
}
