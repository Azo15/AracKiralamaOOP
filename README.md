# Araç Kiralama Sistemi (OOP Ders Projesi)

Bu proje, Nesne Yönelimli Programlama (OOP) dersi vize/final sınavına hazırlık amacıyla, temel OOP prensiplerini göstermek için hazırlanmış basit bir Java konsol uygulamasıdır.

## Projenin Amacı
Bir araç kiralama şirketinin basit bir simülasyonunu yaparak; Kapsülleme, Kalıtım, Soyutlama ve Polimorfizm kavramlarının pratikte nasıl kullanıldığını sergilemektir.

## Kullanılan OOP Kavramları

### 1. Soyutlama (Abstraction)
- **`Arac` Sınıfı:** Soyut (`abstract`) bir sınıf olarak tasarlandı. Çünkü "Araç" tek başına çok genel bir kavramdır ve doğrudan nesne olarak üretilmemelidir.
- **`yakitTuketimi()` Metodu:** Her aracın yakıt tüketimi farklı olduğu için bu metot soyut bırakıldı ve alt sınıfların bunu doldurması zorunlu kılındı.

### 2. Kapsülleme (Encapsulation)
- Sınıf değişkenleri (`marka`, `model`, `gunlukUcret`) `private` yapılarak dışarıdan doğrudan erişim engellendi.
- Erişim sadece `public` olan **Getter** ve **Setter** metotları üzerinden kontrollü bir şekilde sağlanıyor.

### 3. Kalıtım (Inheritance)
- **`Otomobil` ve `Kamyon`:** Her ikisi de `Arac` sınıfından türetildi (`extends`). Böylece `Arac` sınıfındaki ortak özellikleri (marka, model vb.) tekrar yazmak zorunda kalmadık.

### 4. Polimorfizm (Polymorphism)
- **Liste Kullanımı:** `KiralamaSirketi` sınıfında araçlar `List<Arac>` tipinde tutuluyor. Bu sayede listenin içine hem `Otomobil` hem de `Kamyon` nesneleri atılabiliyor.
- **Metot Ezme (Overriding):** `bilgileriGoster()` ve `yakitTuketimi()` metotları alt sınıflarda yeniden yazılarak her aracın kendi verisini göstermesi sağlandı.

### 5. Arayüz (Interface)
- **`IBakimYapilabilir`:** Her araca değil, sadece belirli araçlara bakım yapılabilir (örn: Otomobil ve Kamyon). Bu yetenek bir interface (arayüz) ile sınıflara kazandırıldı.

## Nasıl Çalıştırılır?

Proje klasöründeyken terminalden şu komutları çalıştırabilirsiniz:

**Derlemek için:**
```bash
javac src/*.java
```

**Çalıştırmak için:**
```bash
java -cp src Main
```

