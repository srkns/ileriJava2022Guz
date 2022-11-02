package tr.edu.medipol.ders6springboot.data;

import java.util.List;

public class Yazar {

    private String ad;
    private String soyad;
    private List<String> kitaplari;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public List<String> getKitaplari() {
        return kitaplari;
    }

    public void setKitaplari(List<String> kitaplari) {
        this.kitaplari = kitaplari;
    }

}
