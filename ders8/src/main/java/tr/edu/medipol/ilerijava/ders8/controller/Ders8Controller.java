package tr.edu.medipol.ilerijava.ders8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.ilerijava.ders8.dto.KullaniciDTO;
import tr.edu.medipol.ilerijava.ders8.dto.KullaniciGuncelleDTO;
import tr.edu.medipol.ilerijava.ders8.entity.Kullanici;
import tr.edu.medipol.ilerijava.ders8.service.KullaniciServisi;

import java.util.List;

@RestController
public class Ders8Controller {

    @Autowired
    KullaniciServisi kullaniciServisi;

    @PostMapping("/kullaniciOlustur")
    public Kullanici kullaniciOlustur(@RequestBody KullaniciDTO kullaniciDTO) {
        System.out.println("kullaniciOlustur metodu cagirildi. Gelen Nesne:" + kullaniciDTO);
        return kullaniciServisi.kullaniciEkle(kullaniciDTO);
    }

    @GetMapping("/kullaniciGetir")
    public Kullanici kullaniciGetir(Long id) {
        return kullaniciServisi.kullaniciGetir(id);
    }

    @DeleteMapping("/kullaniciSil")
    public String kullaniciSil(Long id) {
        kullaniciServisi.kullaniciSil(id);
        return "Kullanici silindi";
    }

    @PutMapping("/kullaniciGuncelle")
    public String kullaniciGuncelle(KullaniciGuncelleDTO kullaniciGuncelleDTO) {
        System.out.println("kullaniciOlustur metodu cagirildi. Gelen Nesne:" + kullaniciGuncelleDTO);
        String eskiKullaniciAdi = kullaniciServisi.kullaniciGuncelle(kullaniciGuncelleDTO.getId(), kullaniciGuncelleDTO.getAd());
        return "Kullanıcı adı güncellendi. Eski kullanıcı adı : " + eskiKullaniciAdi + " Yeni kullanıcı adı: " + kullaniciGuncelleDTO.getAd();
    }

    @GetMapping("/tumKullanicilariListele")
    public List<Kullanici> tumKullanicilariListele() {
        System.out.println("tumKullanicilariListele metodu cagirildi(JAVA)");
        return kullaniciServisi.kullanicilariListele();
    }

}
