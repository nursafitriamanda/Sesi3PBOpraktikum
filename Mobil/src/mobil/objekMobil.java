package mobil;

public class objekMobil  {
    
    public static void main (String[] args) {
        MobilDiesel md = new MobilDiesel ("Toyota", 200, 0, "solar");
        MobilBensin mb = new MobilBensin ("Toyota", 200, 0, "solar");
        
        md.infoMobilDiesel();
        mb.infoMobilBensin();
    }
      
}