// Kamyon bir aractir (Inheritance).
public class Kamyon extends Arac implements IBakimYapilabilir {
    private int yukKapasitesi;

    public Kamyon(String marka, int model, double gunlukUcret, int yukKapasitesi) {
        super(marka, model, gunlukUcret);
        this.yukKapasitesi = yukKapasitesi;
    }

    public Kamyon() {
    }

    public int getYukKapasitesi() {
        return yukKapasitesi;
    }

    public void setYukKapasitesi(int yukKapasitesi) {
        this.yukKapasitesi = yukKapasitesi;
    }

    @Override
    public void yakitTuketimi() {
        System.out.println("Kamyon yakit tuketimi: 18.0 L / 100km");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yuk Kapasitesi: " + yukKapasitesi + " kg");
    }

    @Override
    public void bakimYap() {
        System.out.println("Kamyon bakimi yapiliyor (Agir Vasita)...");
    }
}
