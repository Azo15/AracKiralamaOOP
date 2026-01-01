import java.util.ArrayList;
import java.util.List;

public class KiralamaSirketi {
    // Polimorfizm: Liste genel 'Arac' tipinde oldugu icin hem Otomobil hem Kamyon
    // tutabilir.
    private List<Arac> araclar;

    public KiralamaSirketi() {
        araclar = new ArrayList<>();
    }

    public void aracEkle(Arac arac) {
        araclar.add(arac);
        System.out.println("Araci Eklendi");
    }

    public void araclariListele() {
        for (Arac arac : araclar) {
            arac.bilgileriGoster();
            arac.yakitTuketimi();
            System.out.println("--------------");
        }
    }

    // Polimorfizm: Parametre olarak 'Arac' geliyor, hangi alt sinif oldugu fark
    // etmez.
    public void aracKirala(Arac arac) {
        System.out.println("Arac kiralandi.");

        if (arac instanceof IBakimYapilabilir) {
            ((IBakimYapilabilir) arac).bakimYap();
        }
    }

}
