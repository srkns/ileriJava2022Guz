package tr.edu.medipol.ij.kisisunucusu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.medipol.ij.kisisunucusu.model.Kisi;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KisiController {

    @GetMapping("/kisilistele")
    public List<Kisi> listele() {
        System.out.println("Kisi Sunucusu kisilistele servisi cagirildi.");
        Kisi kisi1 = new Kisi("Orhan", "Pamuk");
        Kisi kisi2 = new Kisi("Necip", "Fazıl");
        List<Kisi> kisiler = new ArrayList<>();
        kisiler.add(kisi1);
        kisiler.add(kisi2);
        return kisiler;
    }

}
