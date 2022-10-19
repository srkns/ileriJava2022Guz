public class Ders4 {

    public static void main(String[] args) {

        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String str : arabalar) {
            System.out.println(str);
        }
        //System.out.println(str);
        for (int i = 0; i < arabalar.length; i++) {
            String str = arabalar[i];
            System.out.println(str);
        }

        {
            String a = "aaaa";
        }

        //System.out.println(a);
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        //System.out.println("son i değeri : " + i);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        String[] cars_1, cars_3;
        String cars_2[], cars_4;
        int i,j,k,l[],m[],n[],e[];

        String[] cars_5 = {"Volvo", "BMW", "Ford", "Mazda"};
        String cars_6[] = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println();
        String[] sayilar = new String[10];
        sayilar[0] = "sda";
        sayilar[1] = "asdsa";
        sayilar[2] = "asdas";
        sayilar[3] = "asdasdasas";
        sayilar[4] = "asdasdas";

        for (int o = 0; o < sayilar.length; o++) {
            System.out.println(sayilar[o]);
        }
        System.out.println();
        String a = null;
        String b = "bbb";
        System.out.println(a);
        System.out.println(b);

        System.out.println();
        double[] listemiz = {1.9, 2.9, 3.4, 3.5};
        double toplam = 0;
        for (int ii = 0; ii < listemiz.length; ii++) {
            //toplam = toplam + listemiz[ii];
            toplam += listemiz[ii];
        }
        System.out.println("Toplam = " + toplam);

        System.out.println();

        int[][] sayilarimiz = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int c = 0; c < sayilarimiz.length; ++c) {
            for(int d = 0; d < sayilarimiz[c].length; ++d) {
                System.out.println("[" + c + "," + d + "]:" + sayilarimiz[c][d]);
            }
            System.out.println();
        }

        System.out.println();


    }

}