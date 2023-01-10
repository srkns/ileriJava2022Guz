package tr.edu.medipol.ilerijava.ders8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.edu.medipol.ilerijava.ders8.dto.KullaniciDTO;
import tr.edu.medipol.ilerijava.ders8.entity.Kullanici;
import tr.edu.medipol.ilerijava.ders8.repository.KullaniciRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class KullaniciServisi {

    @Autowired
    KullaniciRepository kullaniciRepository;

    public Kullanici kullaniciEkle(KullaniciDTO kullaniciDTO) {
        Kullanici kullanici = new Kullanici(kullaniciDTO.getAd(), kullaniciDTO.getSoyad(), kullaniciDTO.getYas());
        kullanici = kullaniciRepository.save(kullanici);
        return kullanici;
    }

    public Kullanici kullaniciGetir(long id) {
        Kullanici kullanici = kullaniciRepository.findById(id).get();
        return kullanici;
    }

    public boolean kullaniciSil(long id) {
        kullaniciRepository.deleteById(id);
        return true;
    }

    public String kullaniciGuncelle(Long id, String ad) {
        Kullanici kullanici = kullaniciRepository.findById(id).get();
        String eskiKullaniciAdi = kullanici.getAd();
        kullanici.setAd(ad);
        kullaniciRepository.save(kullanici);
        return eskiKullaniciAdi;
    }

    public List<Kullanici> kullanicilariListele() {
        return (ArrayList<Kullanici>)kullaniciRepository.findAll();
    }

}
