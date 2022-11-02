package tr.edu.medipol.ders6springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.ders6springboot.data.IslemRequest;
import tr.edu.medipol.ders6springboot.data.Yazar;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Ders6Controller {

    @GetMapping("/selamlama/{kitapId}")
    public String selamVer(@RequestParam(defaultValue = "İnsan!") String kullaniciAdi) {
        return "İyi akşamlar " + kullaniciAdi;
    }

    @PostMapping("/yazarvekitaplistele")
    public Yazar yazarvekitapliste() {

        Yazar yazar1 = new Yazar();
        yazar1.setAd("Nebi");
        yazar1.setSoyad("Muhammedov");
        List<String> kitaplar = new ArrayList<>();
        kitaplar.add("Kış Soğuğu");
        kitaplar.add("Türkmenistan Ovaları");
        yazar1.setKitaplari(kitaplar);

        return yazar1;
    }

    @GetMapping("/yazarvekitaplistele")
    public ResponseEntity<Yazar> yazarvekitaplisteGET() {

        Yazar yazar = new Yazar();
        yazar.setAd("Nebi");
        yazar.setSoyad("Muhammedov");
        List<String> kitaplar = new ArrayList<>();
        kitaplar.add("Kış Soğuğu");
        kitaplar.add("Türkmenistan Ovaları");
        yazar.setKitaplari(kitaplar);

        return ResponseEntity.ok(yazar);
    }

    @GetMapping("/yazarlarivekitaplarilistele")
    public List<Yazar> yazarlarivekitaplarilistele() {
        List<Yazar> sonucYazarListesi = new ArrayList<>();

        Yazar yazar1 = new Yazar();
        yazar1.setAd("Nebi");
        yazar1.setSoyad("Muhammedov");
        List<String> kitaplar = new ArrayList<>();
        kitaplar.add("Kış Soğuğu");
        kitaplar.add("Türkmenistan Ovaları");
        yazar1.setKitaplari(kitaplar);

        Yazar yazar2 = new Yazar();
        yazar2.setAd("Simyaci");
        yazar2.setSoyad("Amca");
        List<String> kitaplar2 = new ArrayList<>();
        kitaplar2.add("Organik Bileşikler");
        kitaplar2.add("Canlıların Kimyası");
        yazar2.setKitaplari(kitaplar2);

        sonucYazarListesi.add(yazar1);
        sonucYazarListesi.add(yazar2);
        return sonucYazarListesi;
    }

    @GetMapping("/topla")
    public Integer toplama(IslemRequest toplamaIslemiRequest) {
        return toplamaIslemiRequest.getSayi1() + toplamaIslemiRequest.getSayi2();
    }

    @PostMapping("/cikar")
    public Integer cikarPost(@RequestBody IslemRequest cikarmaIslemRequest) {
        return cikarmaIslemRequest.getSayi1() - cikarmaIslemRequest.getSayi2();
    }

    @PutMapping("/carp")
    public Integer carp(@RequestBody IslemRequest carpIslemRequest) {
        return carpIslemRequest.getSayi1() * carpIslemRequest.getSayi2();
    }


}
