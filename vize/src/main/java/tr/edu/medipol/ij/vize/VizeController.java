package tr.edu.medipol.ij.vize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class VizeController {

    @GetMapping("/soru1")
    public List<String> soru1(String string) {
        String[] strings = string.split(" ");
        return Arrays.stream(strings).toList();
    }

    @GetMapping("/soru2")
    public String soru2(String string) {
        String[] strings = string.split(" ");
        String enUzunString = "";
        for (int i = 0; i < strings.length; i++) {
            String geciciString = strings[i];
            if (geciciString.length() > enUzunString.length()) {
                enUzunString = geciciString;
            }
        }
        return "En uzun kelime: " + enUzunString + " Uzunluğu: " + enUzunString.length();
    }

    @GetMapping("/soru3")
    public Integer soru3(int i) {
        String girdi = String.valueOf(i); // 1556452
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = girdi.length() - 1; j >= 0; j--) {
            stringBuilder.append(girdi.charAt(j));
        }
        return Integer.valueOf(stringBuilder.toString());
    }

    @GetMapping("/soru4")
    public String soru4(int i) {
        int[] dizi1 = new int[i]; // rastgele rakamlardan üretilen dizi
        int dizi2_sayi_degiskeni = 0;
        int dizi3_sayi_degiskeni = 0;
        for (int j = 0; j < dizi1.length; j++) { // dizi1 in icini doldur
            dizi1[j] = (int)(Math.random() * 9) + 1;
            if (dizi1[j]%2 == 0) {
                dizi3_sayi_degiskeni++;
            } else {
                dizi2_sayi_degiskeni++;
            }
        }
        System.out.println("Tek sayı sayısı : " + dizi2_sayi_degiskeni + " Çift sayı sayısı : " + dizi3_sayi_degiskeni);
        int dizi2[] = new int[dizi2_sayi_degiskeni]; // tek sayılar dizisi
        int[] dizi3 = new int[dizi3_sayi_degiskeni]; // çift sayılar dizisi
        dizi2_sayi_degiskeni = 0;
        dizi3_sayi_degiskeni = 0;
        for (int j = 0; j < dizi1.length; j++) {
            if (dizi1[j]%2 == 0) {
                dizi3[dizi3_sayi_degiskeni++] = dizi1[j];
            } else {
                dizi2[dizi2_sayi_degiskeni++] = dizi1[j];
            }
        }
        return Arrays.toString(dizi1) + Arrays.toString(dizi2) + Arrays.toString(dizi3);
    }

    @GetMapping("/soru5")
    public String soru5(int h, int r) {
        double hacim = 1d/3d * (Math.PI * r * r * h);
        hacim = Math.ceil(hacim * 1000) / 1000;
        return String.format("%.2f", hacim);
    }

    @GetMapping("/soru6")
    public String soru6(int i) {
        File file = null;
        boolean sonuc = false;
        try {
            file = new File("C:faktoriyel.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            int result = 1;
            bWriter.write("" + result + "\n");
            for (int j = 1; j <= i; j++) {
                result *= j;
                bWriter.write("" + result + "\n");
            }
            bWriter.close();
            sonuc = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (sonuc ? "Başarılı." : "Başarısız.") + " Dosya adresi : " + file.getAbsolutePath();
    }

    public String test(int k) {
        if (k > 0) {
            return "5";
        } else {
            return "klk";
        }
    }

}
