// Arac sinifi genel bir taslak oldugu icin abstract yaptik.
// Tek basina nesne uretilemez, sadece miras alinabilir.
public abstract class Arac {

    // Kapsulleme (Encapsulation) icin degiskenleri private yaptik.
    // Sadece getter ve setter metotlariyla erisilebilir.
    private String marka;
    private int model;
    private double gunlukUcret;

    public Arac(String marka, int model, double gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.gunlukUcret = gunlukUcret;
    }

    public Arac() {

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    // Soyutlama (Abstraction): Her aracin yakit tuketimi farklidir.
    // Bu yuzden alt siniflar bu metodu kendine gore doldurmak zorundadir.
    public abstract void yakitTuketimi();

    public void bilgileriGoster() {
        System.out.println(
                "Marka: " + marka +
                        ", Model: " + model +
                        ", Gunluk Ucret: " + gunlukUcret);
    }

}
