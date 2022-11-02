package tr.edu.medipol.iju.ikincibolum;

class Sinif2 {

  int y = 15;

  public static void main(String[] args) {
    Sinif1 sinifOrnek = new Sinif1();
    sinifOrnek.setX(16);
    System.out.println(sinifOrnek.x);
    System.out.println(sinifOrnek.xKare());
    System.out.println(Sinif1.sinif());
    Sinif2 sinif2 = new Sinif2();
    System.out.println(sinif2.y);
    // System.out.println(Sinif2.y); // uygulanamaz


  }
}
