//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Once sirketi kurduk
        KiralamaSirketi sirket = new KiralamaSirketi();

        // 2. Ornek araclari (nesneleri) olusturduk
        Otomobil oto1 = new Otomobil("Audi", 2026, 1200, 4);
        Kamyon kamyon1 = new Kamyon("Volvo", 2020, 2500, 25);

        Otomobil oto2 = new Otomobil("Bently", 2021, 3200, 4);
        Kamyon kamyon2 = new Kamyon("Mercedes", 2016, 2500, 30);

        Otomobil oto3 = new Otomobil("Ford", 2022, 1200, 4);
        Kamyon kamyon3 = new Kamyon("Fiat", 2023, 2500, 20);

        // 3. Araclari galeriye ekledik (Polimorfizm)
        sirket.aracEkle(oto1);
        sirket.aracEkle(kamyon1);
        sirket.aracEkle(oto2);
        sirket.aracEkle(kamyon2);
        sirket.aracEkle(oto3);
        sirket.aracEkle(kamyon3);

        // 4. Hepsini listeledik
        sirket.araclariListele();

        // 5. Kiralama ve bakim testi
        sirket.aracKirala(oto1);
        sirket.aracKirala(kamyon1);

    }
}