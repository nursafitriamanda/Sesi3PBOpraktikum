
package mobil;
public class Mobil {
    protected String merk;
    protected int harga, kecepatan;
    
    /**
     * Konstruktor
     * Method yang namanya = nama class
     * Tidak boleh menggunakan void
     * Tidak boleh ada return value
     * Dijalankan hanya 1x
     * digunakan untuk inisialisasi
     * @param brand 
     */
    
    Mobil (String merk, int harga, int kecepatan){
        this.merk = merk;
        this.harga = harga;
        this.kecepatan = kecepatan;
    }
      
    Mobil (){
        
    }
    void setMerk (String brand){
       merk = brand;
    } 
    
    void setHargaKecepatan(int harga, int kecepatan){
        this.harga = harga;
        this.kecepatan = kecepatan;
    }
    
    String getMerk (){ 
        return merk;
    }
    
    int getHarga () {
        return harga;
    }
    
    int getKecepatan(){
        return kecepatan;
    }
    
    void infoMobil(){
        System.out.println("Merk Mobil:" + getMerk());
        System.out.println("Harga:" + getHarga());
        System.out.println("Kecepatan:" + getKecepatan());
        System.out.println("-------------------------");
    }
}