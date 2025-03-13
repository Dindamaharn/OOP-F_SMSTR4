public class Rectangle {
    //identifikasi atribute
    private int panjang, lebar;

    //setter panjang
    public void setPanjang (int panjang){
        this.panjang = panjang;
    }
    
    //setter lebar
    public void setLebar (int lebar){
        this.lebar = lebar;
    }

    //getter panjang
    public int getPanjang() {
        return panjang;
    }

    //getter leber
    public int getLebar() {
        return lebar;
    }

    // Metode untuk menghitung luas rectangle
    public int getLuas() {
        // Rumus luas rectangle: panjang * lebar
        int luas =  this.panjang * this.lebar;
        return luas;
    }

    public int getKeliling() {
        // keliling: 2 * (panjang + lebar)
        int keliling = 2 * (this.panjang + this.lebar);
        return keliling;
    }

}