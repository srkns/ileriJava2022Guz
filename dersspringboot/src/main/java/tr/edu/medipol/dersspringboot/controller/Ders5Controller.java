package tr.edu.medipol.dersspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ders5Controller {

    @GetMapping("/")
    public String selamlama() {
        return "Selam Restçi!";
    }

    @GetMapping("selamla")
    public String selamla(String isim) {
        return "Selam " + isim + "!";
    }

    @GetMapping("selam")
    public ResponseEntity<String> selamDeKisiye(String isim) {
        return ResponseEntity.ok("Selam " + isim + "!");
    }

}
