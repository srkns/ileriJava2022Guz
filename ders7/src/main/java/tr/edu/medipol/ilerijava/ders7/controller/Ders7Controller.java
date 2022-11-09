package tr.edu.medipol.ilerijava.ders7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.medipol.ilerijava.ders7.data.SelamPostData;
import tr.edu.medipol.ilerijava.ders7.data.SelamPostData2;

@RestController
public class Ders7Controller {

    @GetMapping("/")
    public String selam() {
        return "Spring Boot ile Merhaba Dünya!";
    }

    @GetMapping("/selam")
    public String selamlama(String name, String surname) {
        return "Spring Boot ile Merhaba " + name + " " + surname + "!";
    }

    @PostMapping("/selam")
    public String selamlamaPost(@RequestBody SelamPostData selamPostData) {
        return "Spring Boot ile Merhaba " + selamPostData.isim + " " + selamPostData.soyisim + "!";
    }

    @PostMapping("/selam2")
    public String selamlamaPost2(@RequestBody SelamPostData2 selamPostData2) {
        return "Spring Boot ile Merhaba " + selamPostData2.getYas() + " " + selamPostData2.getDogumYeri() + "!";
    }

}
