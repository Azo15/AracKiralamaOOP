// Arac sinifindan miras aldik (Inheritance) ve Bakim yapilabilir ozelligi ekledik.
public class Otomobil extends Arac implements IBakimYapilabilir {

    private int kapiSayisi;

    public Otomobil(String marka, int model, double gunlukUcret, int kapiSayisi) {
        super(marka, model, gunlukUcret);
        this.kapiSayisi = kapiSayisi;
    }

    public Otomobil() {
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public void bakimYap() {
        System.out.println("Otomobil bakimi yapiliyor...");
    }

    // Polimorfizm: Arac sinifindaki soyut metodu kendimize gore doldurduk.
    @Override
    public void yakitTuketimi() {
        System.out.println("Otomobil yakit tuketimi: 7.5 L / 100km");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kapi Sayisi: " + kapiSayisi);
    }
}
