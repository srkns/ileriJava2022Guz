package tr.edu.medipol.ilerijava.ders8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.ilerijava.ders8.entity.Kullanici;
import tr.edu.medipol.ilerijava.ders8.repository.KullaniciRepository;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Ders8Controller {

    @Autowired
    KullaniciRepository kullaniciRepository;

//    @GetMapping("/")
//    public String selam() {
//        return "" + ZonedDateTime.now();
//    }

    @PostMapping("/kullaniciOlustur")
    public Kullanici kullaniciOlustur(String ad, String soyad, int yas) {
        System.out.println("kullaniciOlustur metodu cagirildi. Ad:" + ad);
        Kullanici kullanici = new Kullanici(ad, soyad, yas);
        kullanici = kullaniciRepository.save(kullanici);
        return kullanici;
    }

    @GetMapping("/kullaniciGetir")
    public Optional<Kullanici> kullaniciGetir(Long id) {
        Optional<Kullanici> kullanici = kullaniciRepository.findById(id);
        return kullanici;
    }

    @DeleteMapping("/kullaniciSil")
    public String kullaniciSil(Long id) {
        kullaniciRepository.deleteById(id);
        return "Kullanici silindi";
    }

    @PutMapping("/kullaniciGuncelle")
    public String kullaniciGuncelle(Long id, String ad) {
        Kullanici kullanici = kullaniciRepository.findById(id).get();
        String eskiKullaniciAdi = kullanici.getAd();
        kullanici.setAd(ad);
        kullanici = kullaniciRepository.save(kullanici);
        return "Kullanıcı adı güncellendi. Eski kullanıcı : " + eskiKullaniciAdi + " Yeni kullanıcı adı: " + kullanici.getAd();
    }

    @GetMapping("/tumKullanicilariListele")
    public List<Kullanici> tumKullanicilariListele() {
        System.out.println("tumKullanicilariListele metodu cagirildi(JAVA)");
        ArrayList<Kullanici> kullaniciListesi = (ArrayList<Kullanici>)kullaniciRepository.findAll();
        return kullaniciListesi;
    }

}
