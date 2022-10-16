public class Ders3 {
    public static void main(String[] args) {

        int i = 5; // basit
        Integer integer = Integer.valueOf("8");
        String test = new String("Medipol Üniversitesi İstanbul");
        System.out.println("Metin:" + test);
        System.out.println("Metnin uzunluğu:" + test.length());
        System.out.println(test.charAt(6));
        System.out.println(test.split(" ")[2]);

        System.out.println("integer:" + integer);

        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt);

        String metin = "SHFKJAFA.ASDAKLDAS2.ASD2EA.11.2DAD.ASDADDDDDSDA.ASADSA.11";
        System.out.println(metin.substring(metin.lastIndexOf(".") + 1));


//        String txt2 = "Please locate where 'locate' locate occurs!";
//        System.out.println(txt2.indexOf("locate"));
//        System.out.println(txt2.lastIndexOf("locate"));



        String txt3 = "\"We are the so-called \"Vikings\" from the north.\"";
        System.out.println(txt3);

        System.out.println(Math.random());

        int time = 4;
        String result = (time < 18) ? (time < 5 ? "Good night" : "Good day.") : "Good evening.";
        System.out.println(result);

        i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("\n");

        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        System.out.println("\n");

        int j = 3;
        for (j = 0; j < 10; j = j + 2) {
            System.out.println(j);
        }
        System.out.println("j=" + j);

    }
}