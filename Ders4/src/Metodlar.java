/*
Bu sınıf deneme için yapılmıştır.
3 tane metod içerir
#ilkKisim()
#ikinciKisim()
#ucuncuKisim()
 */
public class Metodlar {

    public static void main(String[] args) {
        new Metodlar();
    }

    public Metodlar() {
        System.out.println("Metodlardan selamlar...");

        ilkKisim();
        //String musteriLimiti = ikinciKisim();
        //ucuncuKisim(musteriLimiti);
        ucuncuKisim(ikinciKisim());
        dorduncuKisim("Medipol Üniversitesi", 345252);

    }

    /*
     burası karsilama metodu.
     kullanıcıdan veri alır
     */
    public void ilkKisim() {
        System.out.println("Birinci kisim calismaya basliyor");
        System.out.println("Sistem değişkenleri ayarlanıyor....");
        System.out.println("Birinci kisim calismayı bitirdi");
    }

    private String ikinciKisim() {
        System.out.println("İkinci kisim calismaya basliyor");
        String limit = "1500";
        // ...
        System.out.println("İkinci kisim calismayı bitirdi");
        return limit;
    }

    private void ucuncuKisim(String limit) {
        System.out.println("Ucuncu kisim calismaya basliyor");
        // musteriye gönder
        System.out.println("Ucuncu kisim calismayı bitirdi");
    }

    private void dorduncuKisim(String musteriAdi, int adresKodu) {
        // ptt mektup içeriği yolla
        System.out.println(musteriAdi + " adlı müşterinin " + adresKodu + " kodlu adresine mektup gönderimi yapıldı...");
    }

    private boolean dorduncuKisim() {
        // ...
        return true;
    }

}
