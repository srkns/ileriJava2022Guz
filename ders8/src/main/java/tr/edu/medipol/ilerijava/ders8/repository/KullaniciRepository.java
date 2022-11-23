package tr.edu.medipol.ilerijava.ders8.repository;

import org.springframework.data.repository.CrudRepository;
import tr.edu.medipol.ilerijava.ders8.entity.Kullanici;

public interface KullaniciRepository extends CrudRepository<Kullanici, Long> {

    Kullanici findByAd(String ad);

}
